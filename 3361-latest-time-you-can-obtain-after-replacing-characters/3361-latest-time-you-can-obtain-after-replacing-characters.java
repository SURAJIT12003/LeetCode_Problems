class Solution {
    public String findLatestTime(String s) {
        char ch = s.charAt(0);
        char c = s.charAt(1);
        String ans ="";
        if(ch!='?' && c!='?'){
            ans=ans+ch+c;
        }
        else if(ch=='?' && c=='?'){
            ans=ans+"1";
            ans=ans+"1";
        }
        else if(ch=='0' && c=='?'){
            ans=ans+"0";
            ans=ans+"9";
        }
        else if(ch=='?' && c=='1'){
            ans=ans+"1";
            ans=ans+"1";
        }
        else if(ch=='?' && c=='0'){
            ans=ans+"1";
            ans=ans+c;
        }
        else if(ch=='1' && c=='?'){
            ans=ans+"1";
            ans=ans+"1";
        }
        else if(ch=='?' && c!='1'){
            ans=ans+"0";
            ans=ans+c;
        }

        ans=ans+s.charAt(2);
        if(s.charAt(3)!='?' &&  s.charAt(4)!='?'){
            ans=ans+s.charAt(3);
            ans=ans+s.charAt(4);
        }
        else if(s.charAt(3)=='?' &&  s.charAt(4)=='?'){
            ans=ans+"59";
        }
        else if(s.charAt(3)=='?'){
            ans=ans+"5";
            ans=ans+s.charAt(4);
        }
        else if(s.charAt(4)=='?'){
                ans=ans+s.charAt(3);
                ans=ans+"9";
        }

        return ans;

    }
}