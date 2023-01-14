package bitmanipulation;

import java.util.Scanner;

//count set(1) bits in a given number
public class count_bits {
    public static boolean checkBit(int x,int k){
            if((x&(1<<k))==0){
                return false;
            }
        return true;
    }
    public static int countBits(int A){
        int count = 0;
        for(int i=0 ; i<32 ; i++){
            if(checkBit(A,i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countBits(N));
    }
}
