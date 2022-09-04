package LeedCode.SomeGoodAndSolved;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-04-14 08
 */
public class Trie {
    Trie[] children;
    boolean isEnd;
    /** Initialize your data structure here. */
    public Trie() {
        children=new Trie[26];
        isEnd=false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie trie=this;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            int index=a-'a';
            if(trie.children[index]==null){
                trie.children[index]=new Trie();
            }
            trie=trie.children[index];
        }
        trie.isEnd=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie trie=ultimateSearch(word);
        return trie!=null&&trie.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return ultimateSearch(prefix)!=null;
    }
    public Trie ultimateSearch(String value){
        Trie trie=this;
        for(int i=0;i<value.length();i++){
            int index=value.charAt(i)-'a';
            if(trie.children[index]==null){
                return null;
            }
            trie=trie.children[index];
        }
        return trie;
    }
}
