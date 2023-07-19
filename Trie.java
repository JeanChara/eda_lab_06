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

    public String reemplazar(String text) {
            
        StringBuilder result = new StringBuilder();
        List<String> words = Arrays.asList(text.split("\\s+")); // Dividir el texto en palabras

        for (String word : words) {
            if (search(word)) { // Verificar si la palabra está en el Trie
                                           // Reemplazar la palabra por la deseada
                result.append("REeMPLAZO"); // Reemplazar "REEMPLAZO" con la palabra deseada
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim(); // Eliminar el espacio en blanco final y devolver el texto resultante
    }
}
