class Solution {
    public int first(int[] arr,int target){
        int l=0;
        int h=arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<target){
                l=mid+1;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;
    }
    public int last(int[] arr,int target){
        int l=0;
        int h=arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<target){
                l=mid+1;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int fst=first(nums,target);
        int lst=last(nums,target);
        if(fst==-1) return ans;
        for(int i=fst;i<=lst;i++){
            ans.add(i);
        }
        return ans;
    }
}