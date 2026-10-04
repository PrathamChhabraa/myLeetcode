class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ques=0,res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ques=sum-goal;
            if(map.containsKey(ques)) res+=map.get(ques);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}