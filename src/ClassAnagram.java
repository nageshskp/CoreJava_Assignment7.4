
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ClassAnagram {
	
	public void groupAnagramWords (String words[])
	{

	HashMap<Integer, List> hm = new HashMap <Integer, List> ();

	for(String val:words){
	int hash = getHash(val);
	List<String> wordList = new ArrayList<String> ();


	if (hm.containsKey(hash))
	{
	wordList = hm.get(hash); 
	wordList.add(val); 
	hm.put(hash,wordList ); 
	}
	else
	{
	wordList.add(val); 
	hm.put(hash, wordList); // put hash key 
	}
	}

	System.out.println(hm.toString());
	}

	static int getHash(String val){
	char[] c = val.toCharArray();
	int hash = 0;
	for(char ch:c){
	String sc = String.valueOf(ch);
	hash=hash+sc.hashCode();
	}
	return hash;
	}
	
	public static void main(String[] args) {
	
		String wordArr[] = {"listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what", "shit"};
		
		ClassAnagram clsAnagram =new ClassAnagram();
		
		clsAnagram.groupAnagramWords(wordArr); 
	}
}