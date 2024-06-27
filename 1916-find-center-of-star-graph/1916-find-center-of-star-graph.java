
class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer>hs =new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int c = edges[i][0];
            int d = edges[i][1];
            int frequency = hs.getOrDefault(c, 0);
            hs.put(c, frequency + 1);
            int f = hs.getOrDefault(d, 0);
            hs.put(d,f+1);
        }

        int max =0;
        int ans =0;
        for(int v:hs.keySet()){
            int g=hs.get(v);
            if(max<g){
                max = g;
                ans = v;
            }
        }

        return ans;
    }
}