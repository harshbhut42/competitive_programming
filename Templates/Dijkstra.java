int dist[] = new int[n+1];
boolean visited[] = new boolean[n+1];
public void dijkstra(int source,int n){
	Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        dist[source]=0;
        pq.add(new Pair(dist[source],source));
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            int current = (int) cur.v;
            visited[current] = true;
            for(Pair p:g.get(current)){
                if(!visited[(int) p.u]){
                    if(dist[(int) p.u]>dist[current]+p.v){
                        dist[(int) p.u]=dist[current]+(int)p.v;
                        pq.add(new Pair(dist[(int) p.u],p.u));
                    }
                }
            }
        }
}
class Pair implements Comparable<Pair> {
		long u;
		long v;

		public Pair(long u, long v) {
			this.u = u;
			this.v = v;
		}

		public int hashCode() {
			return Objects.hash();
		}

		public boolean equals(Object o) {
			Pair other = (Pair) o;
			return u == other.u && v == other.v;
		}

		public int compareTo(Pair other) {
			return Long.compare(u, other.u) != 0 ? Long.compare(u, other.u)
					: Long.compare(v, other.v);
		}

		public String toString() {
			return "[u=" + u + ", v=" + v + "]";
		}
}
