class Solution {

    public String check(String  ch,int div){
        String ans = "";
        for(int i=1;i<=div;i++){
            ans+=ch;
        }

        return ans;
    }

    public String intToRoman(int num) {
       

        String ans = "";

        while(num!=0){
            if(num>=1000){
                int div = num/1000;
                int rem = num%1000;
                num = rem;
                String s = check("M",div);
                ans+=s;
            }
            else if(num>=900){
                int div = num/900;
                int rem = num%900;
                num = rem;
                String s = check("CM",div);
                ans+=s;
            }
            else if(num>=500){
                int div = num/500;
                int rem = num%500;
                num = rem;
                String s = check("D",div);
                ans+=s;
            }
            else if(num>=400){
                int div = num/400;
                int rem = num%400;
                num = rem;
                String s = check("CD",div);
                ans+=s;
            }
            else if(num>=100){
                int div = num/100;
                int rem = num%100;
                num = rem;
                String s = check("C",div);
                ans+=s;
            }
            else if(num>=90){
                int div = num/90;
                int rem = num%90;
                num = rem;
                String s = check("XC",div);
                ans+=s;
            }
            else if(num>=50){
                int div = num/50;
                int rem = num%50;
                num = rem;
                String s = check("L",div);
                ans+=s;
            }
            else if(num>=40){
                int div = num/40;
                int rem = num%40;
                num = rem;
                String s = check("XL",div);
                ans+=s;
            }
            else if(num>=10){
                int div = num/10;
                int rem = num%10;
                num = rem;
                String s = check("X",div);
                ans+=s;
            }
            else if(num>=9){
                int div = num/9;
                int rem = num%9;
                num = rem;
                String s = check("IX",div);
                ans+=s;
            }
            else if(num>=5){
                int div = num/5;
                int rem = num%5;
                num = rem;
                String s = check("V",div);
                ans+=s;
            }
            else if(num>=4){
                int div = num/4;
                int rem = num%4;
                num = rem;
                String s = check("IV",div);
                ans+=s;
            }
            else if(num>=1){
                int div = num/1;
                int rem = num%1;
                num = rem;
                String s = check("I",div);
                ans+=s;
            }
        }

        return ans ;

    }
}