package twod_array;

public class printR_L_diagonals {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int N = arr.length;
        int M = arr[0].length;
        for(int c=0 ; c<M ; c++){
            int i=0;
            int j=c;
            while(i<N && j>=0){
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }
        for(int r=1 ; r<N ; r++){
            int i=r;
            int j=M-1;
            while(i<N && j>=0){
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
}
//1,2, 3, 4
//5,6, 7, 8
//9,10,11,12
