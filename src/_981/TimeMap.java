package _981;

import java.util.HashMap;
import java.util.Map;

public class TimeMap {
	/** Initialize your data structure here. */
	Map<String, Map<Integer, String>> map;

	public TimeMap() {
		map = new HashMap<String, Map<Integer, String>>();
	}

	public void set(String key, String value, int timestamp) {
		Map<Integer, String> nullMap = new HashMap<Integer, String>();
		if (map.get(key) == null) {
			map.put(key, nullMap);
		}
		map.get(key).put(timestamp, value);
	}

	public String get(String key, int timestamp) {
		for (int i = timestamp; i > 0; i--) {
			if (map.get(key) == null) {
				return "";
			}
			if (map.get(key).get(i) != null) {
				return map.get(key).get(i);
			}
		}
		return "";
	}
}

/**
 * Your TimeMap object will be instantiated and called as such: TimeMap obj =
 * new TimeMap(); obj.set(key,value,timestamp); String param_2 =
 * obj.get(key,timestamp);
 */