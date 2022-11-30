package queues;

import java.util.*;

public class perfectNumbers {
    public static Queue<Character> reverse(String s){
        String str = s;
        char[] ch = str.toCharArray();
        Queue<Character> q = new LinkedList<>();
        Stack<Character> st1 = new Stack<>();
        for(int i=0 ; i<ch.length ; i++){
            q.offer(ch[i]);
        }
        while(!q.isEmpty()){
            st1.push(q.peek());
            q.poll();
        }
        while(!st1.isEmpty()){
            q.offer(st1.peek());
            st1.pop();
        }
        return q;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Long> q = new PriorityQueue<Long>();
        q.offer((long)1);
        q.offer((long)2);
        int count = 0;
        while(count != N-1){
            long ele = q.element();
            q.poll();
            count++;
            q.offer(ele*10+1);
            q.offer(ele*10+2);
        }
//        System.out.println(q.element());
        String s = Long.toString(q.element());
//        System.out.println(s);
        Queue<Character> c = reverse(s);
        System.out.println(reverse(s));
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while(!c.isEmpty()){
            sb.append(c.peek());
            c.poll();
        }

        String singleString = sb.toString();
        System.out.println(singleString);
    }
}
