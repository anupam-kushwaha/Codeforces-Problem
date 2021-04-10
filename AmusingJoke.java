import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
  
public class AmusingJoke { 
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
    
    static String solve(String str1, String str2, String str3) {
    	int n1, n2, n3;
    	n1 = str1.length();
    	n2 = str2.length();
    	n3 = str3.length();
    	
    	int[] freq = new int[26];
        for(int i = 0; i < n3; i++) {
        	freq[str3.charAt(i)-'A'] += 1;
        }
        for(int i = 0; i < n2; i++) {
        	freq[str2.charAt(i)-'A'] -= 1;
        }
        for(int j = 0; j < n1; j++) {
        	freq[str1.charAt(j)-'A'] -= 1;	
        }
        
        for(int i = 0; i < freq.length; i++) {
        	if(freq[i] != 0) {
        		return "NO";
        	}
        }
        return "YES";
    }
  
    public static void main(String[] args) { 
        FastReader sc = new FastReader(); 
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        
        String ans = solve(str1, str2, str3);
        System.out.println(ans);
         
    } 
} 