package bitmanipulation;

import java.util.Scanner;

public class checkBit {
    public static boolean checkBit(int X,int i){
        for(int j=0 ; j<32 ; j++){
            if((X&(1<<i))==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(checkBit(N,i));
    }
}
