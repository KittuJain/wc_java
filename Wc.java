public class Wc {

	public String[] getLines(String text){
		return text.split("\n");
	}

	public int countLines(String text){
		if(text.length() == 0)
			return 0;
		return getLines(text).length;
	}

	public int countWords(String text){
		if(text.length() == 0)
			return 0;
		String[] splitedText = text.split(" ");
		return splitedText.length;
	}

	public int countChars(String text){
		String[] textSplittedByLine = getLines(text);
		int numberOfWords = 0;
		for (int i = 0; i < textSplittedByLine.length; i++ ) {
			if(textSplittedByLine.length>1)
				numberOfWords += 2;
			numberOfWords += textSplittedByLine[i].length();
		}
		return numberOfWords;
	}
}