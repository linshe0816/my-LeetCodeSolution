class Solution {
    public int romanToInt(String s) {
        int res=0;
        switch(s.charAt(s.length()-1)) {
            case 'I': res = 1; break;
            case 'V': res = 5; break;
            case 'X': res = 10; break;
            case 'L': res = 50; break;
            case 'C': res = 100; break;
            case 'D': res = 500; break;
            case 'M': res = 1000; break;
        }
        for(int i=s.length()-2;i>=0;i--){
            int temp=0;
            switch(s.charAt(i)) {
                case 'I':
                    if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')temp=-1;
                    else temp = 1; 
                    break;
                case 'V':
                    temp = 5; 
                    break;
                case 'X':
                    if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')temp=-10;
                    else temp = 10; 
                    break;
                case 'L': 
                    temp = 50; 
                    break;
                case 'C':
                    if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')temp=-100;
                    else temp = 100; 
                    break;
                case 'D': 
                    temp = 500; 
                    break;
                case 'M': 
                    temp = 1000; 
                    break;
            }
            res+=temp;
        }
        return res;
    }
}