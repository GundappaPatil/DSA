package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class specialindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0 ; i<N ; i++){
//            arr[i] = sc.nextInt();
//        }
//        int[] PSe = new int[N];
//        int[] PSo = new int[N];
//
//        PSe[0] = arr[0];
//        PSo[0] = 0;
//        for(int i=1 ; i<N ; i++){
//            if(i%2==0){
//                PSe[i] = PSe[i-1]+arr[i];
//                PSo[i] = PSo[i-1];
//            }
//            else{
//                PSo[i] = PSo[i-1]+arr[i];
//                PSe[i] = PSe[i-1];
//            }
//        }
//        System.out.println(Arrays.toString(PSe));
//        for(int i=0 ; i<N ; i++){
//            System.out.print(PSe[i]+" ");
//        }
//        System.out.println(Arrays.toString(PSo));
//        int so,se,count=0;
//        for(int i=0 ; i<N ; i++){
//            if(i!=0){
//                so = PSo[i-1]+PSe[N-1]-PSe[i];
//                se = PSe[i-1]+PSo[N-1]-PSo[i];
//            }
//            else{
//                so = PSe[N-1]-PSe[i];
//                se = PSo[N-1]-PSo[i];
//            }
//            if(so==se){
//                count++;
//            }
//        }
//        System.out.println(count);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] PSe = new int[N];
        int[] PSo = new int[N];
        PSe[0] = arr[0];
        PSo[0] = 0;
        for(int i=1 ; i<N ; i++){
            if(i%2==0){
                PSe[i] = PSe[i-1]+arr[i];
                PSo[i] = PSo[i-1];
            }else{
                PSe[i] = PSe[i-1];
                PSo[i] = PSo[i-1]+arr[i];
            }
        }
        int So,Se,count = 0;
        for(int i=0 ; i<N ; i++){
            if(i!=0){
                Se = PSe[i-1]+PSo[N-1]-PSo[i];
                So = PSo[i-1]+PSe[N-1]-PSe[i];
            }else{
                Se = PSo[N-1]-PSo[i];
                So = PSe[N-1]-PSe[i];
            }
            if(Se==So){
                count++;
            }
        }
        System.out.println(count);
    }
}
