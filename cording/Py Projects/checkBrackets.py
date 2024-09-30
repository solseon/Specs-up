# 스택을 이용한 괄호 검사 알고리즘
from stack import ArrayStack

def checkBrackets(statement):
    stack = ArrayStack(100)
    for ch in statement:
        if ch=='{' or ch=='[' or ch=='(' :
            stack.push(ch)

        elif ch=='}' or ch==']' or ch==')' :
            if stack.isEmpty() :
                return False
            else :
              left = stack.pop()
              if (ch == "}" and left != "{") or \
                 (ch == "]" and left != "[") or \
                 (ch == ")" and left != "(") :
                 return False

    return stack.isEmpty()