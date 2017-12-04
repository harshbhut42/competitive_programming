public static String add(String s1,String s2){
  StringBuilder ans = new StringBuilder();
  if(s1.length()<s2.length()){
    int k = s2.length()-s1.length();
    StringBuilder zeros = new StringBuilder();
    while(k-->0){
      zeros.append("0");
    }
    s1 = zeros + s1;
  }else{
    int k = s1.length()-s2.length();
    StringBuilder zeros = new StringBuilder();
    while(k-->0){
      zeros.append("0");
    }
    s2 = zeros + s2;
  }
  int l = s1.length()-1;
  int carray = 0;
  while(l>=0){
    int d = carray + Character.getNumericValue(s1.charAt(l)) + Character.getNumericValue(s2.charAt(l));
    carray = d/10;
    d %= 10;
    ans.append(Integer.toString(d));
    l--;
  }
  if(carray!=0)
    ans.append(Integer.toString(carray));
  return ans.reverse().toString();
}
