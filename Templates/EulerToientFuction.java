int N = (int)1e7+10;
int p[] = new int[N];
int etf[] = new int[N];
void Phi(){
		for(int j=1;j<N;j++)	etf[j]=j;
		for(int i=2;i<N;i++){
			if(p[i]==0){
				etf[i]=i-1;
				for(int j=2;j*i<N;j++){
					p[i*j]=1;
					etf[i*j]-=etf[i*j]/i;
				}
			}
		}
}


//OR

int phi(int n) {
	    int res = n;
	    for (int i = 2; i * i <= n; i++)
	      if (n % i == 0) {
	        while (n % i == 0)
	          n /= i;
	        res -= res / i;
	      }
	    if (n > 1)
	      res -= res / n;
	    return res;
}
