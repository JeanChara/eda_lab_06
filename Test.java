public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words into the trie
        trie.insert("manzana");
        trie.insert("platano");
        trie.insert("cereza");

        // Search for words in the trie
        System.out.println(trie.search("manzana")); // true
        System.out.println(trie.search("naranja")); // false

        // Check if the trie contains words with a given prefix
        System.out.println(trie.startsWith("a")); // true
        System.out.println(trie.startsWith("b")); // true
        System.out.println(trie.startsWith("c")); // true
        System.out.println(trie.startsWith("d")); // false

        // Replace words in a string using the trie
        trie.reemplazarPalabra("cereza", "peras");
        System.out.println(trie.toString()); // "peras"

        // Insert more words into the trie
        trie.insert("mandarina");
        trie.insert("sauco");

        // Convert the trie to a string
        System.out.println(trie.toString()); // "manzana mandarina cereza fecha sauco"
    }
}
