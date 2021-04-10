import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  
public class Pangrams { 
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
    
    static String isPangrams(String s, int n) {
    	boolean[] visited = new boolean[26];
    	int index = 0;
    	
    	if(n < 26) {
    		return "NO";
    	}
    	
    	for(int i = 0; i < n; i++) {
    		if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
    			index = s.charAt(i)-'A';
    		}else if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
    			index = s.charAt(i)-'a';
    		}else {
    			continue;
    		}
    		visited[index] = true;
    	}
    	for(int i = 0; i < visited.length; i++) {
    		if(visited[i] == false) {
    			return "NO";
    		}
    	}
    	return "YES";
    }
  
    public static void main(String[] args) {
        FastReader sc = new FastReader(); 
        int n = sc.nextInt();
        String s = sc.next();
    	
        //long start = System.currentTimeMillis();
        String ans = isPangrams(s, n);
        System.out.println(ans);
      //  long end = System.currentTimeMillis();
      //  System.out.println("time:"+ (end-start));
       
    } 
} 