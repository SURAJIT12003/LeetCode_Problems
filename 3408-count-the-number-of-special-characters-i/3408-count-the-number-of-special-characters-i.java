class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                hs.add(ch);
            }
        }
         HashSet<Character> s = new HashSet<>();
         for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                char t = Character.toUpperCase(ch);
                if(hs.contains(t)){
                    s.add(ch);
                }
            }
         }

         return s.size();

    }
}