package strings;

public class reverse_string_words {
    public static String solve(String A) {
//        A = A.trim();
        int n = A.length();
        char[] ch = A.toCharArray();
        for(int i=0 , j=n-1 ; i<j ; i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        int sp = 0;
        for(int k=0 ; k<n ; k++){
            if(ch[k]==' '){
                for(int i=sp,j=k-1 ; i<j ; i++,j--){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                sp = k+1;
            }
        }
        for(int i=sp , j=n-1 ; i<j ; i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(solve(str));
    }
}
