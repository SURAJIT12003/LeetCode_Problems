class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;

        if (k == 0) {
            Arrays.fill(code, 0);
            return code;
        }
        int ans[] = new int[n];
        int sum = 0;
        if (k > 0) {
            int l = 1;
            int r = (0 + k) % n;
            for (int i = 1; i <= r; i++) {
                sum += code[i];

            }
            ans[0] = sum;
            for (int i = 1; i < n; i++) {
                sum = sum - code[i];

                int cr = (i + k) % n;
                sum = sum + code[cr];
                ans[i] = sum;
            }
        } else {
            k =Math.abs(k);
          
            int l = n - 2;
            int r = ((n - 1) + k) % n;
            r = (l-r);

            for (int i = n - 2; i >= r; i--) {
                sum += code[i];
            }

            ans[n - 1] = sum;
           //   System.out.println(sum);
            for (int i = n - 2; i >= 0; i--) {
                sum = sum - code[i];

                r--;
                if(r==-1){
                    r = n-1;
                }
                sum = sum + code[r];
                
               //System.out.println(sum);
                ans[i] = sum;
            }
        }

        return ans;

    }
}