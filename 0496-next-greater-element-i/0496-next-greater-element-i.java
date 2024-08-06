class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int [nums1.length];
        int n = nums2.length;
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i=n-1;i>=0;i--){
            int el = nums2[i];
            if(st.isEmpty()){
                st.push(el);
                hs.put(el,-1);
            }
            else{
                int yt = 0;
                while(!st.isEmpty()){
                    if(el<st.peek()){
                        hs.put(el,st.peek());
                        yt=1;
                        break;
                    }
                    st.pop();
                }
                if(yt==0){
                    hs.put(el,-1);
                }
                st.push(el);
            }
        }

       for(int i=0;i<nums1.length;i++){
          ans[i] = hs.get(nums1[i]);
       }

       return ans ;



    }
}