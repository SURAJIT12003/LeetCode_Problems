class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        if(s.length()==0){
            return false;
        }
        String er="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='g'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='x'||ch=='y'||ch=='z'||ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
               er = er+ch;
            }
        }
       
       String str="";
       for(int i=er.length()-1;i>=0;i--){
           str = str +er.charAt(i);
       }
       System.out.println(er);
         System.out.println(str);
       if(str.equals(er)){
           return true ;
       }
       return false;
        
    }
}