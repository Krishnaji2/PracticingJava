import java.util.ArrayList;
import java.util.List;

public class MainClass {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list);
		String s1 = "krishna";
		String s2 = "krishna";
//		if (s1 == s2)
//			System.out.println("equal using ==");
//		else
//			System.out.println("not equal using ==");
//
//		if (s1.equals(s2))
//			System.out.println("equal using equals");
//		else
//			System.out.println("not equal using equals");

		String s3 = new String("krishna");
		String s4 = new String("krishna");
		//s3 = s1;
		//s4 = s2;
		s1=s3.intern();
		//s2=s4;
		if (s3 == s1)
			System.out.println("equal using ==");
		else
			System.out.println("not equal using ==");

		if (s3.equals(s1))
			System.out.println("equal using equals");
		else
			System.out.println("not equal using equals");

	}
}