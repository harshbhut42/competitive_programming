public String fractionToDecimal(long n, long d) {
	    StringBuilder ans = new StringBuilder();
	    if((n<0 && d>=0) || (n>0 && d<0))
	        ans.append("-");
	        
	    n = Math.abs(n);
	    d= Math.abs(d);
	   //System.out.println(n + " " + d + " " + ans);
	   ans.append(n/d);
	   if(n%d!=0){
	       ans.append(".");
	   }else
	     return ans.toString();
	   HashMap<Long,Integer> h = new HashMap<>();
	  long cd = (n%d);
	   while(cd!=0 && !h.containsKey(cd)){
	       h.put(cd,ans.length());
            cd*=10;
	      ans.append(cd/d);
	      cd = cd%d;
	   }
	   if(cd!=0)
	   return ans.substring(0,h.get(cd)) + "(" + ans.substring(h.get(cd)) + ")";
	   return ans.toString();
	}
