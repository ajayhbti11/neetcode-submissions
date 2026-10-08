class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

       
        int maxLen=0;
        int n=nums.length;

        for(int i=0;i<n;i++){

             int cur=nums[i];
             int currentLen=1;

             if(!set.contains(cur-1)){
                   
                  

                   while(set.contains(cur+1)){
                           currentLen++;
                           cur++;
                   }


             }

             maxLen=Math.max(maxLen, currentLen);

        }

        return maxLen;

    }
}
