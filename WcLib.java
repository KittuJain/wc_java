public class WcLib {
	String text;

	public WcLib(String text){
		this.text = text;
	}

	public String[] getLines(){
		return text.split("\n");
	}

	public int countLines(){
		int numOfLines = 0;
		for (int i = 0; i < text.length(); i++ ) {
			if(text.charAt(i) == '\n')
				numOfLines++;
		}
		return numOfLines;
	}

	public int countWords(){
		if(text.length() == 0)
			return 0;
		return text.split(" ").length + getLines().length-1;
	}

	public int countChars(){
		return text.length() + countLines();
	}

	public String getWordCount(){
		return countLines() +" " +countWords()+" "+ countChars();
	}
}