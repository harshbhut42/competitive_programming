long ClosetPairofPoints(long p[][]){
	sort(p,new Comparator<long[]>()
	{
		@Override
		public int compare(long[] a, long[] b)
		{
			return Long.compare(a[0], b[0]);
		}
	});
	TreeSet<long[]> ts = new TreeSet<>(new Comparator<long[]>()
	{
		@Override
		public int compare(long[] a, long[] b)
		{
			if(a[1]==b[1])
				return Long.compare(a[0], b[0]);
			return Long.compare(a[1], b[1]);
		}
	});
	long h = Long.MAX_VALUE;
	int N = p.length;
	long sq = (long)sqrt(h);
	int x = 0;
	for(int i = 0;i < N;i++) {
		while(p[x][0] < p[i][0]-sq) {
			ts.remove(new long[]{x,p[x][1]});
			x++;
		}
		long[] f = ts.higher(new long[]{-1,p[i][1]-sq});
		long[] s = ts.higher(new long[]{-1,p[i][1]+sq+1});
		Set<long[]> sub = null;
		if(f != null && s != null){
			sub = ts.subSet(f, s);
		}else if(f != null){
			sub = ts.tailSet(f);
		}else if(s != null){
			sub = ts.headSet(s);
		}
		if(sub != null){
			for(long[] cur : sub) {
				int j = (int)cur[0];
				long v = (p[i][0]-p[j][0])*1L*(p[i][0]-p[j][0])+ (p[i][1]-p[j][1])*1L*(p[i][1]-p[j][1]);
				if(h > v){
					h = v;
					sq = (long)Math.sqrt(h);
				}
			}
		}
		ts.add(new long[]{i,p[i][1]});
	}
	return h;
}
