package twod_array;

public class colWiseSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int N = arr.length;
        int M = arr[0].length;
        for(int j=0 ; j<M ; j++){
            int sum = 0;
            for(int i=0 ; i<N ; i++){
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
