class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!hs.containsKey(ch) && Character.isUpperCase(ch)) {
                hs.put(ch, i);
            }
        }

        HashSet<Character> s = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                char t = Character.toUpperCase(ch);
                if (hs.containsKey(t)) {
                    int in = hs.get(t);
                    if(i<in){
                        s.add(ch);
                    }
                    else{
                        if(s.contains(ch)){
                            s.remove(ch);
                        }
                    }
                }
            }
        }
        System.out.println(s);
        return s.size();
    }
}