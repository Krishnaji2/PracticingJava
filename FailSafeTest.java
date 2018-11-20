import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// Set<String> list = new LinkedHashSet<>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("666");
		list.add("777");
		
		// CopyOnWriteArraySet<String> list1 = new CopyOnWriteArraySet<String>(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String val = itr.next();
			if (val == "222") {
				itr.remove();
			} else
				//list.add("777**");
				System.out.println(val);
		}
		System.out.println(list);
		
		
//		System.out.println(list);
//		Map<String, String> hm = new ConcurrentHashMap<>();
//		hm.put("11", "1111");
//		hm.put("12", "1112");
//		hm.put("13", "1113");
//		hm.put("14", "1114");
//		//CopyOnWriteArrayList
//		Set<Map.Entry<String, String>> entry = hm.entrySet();	
//		Iterator<Entry<String, String>> itr1 = entry.iterator();
//		while(itr1.hasNext()) {
//			hm.put("15", "1115");
//			hm.put("15", "1115");
//			hm.put("16", "1116");
//			hm.remove("12");
//			Entry<String, String> me = itr1.next();
//			System.out.println(me.getKey()+" " + me.getValue());
//		}
//		
//				
	}

}
