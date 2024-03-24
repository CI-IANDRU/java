
public class Sam1
{
    static String longestPalin(String S){
        // code here
        int j=S.length()-1;
        int i=0;
        int f=0;
        int l=j;

        
       while(i<=j){
            if(S.charAt(i)==S.charAt(j)){
            i++;
            j--;
            if(i==j ||j<i)
             return S.substring(f,l);
            }
            else if(S.charAt(i)==S.charAt(j-1)){
                f=i;
                l=j;
                j--;
                 if(i==j ||j<i)
                 return S.substring(f,l);
    
        
            }
            else if(S.charAt(i+1)==S.charAt(j)){
                i++;
                f=i;
                l=j;
                 if(i==j ||j<i)
                 return S.substring(f,l);
                
            }
        }
        return S;
        
        
    }
    public static void main(String[] args) {
		System.out.println(longestPalin("aaaabbaa"));
	}
}