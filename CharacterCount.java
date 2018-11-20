import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "kris  hku   mar fpoerertec rerb vdvgbrfe ";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		System.out.println(str.length());
		Map<Character, Integer> hm = new HashMap<>();
		for(int i =0; i <str.length(); i++) {
			Character ch = str.charAt(i);
			if(!hm.containsKey(ch))
				hm.put(ch, 1);
			else {
				int count = hm.get(ch);
				hm.put(ch, count+1);
			}
		}
		System.out.println(hm);
	}

}
