class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[3];
        int i=0;
        int j=0;
        int res=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            arr[ch-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                char x=s.charAt(i);
                res+=s.length()-j;
                arr[x-'a']--;
                i++;
            }
            j++;
        }
        return res;
    }
}