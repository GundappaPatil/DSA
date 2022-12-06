package binarySearch;

public class searchK_sorted_rotated {
    public static int pivot(int[]A, int k){
        int n = A.length,s = 0,e = n-1,p = -1;
        while(s<=e){
            int m = (s+e)/2;
            if(A[m]<A[0]){p = m;e = m-1;}else{s = m+1;}}
        if(k>=A[0]){
            if(p==-1){
                int l = 0;
                int r = n-1;
                while(l<=r){
                    int m = (l+r)/2;
                    if(A[m]==k){
                        return m;
                    } else if (A[m]>k) {
                        r = m-1;
                    }else{
                        l = m+1;
                    }
                }
            }else{
                int l = 0;
                int r = p-1;
                while(l<=r){
                    int m = (l+r)/2;
                    if(A[m]==k){
                        return m;
                    } else if (A[m]>k) {
                        r = m-1;
                    }else{
                        l = m+1;
                    }
                }
            }

        }else{
            int l = p;
            int r = n-1;
            while(l<=r){
                int m = (l+r)/2;
                if(A[m]==k){
                    return m;
                } else if (A[m]>k) {
                    r = m-1;
                }else{
                    l = m+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,1,2,3,4,5,6,7,8,9};
        int k = 8;
        System.out.println(pivot(arr,k));
    }
}
