package bitmanipulation;
//minimum XOR

import java.util.Arrays;

public class minXOR {
    //Brute force
//    public static void main(String[] args) {
//        int[] arr = {0,5,2,7};
//        int min_val = Integer.MAX_VALUE;
//        for(int i=0 ; i<arr.length ; i++){
//            for(int j=i+1 ; j<arr.length ; j++){
//                int xor = arr[i]^arr[j];
//                if(xor<min_val){
//                    min_val=xor;
//                }
//            }
//        }
//        System.out.println(min_val);
//     }

//Optimal
    public static void main(String[] args) {
        int[] arr = {0,5,2,7};
        int n = arr.length;
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=0 ; i<n-1 ; i++){
            ans = Math.min(ans,(arr[i]^arr[i+1]));
        }
        System.out.println(ans);
    }

}
