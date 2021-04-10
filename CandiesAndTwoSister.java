import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
  
public class CandiesAndTwoSister { 
    static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
    
    static long numOfWays(long n) {
    	long cnt = 0L;
    	if((n % 2 == 0)) {
    		cnt = (n/2)-1;
    	}else {
    		cnt = n/2;
    	}
    	return cnt;
    }
    
    public static void main(String[] args) { 
        FastReader sc = new FastReader(); 
        int t = sc.nextInt(); 
        
        long n = 0L;
        while(t > 0) {
        	n = sc.nextLong();
        	System.out.println(numOfWays(n));
        	t--;
        }
    } 
}
