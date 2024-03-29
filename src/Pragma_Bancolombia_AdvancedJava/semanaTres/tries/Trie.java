package Pragma_Bancolombia_AdvancedJava.semanaTres.tries;
import java.util.ArrayList;

public class Trie {
    public Node root;

    public Trie() {
        this.root = new Node();
    }

    public ArrayList<String> words = new ArrayList<>();

    public void insertWord(String word) {
        Node currentNode = this.root;

        for(int i=0; i<word.length(); i++) {
            Character currentLetter = word.charAt(i);
            Node child = currentNode.children.get(currentLetter);

            if(child==null) {
                child = new Node();
                currentNode.children.put(currentLetter, child);
            }

            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }

    public boolean isPrefixValid(String prefix) {

        Node currentNode = this.root;

        for(int i=0; i<prefix.length(); i++) {
            Character currentLetter = prefix.charAt(i);
            Node child = currentNode.children.get(currentLetter);

            if(child==null) {
                return false;
            }
            currentNode = child;
        }

        return true;
    }

    public boolean isWordValid(String word) {

        Node currentNode = this.root;

        for(int i=0; i<word.length(); i++) {
            Character currentLetter = word.charAt(i);
            Node child = currentNode.children.get(currentLetter);

            if(child==null) {
                return false;
            }
            currentNode = child;
        }
//		currentNode.isCompleteWord = true;

        return currentNode.isCompleteWord;
    }

    public void printAllKeys() {
        for(String s:checkNext("")) {
            System.out.println(s);
        }
    }

    private ArrayList<String> checkNext(String wordKey) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String word = wordKey;
        for(int i=0; i<alphabet.length; i++) {
            if(isPrefixValid(word+alphabet[i])) {
                words.add(word+alphabet[i]);
                checkNext(word+alphabet[i]);
            }
        }

        return words;
    }
}
