package CodingBlocks.Lec39;


public class palidromeString {
    public static boolean main(String[] args) {
        boolean ans=true;
        String s = "madam";
        int i = 0;
        int j = s.length()-1;
        while(i<s.length()-1){
            if(s.charAt(i)!=s.charAt(j)){
                ans= false;
            }
        }
        return ans;
        

    }
   
}
