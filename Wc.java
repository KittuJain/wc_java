public class Wc {
	String text;

	public Wc(String text){
		this.text = text;
	}

	public String[] getLines(){
		return text.split("\n");
	}

	public int countLines(){
		if(text.length() == 0)
			return 0;
		return getLines().length;
	}

	public int countWords(){
		if(text.length() == 0)
			return 0;
		return text.split(" ").length + getLines().length-1;
	}

	public int countChars(){
		if(getLines().length > 1)
			return text.length() + getLines().length;
		return text.length();
	}

	public String getWordCount(){
		return countLines() +" " +countWords()+" "+ countChars();
	}
}