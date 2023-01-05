package bitmanipulation;

//Sum of XOR of all possible pairs

public class sumXOR {

//Brute force
//
//    public static void main(String[] args) {
//        int[] arr = {3,2,8,5,6};
//        int n = arr.length;
//        int sum = 0;
//        for(int i=0 ; i<n ; i++){
//            for(int j=0 ; j<n ; j++){
//                sum = sum + (arr[i]^arr[j]);
//            }
//        }
//        System.out.println(sum);
//    }

    public static boolean checkBit(int A ,int k){
        if((A&(1<<k))==0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,8,5,6};
        int n = arr.length;
        int sum = 0;
        for(int i=0 ; i<32 ; i++){
            int count = 0;
            for(int j=0 ; j<n ; j++){
                if(checkBit(arr[j],i)){
                    count++;
                }
            }
            sum = sum + (count*(n-count)*(1<<i));
        }
        System.out.println(2*sum);
    }
}
