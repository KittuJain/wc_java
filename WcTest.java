import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getLines_gives_0_for_empty_string (){
		String text = "";
		Wc wc = new Wc();
		assertEquals(0,wc.getLines(text));
	}

	@Test
	public void getLines_gives_1_for_string_with_one_line (){
		String text = "hello, this is a good day.\n";
		Wc wc = new Wc();
		assertEquals(1,wc.getLines(text));
	}	

	@Test
	public void getLines_gives_2_for_two_lines_present_in_a_string (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		Wc wc = new Wc();
		assertEquals(2,wc.getLines(text));
	}

	@Test
	public void getWords_gives_0_for_no_words_in_a_string (){
		String text = " ";
		Wc wc = new Wc();
		assertEquals(0,wc.getWords(text));
	}

	@Test
	public void getWords_gives_1_for_one_word_in_a_string (){
		String text = "Hello";
		Wc wc = new Wc();
		assertEquals(1,wc.getWords(text));
	}

	@Test
	public void getWords_gives_6_for_six_words_in_a_string (){
		String text = "hello, this is a good day.";
		Wc wc = new Wc();
		assertEquals(6,wc.getWords(text));
	}

	@Test
	public void getChars_gives_5_for_hello (){
		String text = "hello";
		Wc wc = new Wc();
		assertEquals(5,wc.getChars(text));
	}

	@Test
	public void getChars_gives_19_for_hello_How_are_you (){
		String text = "hello, How are you?";
		Wc wc = new Wc();
		assertEquals(19,wc.getChars(text));
	}
}