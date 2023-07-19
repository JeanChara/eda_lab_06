public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.getChildren()[index] == null) {
                current.getChildren()[index] = new TrieNode();
            }
            current = current.getChildren()[index];
        }
        current.setIsEndOfWord(true);
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.getChildren()[index] == null) {
                return false;
            }
            current = current.getChildren()[index];
        }
        return current.isIsEndOfWord();
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (current.getChildren()[index] == null) {
                return false;
            }
            current = current.getChildren()[index];
        }
        return true;
    }
}