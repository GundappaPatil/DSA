package bitmanipulation;

//Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
//NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class singleEle {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,4,2,5,4,3,7,7};
        int n = arr.length;
        int res = 0;
        for(int i=0 ; i<n ; i++){
            res = res^arr[i];
        }
        System.out.println(res);
    }
}
