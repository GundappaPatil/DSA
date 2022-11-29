package two_pointers;

public class max_water {
    public static int maxWater(int[]A){
        int N = A.length;
        int p1 = 0;
        int p2 = N-1;
        int area = 0;
        while(p1<p2){
            int H = Integer.min(A[p1],A[p2]);
            int W = p2-p1;
            if(H==A[p2]){
                area = Integer.max(area,H*W);
                p2--;
            }
            else{
                p1++;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,7,3,6,5,4,1,2};
        System.out.println(maxWater(arr));
    }
}
