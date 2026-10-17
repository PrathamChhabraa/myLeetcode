class Solution {
    public long hour(int[] arr,int speed){
        long hours=0;
        for(int i=0;i<arr.length;i++){
            hours+=arr[i]/speed;
            if(arr[i]%speed!=0) hours++;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max) max=piles[i];
        }
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hou=hour(piles,mid);
            if(hou>h){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}