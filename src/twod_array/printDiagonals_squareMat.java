package twod_array;

public class printDiagonals_squareMat {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int N = arr.length;
        int i=0 ;
        while(i<N){
            System.out.print(arr[i][i]+" ");
            i++;
        }
        System.out.println();
        i=0 ;
        int j=N-1;
        while(i<N){
            System.out.print(arr[i][j]+" ");
            i++;
            j--;
        }
    }
}
