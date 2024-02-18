package CodingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElementArray {

    public int[] topKFrequent(int[] nums, int k) {
        //Approach: Using HashMap
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        //create a Max Heap
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> a.getValue()-b.getValue());

        //Iterate and add it to priority queue
        for(Map.Entry<Integer, Integer> val:map.entrySet()){
            maxHeap.add(val);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int i = k;
        while(!maxHeap.isEmpty()){
            arr[--i] = maxHeap.poll().getKey();
        }
        return arr;
    }
}
