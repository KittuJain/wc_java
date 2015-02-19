public class WcLib {
	String text, option;
	int lines, words, chars;
	public WcLib(String text){
		this.text = text;
	}

	public WcLib(String text, String option){
		if(text.charAt(0) == '-'){
			String contents = text;
			text = option;
			option = contents;
		}
		
		this.text = text;
		this.option = option;
	}

	public String[] getLines(){
		return text.split("\r\n");
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
		return text.length();
	}

	public void getWordCount(){
		this.lines = countLines();
		this.words = countWords();
		this.chars = countChars();
	}
	
	public String toString(){
		if(option!=null){
			switch(option){
				case "-l" : return ""+lines;
				case "-w" : return ""+words;
				case "-c" : return ""+chars;
			}
		}
		return lines + " " + words + " " + chars;
	}
}