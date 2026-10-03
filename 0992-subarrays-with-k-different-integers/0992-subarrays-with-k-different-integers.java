class Solution {
    public int kminusone(int[] nums,int k){
        int i=0,j=0,c1=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            c1+=j-i+1;
            j++;
        }
        return c1;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return kminusone(nums,k)-kminusone(nums,k-1);
    }
}


//brute
        // int n=nums.length;
        // int res=0;
        // for(int i=0;i<n;i++){
        //     HashMap<Integer,Integer> map=new HashMap<>();
        //     for(int j=i;j<n;j++){
        //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //         if(map.size()==k) res++;
        //         else if(map.size()>k) break;
        //     }
        // }
        // return res;
// 