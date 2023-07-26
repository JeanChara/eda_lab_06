public class TrieNode {
    private TrieNode[] children;
    private boolean IsEndOfWord;
    public int nume;
    public String word;

    public TrieNode() {
        children = new TrieNode[26]; // una matriz de tamaño fijo para almacenar los hijos
        IsEndOfWord = false;
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public boolean getIsEndOfWord() {
        return this.IsEndOfWord;
    }

    public void setIsEndOfWord(boolean endOfWord) {
        this.IsEndOfWord = endOfWord;
    }
    
    public int getNume(){
      return nume;
    }
}
