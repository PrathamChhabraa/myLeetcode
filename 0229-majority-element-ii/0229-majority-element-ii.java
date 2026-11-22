class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)==min) lst.add(x);
        }
        return lst;
    }
}