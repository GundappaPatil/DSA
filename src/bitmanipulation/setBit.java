package bitmanipulation;

import java.util.Scanner;

// set the ith bit as set
public class setBit {
    public static int ithBitSet(int n , int k){
        return (n|(1<<k));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(ithBitSet(N,K));
    }
}
