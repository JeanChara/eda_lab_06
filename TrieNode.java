public class TrieNode {
    private TrieNode[] children;
    private boolean IsEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // una matriz de tamaño fijo para almacenar los hijos
        IsEndOfWord = false;
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public boolean isIsEndOfWord() {
        return IsEndOfWord;
    }

    public void setIsEndOfWord(boolean endOfWord) {
        this.IsEndOfWord = endOfWord;
    }
}