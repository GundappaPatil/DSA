package twod_array;

public class rowWiseSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,1,1,2}};
        int N = arr.length;
        int M = arr[0].length;
        for(int i=0 ; i<N ; i++){
            int sum = 0;
            for(int j=0 ; j<M ; j++){
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
