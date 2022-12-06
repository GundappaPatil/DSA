package binarySearch;

public class floorOf_k {
    public static int floorOfK(int[]A , int k){
        int n= A.length;
        int s = 0;
        int e = n-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int m = (s+e)/2;
            if(A[m]==k){
                return A[m];
            } else if (A[m]<k) {
                ans = A[m];
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-5,2,3,6,9,10,11,15,18};
        int k = 20;
        System.out.println(floorOfK(arr,20));
    }
}
