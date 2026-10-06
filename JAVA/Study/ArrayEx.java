public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(arr[0] + " " + arr[2]);  // 인덱스 0, 2 

        int[][] grid = {{1, 2, 3}, {4, 5, 6}};      // 2행 3열
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {         // 행 순회
            for(int j = 0; j < grid[i].length; j++) {   // 열 순회
                sum += grid[i][j];
            }
        }
        System.out.println(sum);            
        System.out.println(grid[1][2]);     // 2번째 행, 3번째 열
    }
}
