class MinCht{
		int N = 100005;
		long M[] = new long[N];
		long B[] = new long[N];
		int p = 0;
		int sz = 0;
		void add(long m, long b)
		{
			M[sz] = m;
			B[sz] = b;
			sz++;
			while(sz >= 3 && bad(sz-3, sz-2,sz-1))
			{
				M[sz-2] = M[sz-1];
				B[sz-2] = B[sz-1];
				sz--;
			}
		}
		long get(long x,int i) {
			return M[i]*x+B[i];
		}
		
		long query(long x)
		{
			int lo = 0;
			int hi = sz-1;
			int res = 0;
			while(lo < hi)
			{
				int m = lo + (hi-lo)/2;
				long v1 = get(x,m);
				long v2 = get(x,m+1);
				if(v1 >= v2) {    // for max -> v1<=v2
					lo = m+1;
					res = m+1;
				}
				else hi = m;
			}
			return get(x,res);
			//if(p >= M.size()) p = M.size()-1;
			//while(p < M.size()-1 && get(x,p+1) >= get(x,p) p++;
			//return get(x,p);
		}
		boolean bad(int l1, int l2, int l3)
		{
			return (double)(B[l3]-B[l1])/(double)(M[l1]-M[l3]) <= (double)(B[l2]-B[l1])/(double)(M[l1]-M[l2]);
			//return (B.get(l3)-B.get(l1))*(M.get(l1)-M.get(l2)) <= (B.get(l2)-B.get(l1))*(M.get(l1)-M.get(l3));
		}
	}
