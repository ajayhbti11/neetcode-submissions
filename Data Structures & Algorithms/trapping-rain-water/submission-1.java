class Solution {
    public int trap(int[] height) {

        int maxWater=0;

        int s=0, e=height.length-1;
        int leftHeight=0, rightHeight=0, total=0;

        while(s<=e){
            
             if(height[s]<height[e]){

                if(height[s]>leftHeight){
                    leftHeight=height[s];
                }else{
                    total+=leftHeight- height[s];
                }
               
               s++;
             }else {
                  
                  if(height[e]>rightHeight){
                    rightHeight=height[e];
                }else{
                    total+=rightHeight- height[e];
                }

               e--;
             }

        }

        return total;
    }
}
