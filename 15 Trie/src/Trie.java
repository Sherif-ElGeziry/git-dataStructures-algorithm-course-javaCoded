public class Trie {
	public final MyNode root = new MyNode();

	public void insert(String string) {
		MyNode current = root;

		/*
		 * for each character in the word check if that character exists in hashmap, if
		 * not then add the character as a key in the map and a new node as its value.
		 * Do this until all characters are traversed.
		 */

		for (char ch : string.toCharArray()) {
			current.children.putIfAbsent(ch, new MyNode());
			current = current.children.get(ch);
		}

		current.isWord = true;
	}

	// check if word is present in the trie
	public boolean findWord(String string) {
		MyNode current = root;
		for (char ch : string.toCharArray()) {
			if (current.children.containsKey(ch)) {
				current = current.children.get(ch);
			} else {
				return false;
			}
		}
		return current.isWord;
	}

	public boolean delete(String word) {
//		MyNode current = root;
//		MyNode deleteAfter = root;
//		char ch1 = word.charAt(0); // char '\0' = null
//
//		for (int i = 0; i < word.length(); i++) {
//			char ch = word.charAt(i);
//			if (current.children.containsKey(ch)) {
//				current = current.children.get(ch);
//				if (current.children.size() > 1) {
//					deleteAfter = current;
//					ch1 = word.charAt(i + 1);
//				}
//			} else {
//				return false;
//			}
//		}
//
//		if (current.children.isEmpty()) {
//			deleteAfter.children.remove(ch1);
//			return true;
//		}
//
//		return false;

		MyNode current = root;
		MyNode deleteAfter = root;
		char ch1 = word.charAt(0); // char '\0' = NULL

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (current.children.containsKey(ch)) {
				current = current.children.get(ch);
				if (current.children.size() > 1) {
					deleteAfter = current;
					ch1 = word.charAt(i + 1);
				}
			} else {
				return false;
			}
		}

		if (current.children.isEmpty()) {
			deleteAfter.children.remove(ch1);
			return true;
		}
		return false;
	}

}
