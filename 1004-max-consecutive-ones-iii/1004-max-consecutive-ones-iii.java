class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxLen=0;
        int zero=0;
        while(j<nums.length){
            if(nums[j]==0) zero++;
            while(zero>k){
                if(nums[i]==0) zero--;
                i++;
            }
            if(zero<=k){
                maxLen=Math.max(maxLen,j-i+1);
            }
            j++;
        }
        return maxLen;
    }
}