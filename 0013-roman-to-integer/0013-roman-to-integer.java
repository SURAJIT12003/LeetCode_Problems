class Solution {
    public int romanToInt(String s) {
        int sum =0;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i!=n-1){
                if(ch=='I'&& s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                }
                else if(ch=='I'&& s.charAt(i+1)=='X'){
                    sum+=9; i++;
                }
                else if(ch=='X'&& s.charAt(i+1)=='L'){
                    sum+=40; i++;
                }
                else if(ch=='X'&& s.charAt(i+1)=='C'){
                    sum+=90; i++;
                }
                else if(ch=='C'&& s.charAt(i+1)=='D'){
                    sum+=400; i++;
                }
                else if(ch=='C'&& s.charAt(i+1)=='M'){
                    sum+=900; i++;
                }
                else{
                    if(ch=='I'){
                        sum+=1;
                    }
                    else if(ch=='V'){
                        sum+=5;
                    }
                    else if(ch=='X'){
                        sum+=10;
                    }
                    else if(ch=='L'){
                        sum+=50;
                    }
                    else if(ch=='C'){
                        sum+=100;
                    }
                    else if(ch=='D'){
                        sum+=500;
                    }
                    else{
                        sum+=1000;
                    }
                }
            }
            else {
                 if(ch=='I'){
                        sum+=1;
                    }
                    else if(ch=='V'){
                        sum+=5;
                    }
                    else if(ch=='X'){
                        sum+=10;
                    }
                    else if(ch=='L'){
                        sum+=50;
                    }
                    else if(ch=='C'){
                        sum+=100;
                    }
                    else if(ch=='D'){
                        sum+=500;
                    }
                    else{
                        sum+=1000;
                    }
            }
        }

        return sum ;
    }
}