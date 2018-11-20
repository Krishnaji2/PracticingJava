
public class StringPermutation {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.length());
		System.out.println((int)Math.pow(2, str.length()));
		for(int i=0; i< str.length(); i++) {
			for(int j=i;j< str.length()-1; j++) {
				System.out.println(""+str.charAt(i));
			}
		}
		
	}	
}
