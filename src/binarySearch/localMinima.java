package binarySearch;

public class localMinima {
    public static int localMinima(int[]A){
        int n = A.length;
        if(A[0]<A[1]){
            return A[0];
        }if(A[n-1]<A[n-2]){
            return A[n-1];
        }
        int s = 1;
        int e = n-2;
        while (s<=e){
            int m = (s+e)/2;
            if(A[m]<A[m+1] && A[m]<A[m-1]){
                return A[m];
            } else if (A[m]>A[m-1]) {
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,2,7,6,4,1,5};
        System.out.println(localMinima(arr));
    }
}
