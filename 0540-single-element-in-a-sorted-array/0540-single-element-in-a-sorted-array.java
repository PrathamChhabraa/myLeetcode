class Solution {
    public int singleNonDuplicate(int[] nums) {
    int s=0;
    int e=nums.length-1;
    while(s<e){
        int mid=s+(e-s)/2;
        int leftEl=mid-s+1;
        int rightEl=e-mid+1;
        if(nums[mid]==nums[mid+1]){
            if(leftEl%2!=0){
                s=mid+2;
            }
            else e=mid-1;
        }
        else if(nums[mid]==nums[mid-1]){
            if(rightEl%2!=0){
                e=mid-2;
            }
            else s=mid+1;
        }
        else return nums[mid];
    }
    return nums[e];
    }
}