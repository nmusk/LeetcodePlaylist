import java.util.Arrays;

public class CommonPrefix {
	public static void main (String[] args ) {
		
		String strs[] = {"floweer" ,"flow" , "flight" };
		System.out.println(longestCommonPrefix(strs));
		
		
		
	}
	
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs [strs.length-1];
        int index=0;
        while(index < str1.length()){
            if(str1.charAt[index]==str2.charAt[index]){
                index++ ;

            }
            else {
                break ;

            }

            return index==0?"":str1.substring(0,index);
        }

    }
}
