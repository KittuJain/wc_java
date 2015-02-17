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
		if(text.length()==0)
			return 0;
		String[] splitedText = text.split(" ");
		return splitedText.length;
	}

	public int getChars(String text){
		if(text.length()==0)
			return 0;
		byte[] splitedText = text.getBytes();
		return splitedText.length;
	}
}