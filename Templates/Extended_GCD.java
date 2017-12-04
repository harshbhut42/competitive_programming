public static long Extended_gcd(long a, long b,long x[]) {
        if(b==0){
            x[0] = 1;
            x[1] = 0;
            return a;
        }
        long _x[] = new long[2];
        long gcd = Extended_gcd(b,a%b,_x);
        x[0] = _x[1];
        x[1] = _x[0] - (a/b)*_x[1];
        return gcd;
    }
