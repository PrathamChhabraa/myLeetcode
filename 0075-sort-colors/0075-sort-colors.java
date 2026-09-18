class Solution {
    public void sortColors(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<=j){
            if(nums[k]==1) k++;
            else if(nums[k]==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
                i++;
            }
            else if(nums[k]==2){
                int tmp=nums[k];
                nums[k]=nums[j];
                nums[j]=tmp;
                j--;
            }
        }
    }
}