/**
 * DA-IICT
 * Author : Savaliya Sagar
 */
import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.fill;
import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;

public class Main
{
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	void solve() throws IOException{}
	void run() throws Exception{
		 out = new PrintWriter(System.out);
	     InputStream is = System.in;
		 reader = new BufferedReader(new InputStreamReader(is), 32768);
	     tokenizer = null;
	     solve();
	     out.flush();
	}
	BufferedReader reader;
	StringTokenizer tokenizer;
	public static void main(String[] args) throws Exception{
		new Thread(null, new Runnable(){
			public void run(){
				try{
					new Main().run();
				} catch (Exception e){	e.printStackTrace();}
			}
		}, "1", 1 << 26).start();
	}
	public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
    public int ni() { return Integer.parseInt(next()); }
    public long nl() { return Long.parseLong(next());   }
    public Double nd() {  return Double.parseDouble(next());   }
    public String ns() throws IOException{ return reader.readLine();  }
}
