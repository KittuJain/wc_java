public class Wc {
	public int getLines(String text){
		int numOfLines = 0;
		for (int i = 0; i < text.length(); i++ ) {
			if(text.charAt(i) == '\n')
				numOfLines++;
		}
		return numOfLines;
	}
	public int getWords(String text){
		int numOfWords = 1;
		for (int i = 0; i < text.length(); i++ ) {
			if(text.charAt(i) == ' ')
				numOfWords++;
		}
		return numOfWords;
	}
}