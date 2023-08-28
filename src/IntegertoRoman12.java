class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        fillHM(hm);
        String res = "";
        int temp=1000;
        while(temp>0){
            int n=num/temp;
            res+=hm.get(n*temp);
            num%=temp;
            temp/=10;
        }
        return res;
    }
    private void fillHM(HashMap<Integer,String> HM){
        HM.put(0,"");
        HM.put(1,"I");
        HM.put(2,"II");
        HM.put(3,"III");
        HM.put(4,"IV");
        HM.put(5,"V");
        HM.put(6,"VI");
        HM.put(7,"VII");
        HM.put(8,"VIII");
        HM.put(9,"IX");
        HM.put(10,"X");
        HM.put(20,"XX");
        HM.put(30,"XXX");
        HM.put(40,"XL");
        HM.put(50,"L");
        HM.put(60,"LX");
        HM.put(70,"LXX");
        HM.put(80,"LXXX");
        HM.put(90,"XC");
        HM.put(100,"C");
        HM.put(200,"CC");
        HM.put(300,"CCC");
        HM.put(400,"CD");
        HM.put(500,"D");
        HM.put(600,"DC");
        HM.put(700,"DCC");
        HM.put(800,"DCCC");
        HM.put(900,"CM");
        HM.put(1000,"M");
        HM.put(2000,"MM");
        HM.put(3000,"MMM");
    }
}