class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result=new HashSet<>();
        
        int n=nums.length;

        for(int i=0; i<n-2; i++){

                 int sum=nums[i]+nums[i+1];
                 HashSet<Integer> seen=new HashSet<>();
                 List<Integer> list=new ArrayList<>();
                 
                 for(int j=i+1; j<n; j++){
                  int threeSum=-(nums[i]+nums[j]);
                  if(seen.contains(threeSum)){

                   list=Arrays.asList(nums[i],nums[j],threeSum);
                   Collections.sort(list);
                   result.add(list);

                  }
                  seen.add(nums[j]);
                 }
               
             
        } 
       return new ArrayList<>(result);

    }
}
