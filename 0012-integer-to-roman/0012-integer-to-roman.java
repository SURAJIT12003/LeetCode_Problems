class Solution {
    


    public int check(int num,TreeMap<Integer, String> hs ){
        for(int v:hs.keySet()){
            if(num>=v){
                return v;
            }
        }
        return 0;
    }
    public String intToRoman(int num) {
       
        TreeMap<Integer, String> hs = new TreeMap<>(Collections.reverseOrder());
        hs.put(1,"I");
        hs.put(4,"IV");
        hs.put(5,"V");
        hs.put(9,"IX");
        hs.put(10,"X");
        hs.put(40,"XL");
        hs.put(50,"L");
        hs.put(90,"XC");
        hs.put(100,"C");
        hs.put(400,"CD");
        hs.put(500,"D");
        hs.put(900,"CM");
        hs.put(1000,"M");


        String ans = "";
        while(num!=0){
            int t = check(num,hs);
            int r = num/t;
            String c = hs.get(t);
            for(int i=1;i<=r;i++){
                ans=ans+c;
            }
            num = num%t;
        }
        return ans;


    }
}