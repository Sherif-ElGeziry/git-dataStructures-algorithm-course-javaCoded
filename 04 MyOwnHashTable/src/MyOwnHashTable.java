
import java.util.ArrayList;

public class MyOwnHashTable {
	ArrayList<KeyVal>[] data;
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
			ArrayList<KeyVal> arrayAtAddress = new ArrayList<>();
			data[address] = arrayAtAddress;
			currentLength++;
		}
		KeyVal pair = new KeyVal(key, value);
		data[address].add(pair);
	}

	public Integer get(String key) {
		int address = _hash(key);
		ArrayList<KeyVal> bucket = data[address];
		if (bucket != null) {
			for (KeyVal KeyVal : bucket) {
				if (KeyVal.getKey().equals(key)) {
					return KeyVal.getValue();
				}
			}
		}
		return null; // return null when key does not exist.
	}

	public String[] keys() {
		ArrayList<KeyVal>[] bucket = data;
		String[] keysArray = new String[currentLength];
		int count = 0;
		for (ArrayList<KeyVal> keyValues : bucket) {
			if (keyValues != null) {
				keysArray[count] = keyValues.get(0).getKey();
				count++;
			}
		}
		return keysArray;
	}
}
