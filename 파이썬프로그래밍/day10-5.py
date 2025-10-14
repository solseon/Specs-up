# 은행계좌 클래스 구현
class BankAccount:
	def __init__(self, name, account_num):
		self.__name = name  # 계좌 주인의 이름
		self.__account_num = account_num  # 계좌번호
		self.__balance = 0  # 계좌 잔액

	def deposit(self, amount):
		self.__balance += amount
		print(f"{amount}원이 입금되었습니다. 잔고는 {self.__balance}원입니다.")

	def withdraw(self, amount):
		if self.__balance < amount:
			print(f"계좌 잔고는 {self.__balance}원으로 인출 요구 금액 {amount}원보다 작습니다.")
		else:
			self.__balance -= amount
			print(f"{amount}원이 출금되었습니다. 잔고는 {self.__balance}원입니다.")

	def __str__(self):
		return f"{self.__name}님의 계좌 {self.__account_num}의 잔고는 {self.__balance}원입니다."

# 예시 실행 코드
account1 = BankAccount('홍길동', '1234-0001')
print(account1)
account1.deposit(2000)
print(account1)
account1.withdraw(500)
print(account1)
account1.withdraw(5000)
