
import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class MyOwnHashTable {
	ArrayList<KeyValue>[] data;
	int currentLength;

	public MyOwnHashTable(int size) {
		data = new ArrayList[size];
		currentLength = 0;
	}

	private int _hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + key.charAt(i) * i) % data.length;
		}
		return hash;
	}

	public void set(String key, int value) {
		int address = _hash(key);
		if (data[address] == null) {
			ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
			data[address] = arrayAtAddress;
			currentLength++;
		}
		KeyValue pair = new KeyValue(key, value);
		data[address].add(pair);
	}

//	public Integer get(String key) {
//		int address = _hash(key);
//		ArrayList<KeyValue> bucket = data[address];
//		if (bucket != null) {
//			for (KeyValue keyValue : bucket) {
//				if (keyValue.getKey().equals(key)) {
//					return keyValue.getValue();
//				}
//			}
//		}
//		return null; // return null when key does not exist.
//	}
}
