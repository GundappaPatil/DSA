package bitmanipulation;

import java.util.Scanner;

public class toggleBit {
    public static int kthBitToggle(int N , int K){
        return (N^(1<<K));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(kthBitToggle(N,K));
    }
}
