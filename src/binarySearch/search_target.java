package binarySearch;

public class search_target {
    public static int searchK(int[]A,int k){
        int n = A.length;
        int s = 0;
        int e = A.length-1;
        while(s<=e){
            int m = (s+e)/2;
            if(A[m]==k){
                return m;
            }
            else if(A[m]>k){
                e = m-1;
            } else if (A[m]<k) {
                s = m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,9,12,14,19,20,23,25,27};
        int N = arr.length;
        int k = 12;
        System.out.println(searchK(arr,k));
    }
}
