package strings;

import java.util.Arrays;
import java.util.Scanner;

public class toLower {
    public static char[] toLower(char ch[]){
        int n = ch.length;
        for(int i=0 ; i<n ; i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i] = (char)(ch[i]^(1<<5));
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N  = sc.nextInt();
        char[] ch = sc.next().toCharArray();


        System.out.println(Arrays.toString(toLower(ch)));
    }
}
