// 재귀함수
// : 메서드가 자기 자신을 다시 호출하는 것. 큰 문제를 "더 작은 형태의 문제"로 쪼개서 풀 때 사용한다.
//   재귀함수는 반드시 두 부분으로 이루어져야 한다.
// 1. 종료 조건(base case): 더 이상 자기 자신을 호출하지 않고 값을 바로 반환하는 조건. 이게 없으면 무한 호출되다가 StackOverFlowError가 난다
// 2. 재귀 호출(recursive case): 문제를 더 작게 줄여서 자기 자신을 다시 호출하는 부분.
public class FactorialEx {
    static int factorial(int n) {
        if (n <= 1) return 1;       // 종료 조건(base case)
        return n * factorial(n-1);  // 재귀 호출
    }
    public static void main(String[] atgs) {
        System.out.println(factorial(5));
    }
}
