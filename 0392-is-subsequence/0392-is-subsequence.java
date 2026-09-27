class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=i;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else j++;
        }
        return i==s.length();
    }
}