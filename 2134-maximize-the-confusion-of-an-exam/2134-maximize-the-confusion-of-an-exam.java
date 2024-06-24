class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0;
        int T = 0;
        int F = 0;
        int right = 0;
        int max = 0;
        for (int i = 0; i < answerKey.length(); i++) {
            char curr = answerKey.charAt(i);
            if (curr == 'T') {
                T++;
            } else {
                F++;
            }
            if (F > k) {
                while (F != k && right >= left) {

                    if (answerKey.charAt(left) == 'F') {
                        F--;
                    }
                    left++;
                }
            }
            right++;
            int length = (right - left) + 1;
            max = Math.max(max, length);
        }
        left = 0;
        T = 0;
        F = 0;
        right = 0;
       
        for (int i = 0; i < answerKey.length(); i++) {
            char curr = answerKey.charAt(i);
            if (curr == 'T') {
                T++;
            } else {
                F++;
            }
            if (T > k) {
                while (T != k && right >= left) {

                    if (answerKey.charAt(left) == 'T') {
                        T--;
                    }
                    left++;
                }
            }
            right++;
            int length = (right - left) + 1;
            max = Math.max(max, length);
        }


        return max-1;
    }
}