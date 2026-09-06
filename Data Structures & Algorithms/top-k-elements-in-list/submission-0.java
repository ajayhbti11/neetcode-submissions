class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer , Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length; i++){
              freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer , Integer>> pq=new       PriorityQueue<>((a, b) -> a.getValue() - b.getValue());



        for(Map.Entry<Integer , Integer> entry : freq.entrySet()){
                 
                 pq.offer(entry);
                  
                  if(pq.size()>k)
                     pq.poll();

        }

        int res[] =new int[k];
          int i=0;

         while (!pq.isEmpty()) {
            res[i++] = pq.poll().getKey();
        }

        return res;


    }
}
