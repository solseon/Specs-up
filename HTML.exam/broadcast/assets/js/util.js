(function($) {

	/**
	 * Generate an indented list of links from a nav. Meant for use with panel().
	 * @return {jQuery} jQuery object.
	 */

	/**
   * 	navList: 내비게이션 목록을 HTML 문자열로 생성
   * - <li>의 깊이에 따라 들여쓰기를 계산하고, 각 <a> 태그를 새롭게 구성
   */
	$.fn.navList = function() {

		var	$this = $(this);	// 현재 선택된 요소
			$a = $this.find('a'), // 내부의 모든 <a> 태그
			b = [];				// 결과 문자열을 담을 배열

		$a.each(function() {

			var	$this = $(this),
				indent = Math.max(0, $this.parents('li').length - 1),	// 들여쓰기 깊이
				href = $this.attr('href'),
				target = $this.attr('target');

			// 새롭게 구성된 <a> 태그 문자열을 배열에 추가	
			b.push(
				'<a ' +
					'class="link depth-' + indent + '"' +
					( (typeof target !== 'undefined' && target != '') ? ' target="' + target + '"' : '') +
					( (typeof href !== 'undefined' && href != '') ? ' href="' + href + '"' : '') +
				'>' +
					'<span class="indent-' + indent + '"></span>' +
					$this.text() +
				'</a>'
			);

		});

		return b.join('');

	};

	/**
   	 *  panel: 요소를 사이드 패널로 변환 (토글 가능한 메뉴, 모달 등)
	 * @param {object} userConfig 
	 * @return {jQuery} 
	 */
	$.fn.panel = function(userConfig) {

		// 요소가 없으면 종료
			if (this.length == 0)
				return $this;

		// 여러 요소일 경우 각 요소에 panel 기능 개별 적용
			if (this.length > 1) {

				for (var i=0; i < this.length; i++)
					$(this[i]).panel(userConfig);

				return $this;

			}

		// 변수 초기화
			var	$this = $(this),
				$body = $('body'),
				$window = $(window),
				id = $this.attr('id'),
				config;

		// 사용자 설정 병합
			config = $.extend({
				
					delay: 0,
				
					hideOnClick: false,
				
					hideOnEscape: false,
				
					hideOnSwipe: false,
				
					resetScroll: false,
				
					resetForms: false,
				
					side: null,
				
					target: $this,

					visibleClass: 'visible'

			}, userConfig);

			// target을 jQuery 객체로 강제 변환
				if (typeof config.target != 'jQuery')
					config.target = $(config.target);

				/**
				* 내부 메서드: 패널 숨기기
				*/
				$this._hide = function(event) {
					
						if (!config.target.hasClass(config.visibleClass))
							return;
					
						if (event) {

							event.preventDefault();
							event.stopPropagation();

						}
					
						config.target.removeClass(config.visibleClass);

					// 옵션에 따라 스크롤과 폼 초기화
						window.setTimeout(function() {
							
								if (config.resetScroll)
									$this.scrollTop(0);
							
								if (config.resetForms)
									$this.find('form').each(function() {
										this.reset();
									});

						}, config.delay);

				};

			// 모바일 브라우저 스크롤 최적화
				$this
					.css('-ms-overflow-style', '-ms-autohiding-scrollbar')
					.css('-webkit-overflow-scrolling', 'touch');

			// 링크 클릭 시 패널 닫기 (옵션 설정 시)
				if (config.hideOnClick) {

					$this.find('a')
						.css('-webkit-tap-highlight-color', 'rgba(0,0,0,0)');

					$this
						.on('click', 'a', function(event) {

							var $a = $(this),
								href = $a.attr('href'),
								target = $a.attr('target');

							// 현재 패널을 가리키는 링크(#id)나 빈 링크는 무시
							if (!href || href == '#' || href == '' || href == '#' + id)
								return;
							
								event.preventDefault();
								event.stopPropagation();

							// 패널 숨기고 리디렉션
								$this._hide();
							
								window.setTimeout(function() {

									if (target == '_blank')
										window.open(href);
									else
										window.location.href = href;

								}, config.delay + 10);

						});

				}

			// 터치 이벤트: 스와이프 감지 및 처리
				$this.on('touchstart', function(event) {

					$this.touchPosX = event.originalEvent.touches[0].pageX;
					$this.touchPosY = event.originalEvent.touches[0].pageY;

				})

				$this.on('touchmove', function(event) {

					if ($this.touchPosX === null
					||	$this.touchPosY === null)
						return;

					var	diffX = $this.touchPosX - event.originalEvent.touches[0].pageX,
						diffY = $this.touchPosY - event.originalEvent.touches[0].pageY,
						th = $this.outerHeight(),
						ts = ($this.get(0).scrollHeight - $this.scrollTop());

					// 스와이프 방향에 따라 패널 닫기
						if (config.hideOnSwipe) {

							var result = false,
								boundary = 20, // 스와이프 허용 범위
								delta = 50;    // 스와이프 인식 거리

							switch (config.side) {

								case 'left':
									result = (diffY < boundary && diffY > (-1 * boundary)) && (diffX > delta);
									break;

								case 'right':
									result = (diffY < boundary && diffY > (-1 * boundary)) && (diffX < (-1 * delta));
									break;

								case 'top':
									result = (diffX < boundary && diffX > (-1 * boundary)) && (diffY > delta);
									break;

								case 'bottom':
									result = (diffX < boundary && diffX > (-1 * boundary)) && (diffY < (-1 * delta));
									break;

								default:
									break;

							}

							if (result) {

								$this.touchPosX = null;
								$this.touchPosY = null;
								$this._hide();

								return false;

							}

						}

					// 스크롤이 상단/하단에서 막히는 경우 터치 이벤트 차단
						if (($this.scrollTop() < 0 && diffY < 0)
						|| (ts > (th - 2) && ts < (th + 2) && diffY > 0)) {

							event.preventDefault();
							event.stopPropagation();

						}

				});

			// 패널 내부의 이벤트가 바깥으로 전달되지 않도록 차단
				$this.on('click touchend touchstart touchmove', function(event) {
					event.stopPropagation();
				});

			// 패널 안에서 자기 자신을 가리키는 링크 클릭 시 닫기
				$this.on('click', 'a[href="#' + id + '"]', function(event) {

					event.preventDefault();
					event.stopPropagation();

					config.target.removeClass(config.visibleClass);

				});

		// Body.

			// Event: 바디 클릭이나 터치 시 패널 닫기
				$body.on('click touchend', function(event) {
					$this._hide(event);
				});

			// Event: 특정 링크 클릭 시 패널 토글 (열기/닫기)
				$body.on('click', 'a[href="#' + id + '"]', function(event) {

					event.preventDefault();
					event.stopPropagation();

					config.target.toggleClass(config.visibleClass);

				});

				// -------------------------------
				//  ESC 키 눌렀을 때 패널 숨기기 (옵션)
				// -------------------------------

				if (config.hideOnEscape)
					$window.on('keydown', function(event) {

						if (event.keyCode == 27)
							$this._hide(event);

					});

		return $this;

	};

	/**
	 * Apply "placeholder" attribute polyfill to one or more forms.
	 * @return {jQuery} jQuery object.
	 */

	/**
   	* Placeholder를 지원하지 않는 브라우저용 폴리필
   	*/
	$.fn.placeholder = function() {

		// 브라우저가 placeholder를 지원하면 패스
			if (typeof (document.createElement('input')).placeholder != 'undefined')
				return $(this);
		
			if (this.length == 0)
				return $this;

		// 여러 요소 처리
			if (this.length > 1) {

				for (var i=0; i < this.length; i++)
					$(this[i]).placeholder();

				return $this;

			}

			var $this = $(this);

		// 일반 텍스트, textarea에 placeholder 적용
			$this.find('input[type=text],textarea')
				.each(function() {

					var i = $(this);

					if (i.val() == ''
					||  i.val() == i.attr('placeholder'))
						i
							.addClass('polyfill-placeholder')
							.val(i.attr('placeholder'));

				})
				.on('blur', function() {

					var i = $(this);

					if (i.attr('name').match(/-polyfill-field$/))
						return;

					if (i.val() == '')
						i
							.addClass('polyfill-placeholder')
							.val(i.attr('placeholder'));

				})
				.on('focus', function() {

					var i = $(this);

					if (i.attr('name').match(/-polyfill-field$/))
						return;

					if (i.val() == i.attr('placeholder'))
						i
							.removeClass('polyfill-placeholder')
							.val('');

				});

		// password 필드 처리 (type=text 필드로 복제해 placeholder 대체)
			$this.find('input[type=password]')
				.each(function() {

					var i = $(this);

					// type=password → type=text 로 클론한 폴리필 필드 생성
					var x = $(
								$('<div>')
									.append(i.clone())
									.remove()
									.html()
									.replace(/type="password"/i, 'type="text"')
									.replace(/type=password/i, 'type=text')
					);

					if (i.attr('id') != '')
						x.attr('id', i.attr('id') + '-polyfill-field');

					if (i.attr('name') != '')
						x.attr('name', i.attr('name') + '-polyfill-field');

					x.addClass('polyfill-placeholder')
						.val(x.attr('placeholder')).insertAfter(i);

					if (i.val() == '')
						i.hide();
					else
						x.hide();

					// 원래 필드에 포커스 잃을 때 처리
					i.on('blur', function(event) {

							event.preventDefault();

							var x = i.parent().find('input[name=' + i.attr('name') + '-polyfill-field]');

							if (i.val() == '') {

								i.hide();
								x.show();

							}

						});

						// 복제 필드에 포커스되면 진짜 필드로 전환
						x.on('focus', function(event) {

							event.preventDefault();

							var i = x.parent().find('input[name=' + x.attr('name').replace('-polyfill-field', '') + ']');

							x.hide();

							i
								.show()
								.focus();

						})
						.on('keypress', function(event) {
							// 입력 막고 빈 값으로 전환
							event.preventDefault();
							x.val('');

						});

				});

		// Form 이벤트 처리 (submit / reset)
			$this
				.on('submit', function() {

					$this.find('input[type=text],input[type=password],textarea')
						.each(function(event) {

							var i = $(this);

							if (i.attr('name').match(/-polyfill-field$/))
								i.attr('name', '');

							if (i.val() == i.attr('placeholder')) {

								i.removeClass('polyfill-placeholder');
								i.val('');

							}

						});

				})
				.on('reset', function(event) {

					event.preventDefault();

					$this.find('select')
						.val($('option:first').val());

					$this.find('input,textarea')
						.each(function() {

							var i = $(this),
								x;

							i.removeClass('polyfill-placeholder');

							switch (this.type) {

								case 'submit':
								case 'reset':
									break;

								case 'password':
									i.val(i.attr('defaultValue'));

									x = i.parent().find('input[name=' + i.attr('name') + '-polyfill-field]');

									if (i.val() == '') {
										i.hide();
										x.show();
									}
									else {
										i.show();
										x.hide();
									}

									break;

								case 'checkbox':
								case 'radio':
									i.attr('checked', i.attr('defaultValue'));
									break;

								case 'text':
								case 'textarea':
									i.val(i.attr('defaultValue'));

									if (i.val() == '') {
										i.addClass('polyfill-placeholder');
										i.val(i.attr('placeholder'));
									}

									break;

								default:
									i.val(i.attr('defaultValue'));
									break;

							}
						});

				});

		return $this;

	};

	// ===============================
  	// ⬆️ 우선순위 이동 함수
  	// ===============================

	/**
	 * Moves elements to/from the first positions of their respective parents.
	 * @param {jQuery} $elements Elements (or selector) to move.
	 * @param {bool} condition If true, moves elements to the top. Otherwise, moves elements back to their original locations.
	 */
	$.prioritize = function($elements, condition) {

		var key = '__prioritize';
		
			if (typeof $elements != 'jQuery')
				$elements = $($elements);
		
			$elements.each(function() {

				var	$e = $(this), $p,
					$parent = $e.parent();
				
					if ($parent.length == 0)
						return;
				
					if (!$e.data(key)) { 
						
							if (!condition)
								return;
						
							$p = $e.prev();
							
								if ($p.length == 0)
									return;
						
							$e.prependTo($parent);
						
							$e.data(key, $p); // 현재 위치 저장

					}
				
					else {
						
							if (condition)
								return;

						$p = $e.data(key);
						
							$e.insertAfter($p); // 원래 위치로 복귀
						
							$e.removeData(key);

					}

			});

	};

})(jQuery);