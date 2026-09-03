class Solution {
    public int[] twoSum(int[] nums, int target) {
          int s=0, e=nums.length;

          HashMap<Integer, Integer> map=new HashMap<>();

           
           for(int i=0; i<e ; i++){

                int complement=target-nums[i];

                if(map.containsKey(complement)){

                     return new int[]{map.getOrDefault(complement,0), i};

                       }
                

                map.put(nums[i], i);
           }

           return new int[]{-1,-1};

          
    }
}
