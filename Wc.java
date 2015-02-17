public class Wc {
	public int getLines(String text){
		int numOfLines = 0;
		for (int i = 0; i < text.length(); i++ ) {
			if(text.charAt(i) == '\n')
				numOfLines++;
		}
		return numOfLines;
	}
}