package javacollections;
import java.util.Hashtable;
import java.util.Set;

public class Reterive_hashtbl_keyvalues {

	public static void main(String[] args) {
		                                      // Retrieve Hashtable Values Using Keys in Java With Example?

		Hashtable<String, String> hm = new Hashtable<String,String>();
		//add key-value pair to Hashtable
		hm.put("one", "onevalueinsert");
		hm.put("Two", "twoValueinsert");
		hm.put("Third", "thirdValueinsert");
		System.out.println(hm);
		
		Set<String> keys = hm.keySet();
		for (String key: keys)
		{
			System.out.println(key);
		}
		
	}

}
