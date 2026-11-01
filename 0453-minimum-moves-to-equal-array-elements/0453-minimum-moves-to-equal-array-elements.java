class Solution {
    public int minMoves(int[] nums) {
        int x=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<x) x=i;
        }
        long moves=0;
        for(int k:nums){
            moves+=k-x;
        }
        return (int)moves;
    }
}