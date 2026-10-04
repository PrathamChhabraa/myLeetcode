class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ques=0,res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ques=sum%k;
            if(ques<0) ques+=k;
            if(map.containsKey(ques)) res+=map.get(ques);
            map.put(ques,map.getOrDefault(ques,0)+1);
        }
        return res;
    }
}