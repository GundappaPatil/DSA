package bitmanipulation;

import java.util.Scanner;

public class trailingZeros {
    public static boolean checkBit(int A,int i){
        if((A&(1<<i))==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0 ; i<32 ; i++){
            if(!checkBit(N,i)){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
