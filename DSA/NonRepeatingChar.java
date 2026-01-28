public class NonRepeatingChar {
    public static int firstChar(String s ){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count =0;
            for(int j=0;j<s.length();j++){
               if(s.charAt(j)==ch) 
               {
                count++;
               }
            }
            if(count==1){
                return i;
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.print(firstChar(s));
    }
    
}
