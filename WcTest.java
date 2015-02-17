import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getLines_gets_the_lines_as_string (){
		String text = "hello, this is a good day.";
		Wc wc = new Wc();
		assertTrue(text.equals(wc.getLines(text)[0]));
	}

	@Test
	public void countLines_gives_0_for_empty_string (){
		String text = "";
		Wc wc = new Wc();
		assertEquals(0,wc.countLines(text));
	}

	@Test
	public void countLines_gives_1_for_string_with_one_line (){
		String text = "hello, this is a good day.\n";
		Wc wc = new Wc();
		assertEquals(1,wc.countLines(text));
	}	

	@Test
	public void countLines_gives_2_for_two_lines_present_in_a_string (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		Wc wc = new Wc();
		assertEquals(2,wc.countLines(text));
	}

	@Test
	public void countWords_gives_0_for_empty_string (){
		String text = "";
		Wc wc = new Wc();
		assertEquals(0,wc.countWords(text));
	}

	@Test
	public void countWords_gives_0_for_no_words_in_a_string (){
		String text = " ";
		Wc wc = new Wc();
		assertEquals(0,wc.countWords(text));
	}

	@Test
	public void countWords_gives_1_for_one_word_in_a_string (){
		String text = "Hello";
		Wc wc = new Wc();
		assertEquals(1,wc.countWords(text));
	}

	@Test
	public void countWords_gives_6_for_six_words_in_a_string (){
		String text = "hello, this is a good day.";
		Wc wc = new Wc();
		assertEquals(6,wc.countWords(text));
	}

	@Test
	public void countChars_gives_0_for_empty_string (){
		String text = "";
		Wc wc = new Wc();
		assertEquals(0,wc.countChars(text));
	}

	@Test
	public void countChars_gives_5_for_hello (){
		String text = "hello";
		Wc wc = new Wc();
		assertEquals(5,wc.countChars(text));
	}

	@Test
	public void countChars_gives_19_for_hello_How_are_you (){
		String text = "hello, How are you?";
		Wc wc = new Wc();
		assertEquals(19,wc.countChars(text));
	}

	@Test
	public void countChars_gives_48_for_hello_How_are_you (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		Wc wc = new Wc();
		assertEquals(48,wc.countChars(text));
	}
}