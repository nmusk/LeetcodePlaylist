
public class ValidParenthesis {

	public static void  main(String[] args) {

		String s="({}[]";
		System.out.println(validParenthesis(s));

	}

	public static boolean validParenthesis(String s) {
		
		while(true) {
			if (s.contains("()")) {
				
			s= s.replace("()", "");
				
			}
			else if(s.contains("{}")) {
				
				s= s.replace("{}", "");
				
			}
			else if (s.contains("[]")){
				
				s=s.replace("[]", "");
				
			}
			else {
				return s.isEmpty();
				
			}
	
		}
		
	}
}
