// jQuery 기반 메인 초기화 코드
(function($) {

	// skel: 반응형 브레이크포인트 설정
	skel.breakpoints({
		xlarge:	'(max-width: 1680px)',
		large:	'(max-width: 1280px)',
		medium:	'(max-width: 980px)',
		small:	'(max-width: 736px)',
		xsmall:	'(max-width: 480px)'
	});

	// DOM 로딩 후 실행
	$(function() {

		var	$window = $(window),
			$body = $('body');

		// 페이지 로딩 중 애니메이션 비활성화 클래스 추가
			$body.addClass('is-loading');

		// 로딩 완료 후 100ms 지연 뒤 애니메이션 재활성화
			$window.on('load', function() {
				window.setTimeout(function() {
					$body.removeClass('is-loading');
				}, 100);
			});

		// placeholder 폴리필 적용 (오래된 브라우저 대응)
			$('form').placeholder();

		// medium 브레이크포인트 진입/이탈 시 중요한 요소 우선순위 변경
			skel.on('+medium -medium', function() {
				$.prioritize(
					'.important\\28 medium\\29', // 클래스명에 괄호가 있어 escape 처리됨
					skel.breakpoint('medium').active // 현재 medium인지 여부
				);
			});

		// ==========================
    	// 🍔 메뉴 패널 초기화
   		// ==========================
			$('#menu')
				.append('<a href="#menu" class="close"></a>') // 닫기 버튼 추가
				.appendTo($body)		// 메뉴를 body 하단으로 이동
				.panel({
					delay: 500,	// 열고 닫기 지연시간
					hideOnClick: true, // 링크 클릭 시 닫힘
					hideOnSwipe: true, // 스와이프 시 닫힘
					resetScroll: true, // 닫을 때 스크롤 초기화
					resetForms: true, // 닫을 때 폼 초기화
					side: 'right'	// 오른쪽에서 슬라이드
				});

		// ==========================
   		// 🎬 배너 섹션 처리
   		// ==========================
			var $banner = $('#banner');

			if ($banner.length > 0) {

				// IE 브라우저(버전 < 12)일 때 높이 고정 보정
					if (skel.vars.IEVersion < 12) {

						$window.on('resize', function() {

							var wh = $window.height() * 0.60,
								bh = $banner.height();

							$banner.css('height', 'auto');

							window.setTimeout(function() {

								if (bh < wh)
									$banner.css('height', wh + 'px');

							}, 0);

						});

						// 최초 로드 시 강제로 resize 이벤트 호출
						$window.on('load', function() {
							$window.triggerHandler('resize');
						});

					}

				// 배경 영상 자동 삽입 (데스크톱 전용)
					var video = $banner.data('video');

					if (video)
						$window.on('load.banner', function() {
							
								$window.off('load.banner');
							
								if (!skel.vars.mobile
								&&	!skel.breakpoint('large').active
								&&	skel.vars.IEVersion > 9)
									$banner.append('<video autoplay loop><source src="' + video + '.mp4" type="video/mp4" /><source src="' + video + '.webm" type="video/webm" /></video>');

						});

				// 🎯 "더보기" 버튼에 스크롤 이동 기능 추가
					$banner.find('.more')
						.addClass('scrolly');

			}

		// ==========================
    	// 📑 탭 박스 처리
    	// ==========================		

			$('.flex-tabs').each( function() {

				var t 		= jQuery(this),
					tab 	= t.find('.tab-list li a'),
					tabs 	= t.find('.tab');

				tab.click(function(e) {

					var x = jQuery(this),
						y = x.data('tab');

					// 활성화 탭 변경
						tab.removeClass('active');
						x.addClass('active');

					// 탭 콘텐츠 표시/숨김
						tabs.removeClass('active');
						t.find('.' + y).addClass('active');

					e.preventDefault();

				});

			});

			// ==========================
			// 🎯 스크롤 이동 (scrolly)
			// ==========================
			if ( $( ".scrolly" ).length ) {

				var $height = $('#header').height();

				$('.scrolly').scrolly({
					offset: $height
				});
			}

	});

})(jQuery);