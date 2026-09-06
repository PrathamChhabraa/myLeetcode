class Solution {
    public int mySqrt(int x) {
        //last bad version
        
        int s=1;
        int e=x;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            long val=(long) mid*mid;
            if(val>x){
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
}