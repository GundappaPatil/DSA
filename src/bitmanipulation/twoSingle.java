package bitmanipulation;

//Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
//        Find the two integers that appear only once.
//        Note: Return the two numbers in ascending order.

import java.util.HashMap;

public class twoSingle {
    public static boolean checkBit(int N , int k){
        if((N&(1<<k))==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {10,8,8,9,12,9,6,11,10,6,12,17};
        int n = arr.length;
        int ans = 0;
        for(int i=0 ; i<n ; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
        int pos = -1;
        for(int i=0 ; i<32 ; i++){
            if(checkBit(ans,i)){
                pos = i;
                System.out.println(pos);
                break;
            }
        }
        int ans1 = 0;
        int ans2 = 0;
        for(int i=0 ; i<n ; i++){
            if(checkBit(arr[i],pos)){
                ans1 = ans1^arr[i];
            }else{
                ans2 = ans2^arr[i];
            }
        }

        System.out.print(Math.min(ans1,ans2)+" "+Math.max(ans1,ans2));
    }
}
