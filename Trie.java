public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

   public void insert(String palabra) {
        TrieNode trie_menor = root;
        for (int i=0; i<palabra.length(); i++) {
            char c = palabra.charAt(i);
            int in = c - 'a';
            if (trie_menor.getChildren()[in] == null) {
                trie_menor.getChildren()[in] = new TrieNode();
            }
            trie_menor = trie_menor.getChildren()[in];
        }
        trie_menor.setIsEndOfWord(true);
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
        return current.isEndOfWord();
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
