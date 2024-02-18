package CodingPractice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {
    public static void main(String args[]){
        int ar[][]= new int[6][2];
        ar[0]= new int[]{0, 5};
        ar[1]= new int[]{5, 10};
        ar[2]= new int[]{15, 25};
        ar[3]= new int[]{40, 60};
        ar[4]= new int[]{50, 65};
        ar[5]= new int[]{55, 75};



        System.out.println(countroom(ar));



    }

    public static int countroom(int intervals[][]){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //O(n)

        for(int[] interval: intervals){
            if(pq.isEmpty()){
                pq.add(interval[1]);
                continue;
            }
            if(pq.peek()<interval[0]){
                pq.remove();
            }
            pq.add(interval[1]);
        }
        return pq.size();
    }
}
