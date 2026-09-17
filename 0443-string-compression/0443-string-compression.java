class Solution {
    public int compress(char[] chars) {
        String res="";
        int c=1;
        for(char i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]) c++;
            else{
                res+=chars[i];
                if(c>1) res+=c;
                c=1;
            }
        }
        res+=chars[chars.length-1];
        if(c>1) res+=c;
        for(int i=0;i<res.length();i++){
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}