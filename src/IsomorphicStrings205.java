public class IsomorphicStrings205 {

    public boolean isIsomorphic(String s, String t) {
        Map <Character,Character>  hm=new HashMap <Character,Character>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))==t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(hm.containsValue(t.charAt(i))){
                return false;
            }
            else{
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        System.out.print(hm);
        return true;
    }

}

