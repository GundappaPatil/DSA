package binarySearch;

public class frequencyOf_k {
    public static int firstOccK(int[]A,int k){
        int n = A.length;
        int s = 0;
        int e = n-1;
        int S = Integer.MAX_VALUE;
        while (s<=e){
            int m = (s+e)/2;
            if(A[m]==k){
                S = m;
                e = m-1;
            } else if (A[m]<k) {
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return S;
    }

    public static int lastOccK(int[] A , int k){
        int n = A.length;
        int s = 0;
        int e = n-1;
        int E = Integer.MAX_VALUE;
        while (s<=e){
            int m = (s+e)/2;
            if(A[m]==k){
                E = m;
                s = m+1;
            } else if (A[m]<k) {
                s = m+1;
            }else {
                e = m-1;
            }
        }
        return E;
    }
    public static void main(String[] args) {
        int[] arr = {-5,-5,-3,0,0,1,1,1,5,5,5,5,5,5,9,10};
        int k = 0;
        int s = firstOccK(arr,k);
        int e = lastOccK(arr,k);
        int freq = e-s+1;
        System.out.println(freq);

    }
}
