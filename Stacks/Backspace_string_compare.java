class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> ss=new Stack<>();
        Stack<Character> tt=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!ss.isEmpty()){
                    ss.pop();

                }
            }
            else{
                ss.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!tt.isEmpty()){

                tt.pop();
                }
            }
            else{
                tt.push(t.charAt(i));
            }
        }
        if(ss.size()!=tt.size()){
            return false;
        }
        while(!ss.isEmpty()){
            if(ss.peek()==tt.peek()){
            
                ss.pop();
                tt.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}