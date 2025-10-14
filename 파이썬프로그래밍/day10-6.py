# 학생 클래스 구현
class Student:
	def __init__(self, name, student_id):
		self.__name = name  # 학생 이름
		self.__student_id = student_id  # 학번
		self.__korean_quiz = 0  # 국어 점수
		self.__math_quiz = 0    # 수학 점수
		self.__science_quiz = 0 # 과학 점수

	def get_name(self):
		return self.__name

	def get_student_id(self):
		return self.__student_id

	def get_korean_quiz(self):
		return self.__korean_quiz

	def get_math_quiz(self):
		return self.__math_quiz

	def get_science_quiz(self):
		return self.__science_quiz

	def set_korean_quiz(self, score):
		self.__korean_quiz = score

	def set_math_quiz(self, score):
		self.__math_quiz = score

	def set_science_quiz(self, score):
		self.__science_quiz = score

	def get_total_score(self):
		return self.__korean_quiz + self.__math_quiz + self.__science_quiz

	def get_avg_score(self):
		return self.get_total_score() / 3

	def __str__(self):
		return (f"이름 : {self.__name}, 학번 : {self.__student_id}\n"
				f"국어 성적 : {self.__korean_quiz}, 수학 성적 : {self.__math_quiz}, 과학 성적 : {self.__science_quiz}, "
				f"합계 : {self.get_total_score()}, 평균 : {self.get_avg_score():.1f}")

# 입력 및 출력 예시 코드
name = input("학생의 이름을 입력하세요 : ")
student_id = input("학생의 학번을 입력하세요 : ")
student = Student(name, student_id)
korean_quiz = int(input("학생의 국어 성적을 입력하세요 : "))
math_quiz = int(input("학생의 수학 성적을 입력하세요 : "))
science_quiz = int(input("학생의 과학 성적을 입력하세요 : "))
student.set_korean_quiz(korean_quiz)
student.set_math_quiz(math_quiz)
student.set_science_quiz(science_quiz)
print(student)
