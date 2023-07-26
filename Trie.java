import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {
    private TrieNode root;
    private int contador;
    private Map<Integer, String> wordMap;

    public Trie() {
        root = new TrieNode();
        contador = 0;
        wordMap = new HashMap<>();
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';

            if (currentNode.getChildren()[index] == null) {
                currentNode.getChildren()[index] = new TrieNode();
            }

            currentNode = currentNode.getChildren()[index];
        }

        // Al llegar al final de la palabra, se marca como fin de palabra y se asigna el
        // número
        if (!currentNode.getIsEndOfWord()) {
            currentNode.setIsEndOfWord(true);
            ;
            contador++;
            currentNode.nume = contador;
            currentNode.word = word;
            wordMap.put(contador, word);
        }
    }

    /*
     * Inicia en la raiz del trie y lo recorre
     * Comprueba si existe un nodo hijo correspondiente al código ASCII
     * Si existe se pasa al siguiente nodo sino la búsqueda se detiene
     * Al final se comprueba si el último nodo es el final de una palabra
     */

    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int indexASCII = ch - 'a';
            if (current.getChildren()[indexASCII] == null)
                return false;
            current = current.getChildren()[indexASCII];
        }

        return current.getIsEndOfWord();
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int indexASCII = ch - 'a';
            if (current.getChildren()[indexASCII] == null)
                return false;
            current = current.getChildren()[indexASCII];
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

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= contador; i++) {
            String word = wordMap.get(i);
            if (word != null) {
                result.append(word).append(" ");
            }
        }
        return result.toString();
    }
}
