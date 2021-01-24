package string;

import java.util.HashMap;
import java.util.Map;

public class CountTotalNoofEachWords {
	public static void main(String[] args) {

		String str = "This this is is done by Saket Saket";
		String[] newStr = str.split(" ");
		Integer count=0;
		Map<String, Integer> countWords = new HashMap<String, Integer>();
		for(int i=0;i<newStr.length;i++) {
			count = countWords.containsKey(newStr[i]) ? countWords.put(newStr[i], count)+1 : 1;
			countWords.put(newStr[i], count);
		}

		for(Map.Entry<String, Integer> entrySet : countWords.entrySet()) {
			System.out.println(entrySet.getKey() + " " + entrySet.getValue());
		}
	}
}
