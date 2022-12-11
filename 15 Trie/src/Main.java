public class Main {

	public static void main(String[] args) {
		Trie trie = new Trie();

		trie.insert("heating");
		trie.insert("heat");

		System.out.println(trie.root.children.get('h').children.get('e').children);
		System.out.println(trie.delete("heat"));
		System.out.println(trie.findWord("heat"));
		System.out.println(trie.root.children.get('h').children.get('e').children);
	}

}
