class Solution {
    public boolean checkString(String s) {
        boolean dekhliya=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                dekhliya=true;
            }
            if(ch=='a' && dekhliya==true){
                return false;
            }
        }
        return true;
    }
}