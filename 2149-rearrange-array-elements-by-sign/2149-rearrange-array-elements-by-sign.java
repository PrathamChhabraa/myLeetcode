class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int x=0;
        int y=1;
        int i=0;
        while(i<nums.length){
            if(nums[i]>0){
                arr[x]=nums[i];
                x+=2;
            }
            else{
                arr[y]=nums[i];
                y+=2;
            }
            i++;
        }
        return arr;
    }
}