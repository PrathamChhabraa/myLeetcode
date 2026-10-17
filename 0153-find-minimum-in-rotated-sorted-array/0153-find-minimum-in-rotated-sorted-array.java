class Solution {
    public int findMin(int[] nums) {
        // int min=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<min) min=nums[i];
        // }
        // return min;

        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>nums[nums.length-1]){
                l=m+1;
            }
            else{
                ans=nums[m];
                h=m-1;
            }
        }
        return ans;
    }
}