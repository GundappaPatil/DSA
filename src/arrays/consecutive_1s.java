package arrays;

public class consecutive_1s {
    //for every 0 we need to count no of 1's on left and right side of it.
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,0,1,1,1,0,1,1,0,1};
        int N = arr.length;
        int ans = 0;
        for(int i=0 ; i<N ; i++){
            if(arr[i]==0){
                int l_count = 0;
                for(int j=i-1 ; j>=0 ; j--){
                    if(arr[j]==1){
                        l_count++;
                    }else{
                        break;
                    }
                }
                int r_count = 0;
                for(int k=i+1 ; k<N ; k++){
                    if(arr[k]==1){
                        r_count++;
                    }else{
                        break;
                    }
                }
                ans = Math.max(ans,l_count+r_count+1);
            }
        }
        System.out.println(ans);
    }
}
