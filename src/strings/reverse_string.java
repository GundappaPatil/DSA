package strings;

import java.util.Scanner;

public class reverse_string {
    public static String reverse(String S){
        int n = S.length();
        char[] ch = S.toCharArray();
        for(int i=0 , j=n-1 ; i<j ; i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}
