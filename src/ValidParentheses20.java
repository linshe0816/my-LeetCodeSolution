class Solution {
    public boolean isValid(String s) {
        //()=40、41 []=91、93 {}=123、125
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{') stack.push(c);
            else{
                
                if(stack.isEmpty())return false;
                char temp=stack.peek();
                //System.out.println(""+temp);
                if((c==')'&&temp=='(')||(c==']'&&temp=='[')||(c=='}'&&temp=='{')){
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.isEmpty()?true:false;
    }
}