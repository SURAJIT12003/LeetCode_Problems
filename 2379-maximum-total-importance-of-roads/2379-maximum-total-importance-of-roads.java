class Solution {

    class edge {
        int source;
        int dest;
        int weight;

        public edge(int source, int dest, int weight) {
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public  void create(ArrayList<edge> Graph[],int edges[][]) {
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<edge>();
        }

        for(int i=0;i<edges.length;i++){
            int s = edges[i][0];
            int v = edges[i][1];
            Graph[s].add(new edge(s,v,-1));
            Graph[v].add(new edge(v,s,-1));
        }
    }

   
   
    


    public long maximumImportance(int v, int[][] edges) {
        ArrayList<edge> graph[] = new ArrayList[v];
        create(graph,edges);
        TreeMap<Integer,TreeSet<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<v;i++){
            int s = graph[i].size();
            if(map.containsKey(s)){
                TreeSet<Integer> t = map.get(s);
                t.add(i);
                map.put(s,t);
            }
            else{
                TreeSet<Integer> t = new TreeSet<>();
                t.add(i);
                map.put(s,t);
            }
        }

        int c = v;
        HashMap<Integer,Integer> hs  = new HashMap<>();
        for(int vd:map.keySet()){
            TreeSet<Integer> all  = map.get(vd);
            for(int t:all){
                hs.put(t,c);
                c--;
  
            }
        }

        long sum =0;
        for(int i=0;i<graph.length;i++){
            ArrayList<edge> neigh = graph[i];
            int t = hs.get(i);
            for(int j=0;j<neigh.size();j++){
                int g = neigh.get(j).dest;
                int val = hs.get(g);
                int add = t+val;
                sum+=add;
            }
        }

     
        return sum/2;


    }
}