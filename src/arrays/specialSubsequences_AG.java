package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class specialSubsequences_AG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] B = new char[str.length()];
        for(int i=0 ; i<str.length() ; i++){
            B[i] = str.charAt(i);
        }
        int ans = 0;
        int count_A = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(B[i]=='A'){
                count_A++;
            } else if (B[i]=='G') {
                ans = ans + count_A;
            }
        }
        System.out.println(ans);
    }
}
