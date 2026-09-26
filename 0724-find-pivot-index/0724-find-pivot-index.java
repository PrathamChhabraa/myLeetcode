class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(ls==sum-nums[i]) return i;
            else{
                ls+=nums[i];
                sum-=nums[i];
            }
        }
        return -1;
    }
}