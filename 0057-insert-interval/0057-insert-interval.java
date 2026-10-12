class Solution {
    public int[][] merge(int[][] interval){
        List<int[]> ans=new ArrayList<>();
        int s1=interval[0][0];
        int e1=interval[0][1];
        for(int i=1;i<interval.length;i++){
            int s2=interval[i][0];
            int e2=interval[i][1];
            if(e1>=s2){
                e1=Math.max(e1,e2);
            }
            else{
                ans.add(new int[]{s1,e1});
                s1=s2;
                e1=e2;
            }
        }
        ans.add(new int[]{s1,e1});
        return ans.toArray(new int[ans.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        int s=newInterval[0];
        int e=newInterval[1];
        boolean ins=false;
        for(int i=0;i<intervals.length;i++){
            int s1=intervals[i][0];
            int e1=intervals[i][1];
            if(ins==false && s1>=s){
                list.add(new int[]{s,e});
                ins=true;
            }
            list.add(new int[]{s1,e1});
        }
        if(!ins){
            list.add(new int[]{s, e});
        }
        return merge(list.toArray(new int[list.size()][]));
    }
}