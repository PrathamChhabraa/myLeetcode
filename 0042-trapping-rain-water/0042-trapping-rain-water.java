class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=height[i],rmax=height[j];
        int res=0;
        while(i<j){
            if(lmax<rmax){
                i++;
                lmax=Math.max(lmax,height[i]);
                res+=lmax-height[i];
            }
            else{
                j--;
                rmax=Math.max(rmax,height[j]);
                res+=rmax-height[j];
            }
        }
        return res;
    }
}