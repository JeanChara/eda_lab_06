public class TrieNode {
    private TrieNode[] children;
    private boolean endOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // una matriz de tamaño fijo para almacenar los hijos
        endOfWord = false;
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}