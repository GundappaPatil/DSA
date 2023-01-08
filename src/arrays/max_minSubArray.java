package arrays;

public class max_minSubArray {
    public static void main(String[] args) {
        int[] arr = {6,4,1,2,5,6};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min+" "+max);

        int min_Index = -1, max_Index = -1; // index of the last element having value equal to min_ele and max_ele
        int ans = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == min) {
                min_Index = Math.max(min_Index, i);
            }
            if(arr[i] == max) {
                max_Index = Math.max(max_Index, i);
            }

            if(min_Index != -1 && max_Index != -1){
                int len = Math.abs(max_Index - min_Index) + 1;
                ans = Math.min(ans, len);
            }
        }
        System.out.println(ans);

    }
}
