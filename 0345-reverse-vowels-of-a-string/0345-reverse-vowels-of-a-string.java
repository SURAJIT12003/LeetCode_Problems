class Solution {
    public String reverseVowels(String s) {
        
        ArrayList<Character> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='i' || ch=='I' || ch=='e' || ch=='E' || ch=='o' || ch=='O' || ch=='u' || ch=='U' || ch=='a' || ch=='A'){
                ans.add(ch);
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
        String str ="";
        int index =0;
        for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
            if(ch=='i' || ch=='I' || ch=='e' || ch=='E' || ch=='o' || ch=='O' || ch=='u' || ch=='U' || ch=='a' || ch=='A'){
                str=str+ans.get(index);
                index++;
            }
            else{
                str=str+ch;
            }



        }

        return str;
    }
}