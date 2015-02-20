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
		lines = numOfLines;
		return lines;
	}

	public int countWords(){
		if(text.length() == 0)
			return 0;
		words = text.split("\\s+").length;
		return words;
	}

	public int countChars(){
		chars = text.length();
		return chars;
	}

	public int[] getLengthsOfEachLine (){
		String[] lines = getLines();
		int lengths[] = new int[lines.length];
		for (int i = 0; i < lines.length; i++ ) {
			lengths[i] = lines[i].length();
		}
		return lengths;
	}

	public int getLongestLine (){
		int [] lengths = getLengthsOfEachLine();
		int greaterLength = 0;
		for(int length : lengths){
			if(length > greaterLength)
				greaterLength = length;
		}
		return greaterLength;
	}

	public int getShortestLine (){
		int [] lengths = getLengthsOfEachLine();
		int shortestLength = lengths[0];
		for(int length : lengths){
			if(length < shortestLength)
				shortestLength = length;
		}
		return shortestLength;
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
				case "-L" : return ""+getLongestLine();
				case "-S" : return ""+getShortestLine();
 			}
		}
		return "\t" + lines + "\t" + words + "\t" + chars;
	}
}