class Solution {
    public String reverseWords(String s) {
        String ans = "";
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=' '){
                int j =i;
                String ns = "";
                while(j<s.length() && s.charAt(j)!=' '){
                    ns = ns+s.charAt(j);
                    j++;
                }
                i = j-1;
                arr.add(ns);
            }
        }

        
       
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)==" "){
                continue;
            }
            ans = ans +arr.get(i);
            //System.out.println(arr.get(i));
            if(i==0){
                break;
            }
            ans = ans+" ";
        }

        return ans ;
    }
}