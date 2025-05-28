class Solution {
    public String breakPalindrome(String p) {
        if(p.length()==1) return "";
        StringBuilder str = new StringBuilder(p);
        for(int i=0;i<p.length()/2;i++){
            if(p.charAt(i)!='a'){
                str.setCharAt(i,'a');
                return str.toString();
            }
        }
        str.setCharAt(p.length()-1,'b');

        return str.toString();
    }
}