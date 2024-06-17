class Solution {
    public int titleToNumber(String g) {
        int count =0;
        int pow = g.length()-1;
        for(int i=0;i<g.length();i++){
            int t = g.charAt(i)-'A';
            t++;
            int s =   (int)Math.pow(26,pow);
            
            //System.out.println(s+" "+g);
            //if(g.equals("ABC")){
                //System.out.println(s+" "+t);
                t=t*s;
            //}
            pow--;
            count+=t;
            
        }
       // System.out.println(count);
        return count;
    }
}