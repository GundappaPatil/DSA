package twod_array;

public class maxColSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,60,7,8},{9,10,11,12}};
        int N = arr.length;
        int M = arr[0].length;
        int max_sum = Integer.MIN_VALUE;
        for(int j=0 ; j<M ; j++){
            int sum = 0;
            for(int i=0 ; i<N ; i++){
                sum = sum + arr[i][j];
            }
            if(sum>max_sum){
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
    }
}
