class Solution {
    public void twoSumAp(int k,int[] nums,List<List<Integer>> ans){
        int i=k+1;
        int j=nums.length-1;
        while(i<j){
            if(nums[k]+nums[i]+nums[j]>0) j--;
            else if(nums[k]+nums[i]+nums[j]<0) i++;
            else{
                ans.add(Arrays.asList(nums[k],nums[i],nums[j]));
                i++;
                j--;
            while(i<j && nums[i]==nums[i-1]){
                i++;
            }
            while(j>i && nums[j]==nums[j+1]){
                j--;
            }}
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0) break;
            if(k==0 || nums[k]!=nums[k-1]){
                twoSumAp(k,nums,ans);
            }
        }
        return ans;
    }
}