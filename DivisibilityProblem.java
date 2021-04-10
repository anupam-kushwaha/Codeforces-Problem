import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
  
public class DivisibilityProblem { 
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
  
    public static void main(String[] args) { 
        FastReader sc = new FastReader(); 
        int n = sc.nextInt();
        int a, b, r;
        while(n > 0) {
        	a = 0; b = 0; r = 0;
        	
        	a = sc.nextInt();
        	b = sc.nextInt();
        	
        	r = a % b;
        	if(r == 0) {
        		System.out.println(r);
        	}else {
        		System.out.println(b-r);
        	}
        	
        	n--;
        }
         
    } 
} 