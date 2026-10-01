class Solution {
    public int majorityElement(int[] nums) {
        int cand=0;
        int vote=0;
        for(int x:nums){
            if(vote==0) cand=x;
            if(x==cand) vote++;
            else vote--;
        }
        return cand;
    }
}