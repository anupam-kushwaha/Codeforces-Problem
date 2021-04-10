import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
  
public class HitTheLottery { 
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
    
    static int cnt = 0;
    static int minCoins(int[] coins, int m, int v) {
    	
    	int[] table = new int[v+1];
    	table[0] = 0;
    	
    	for(int i = 1; i <= v; i++) {
    		table[i] = Integer.MAX_VALUE;
    	}
    	
    	
    	for(int i = 1; i <= v; i++) {
    		for(int j = 0; j < m; j++) {
    			if(coins[j] <= i) {
    				int sub_res = table[i-coins[j]];
    				if(sub_res != Integer.MAX_VALUE && sub_res+1 < table[i]) {
    					table[i] = sub_res+1;
    					cnt++;
    				}
    			}
    		}
    	}
    	return table[v];
    }
    
    public static void main(String[] args) {
    	FastReader sc = new FastReader();
    	int v = sc.nextInt();
    	int[] coins = {1, 5, 10, 20, 100};
    	int m = coins.length;
    	System.out.println(minCoins(coins, m, v));
    	
    }
} 