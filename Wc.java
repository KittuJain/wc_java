public class Wc {

	public static void main(String[] args) {
		Wc wc = new Wc();
		String text = System.console().readLine();
		System.out.println(wc.getWordCount(text));
	}

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
		return text.split(" ").length + getLines(text).length-1;
	}

	public int countChars(String text){
		if(getLines(text).length > 1)
			return text.length() + getLines(text).length;
		return text.length();
	}

	public String getWordCount(String text){
		return countLines(text) +" " +countWords(text)+" "+ countChars(text);
	}
}