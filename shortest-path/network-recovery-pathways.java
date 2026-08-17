class Solution {
     HashMap<Integer, List<int[]>> hmap = new HashMap<>();
    int maxedge = 0;
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        hmap = new HashMap<>();
        int n =online.length;
        for(int edge[] : edges){
            int src = edge[0];
            int destination = edge[1];
            int cost =edge[2];

            if(!online[src] || !online[destination] )
                continue;
            
            if(!hmap.containsKey(src))
                hmap.put(src, new ArrayList<>());
            
            hmap.get(src).add(new int[]{destination,cost});
            maxedge = Math.max(maxedge,cost);
        }
        int left =0,right = maxedge;

        int ans=-1;
        while(left <=  right){
            int mid = left +(right -left)/2;
            if(dijkstra(mid,k,n)){
                ans= mid;
                left = mid+1;
            }
            else{
                right = mid-1; 
            }
        }
        return ans;

        
    }
    boolean dijkstra(int maxedge, long k,int n){
        long[] distance =new long[n];
        Arrays.fill(distance,Long.MAX_VALUE);
        distance[0] = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));

        pq.offer(new long[]{0,0});

        while(!pq.isEmpty()){
            long curr[] = pq.remove();
            int node = (int)curr[0]; long costsofar = curr[1];
            if(costsofar>distance[node])
                continue;
            if(node == n-1)
                return costsofar<= k;
            List<int[]> list = hmap.get(node);
            if(list ==null)
                continue;
            for(int next[] : list ){
                int edge =next[1];
                int nextnode = next[0];
                if(edge <maxedge)
                    continue;
                long nextcost = costsofar + edge;
                if(nextcost > k)
                    continue;
                if(nextcost < distance[nextnode]){
                    distance[nextnode] = nextcost;
                    pq.offer(new long[]{nextnode, nextcost});
                }
            }    
        }
        return false;
    }
}