package bitmanipulation;

//Given an array of integers, every element appears thrice except for one, which occurs once.
//        Find that element that does not appear thrice.
//        NOTE: Your algorithm should have a linear runtime complexity.
//        Could you implement it without using extra memory?

public class elementThrice {
    public static boolean checkBit(int N , int k){
        if((N&(1<<k))==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,5,4,7,11,11,9,11,7,5,4,4};
        int n = arr.length;
        int ans = 0;
        for(int i=0 ; i<32 ; i++){
            int count = 0;
            for(int j=0 ; j<n ; j++){
                if(checkBit(arr[j],i)){
                    count++;
                }
            }
            if(count%3 != 0){
                ans = ans|(1<<i);
            }
        }
        System.out.println(ans);
    }
}
