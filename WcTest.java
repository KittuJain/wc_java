import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getLines_gets_the_line_as_string (){
		String text = "hello, this is a good day.";
		WcLib wc = new WcLib(text);
		assertTrue(text.equals(wc.getLines()[0]));
	}

	@Test
	public void getLines_gets_the_lines_as_string (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		String line1 = "hello, this is a good day.";
		String line2 = "What do you think?";
		WcLib wc = new WcLib(text);
		assertTrue(line1.equals(wc.getLines()[0]));
		assertTrue(line2.equals(wc.getLines()[1]));
	}

	@Test
	public void countLines_gives_0_for_empty_string (){
		String text = "";
		WcLib wc = new WcLib(text);
		assertEquals(0,wc.countLines());
	}

	@Test
	public void countLines_gives_0_for_string_with_space (){
		String text = " ";
		WcLib wc = new WcLib(text);
		assertEquals(0,wc.countLines());
	}

	@Test
	public void countLines_gives_1_for_string_with_one_line (){
		String text = "hello, this is a good day.\n";
		WcLib wc = new WcLib(text);
		assertEquals(1,wc.countLines());
	}

	@Test
	public void countLines_gives_2_for_two_lines_present_in_a_string (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		WcLib wc = new WcLib(text);
		assertEquals(2,wc.countLines());
	}

	@Test
	public void countLines_gives_3_for_three_lines_present_in_a_string (){
		String text = "hello, How are you?\nI am fine\nAnd you?\n";
		WcLib wc = new WcLib(text);
		assertEquals(3,wc.countLines());
	}

	@Test
	public void countLines_gives_4_for_four_lines_present_in_a_string (){
		String text = "hello, How are you?\nI am fine\nAnd you?\nI am also good.\n";
		WcLib wc = new WcLib(text);
		assertEquals(4,wc.countLines());
	}

	@Test
	public void countWords_gives_0_for_empty_string (){
		String text = "";
		WcLib wc = new WcLib(text);
		assertEquals(0,wc.countWords());
	}

	@Test
	public void countWords_gives_0_for_no_words_in_a_string (){
		String text = " ";
		WcLib wc = new WcLib(text);
		assertEquals(0,wc.countWords());
	}

	@Test
	public void countWords_gives_1_for_one_word_in_a_string (){
		String text = "Hello";
		WcLib wc = new WcLib(text);
		assertEquals(1,wc.countWords());
	}

	@Test
	public void countWords_gives_6_for_six_words_in_a_string (){
		String text = "hello, this is a good day.";
		WcLib wc = new WcLib(text);
		assertEquals(6,wc.countWords());
	}

	@Test
	public void countWords_gives_9_for_nine_words_in_a_string (){
		String text = "hello, How are you?\nI am fine\nAnd you?\n";
		WcLib wc = new WcLib(text);
		assertEquals(9,wc.countWords());
	}

	@Test
	public void countWords_gives_13_for_thirteen_words_in_a_string (){
		String text = "hello, How are you?\nI am fine\nAnd you?\nI am also good.\n";
		WcLib wc = new WcLib(text);
		assertEquals(13,wc.countWords());
	}

	@Test
	public void countChars_gives_0_for_empty_string (){
		String text = "";
		WcLib wc = new WcLib(text);
		assertEquals(0,wc.countChars());
	}

	@Test
	public void countChars_gives_1_for_space_in_string (){
		String text = " ";
		WcLib wc = new WcLib(text);
		assertEquals(1,wc.countChars());
	}

	@Test
	public void countChars_gives_5_for_hello (){
		String text = "hello";
		WcLib wc = new WcLib(text);
		assertEquals(5,wc.countChars());
	}

	@Test
	public void countChars_gives_19_for_hello_How_are_you (){
		String text = "hello, How are you?";
		WcLib wc = new WcLib(text);
		assertEquals(19,wc.countChars());
	}

	@Test
	public void countChars_gives_40_for_string_with_three_lines (){
		String text = "hello, How are you?\nI am fine\nAnd you?\n";
		WcLib wc = new WcLib(text);
		assertEquals(42,wc.countChars());
	}

	@Test
	public void countChars_gives_59_for_four_lines_in_a_string (){
		String text = "hello, How are you?\nI am fine\nAnd you?\nI am also good.\n";
		WcLib wc = new WcLib(text);
		assertEquals(59,wc.countChars());
	}

	@Test
	public void wc_gives_42_char_count_9_word_count_and_3_line_count (){
		String text = "hello, How are you?\nI am fine\nAnd you?\n";
		WcLib wc = new WcLib(text);
		assertTrue(wc.getWordCount().equals("3 9 42"));
	}

	@Test
	public void wc_gives_48_char_count_10_word_count_and_2_line_count (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		WcLib wc = new WcLib(text);
		assertTrue(wc.getWordCount().equals("2 10 48"));
	}

	@Test
	public void wc_gives_59_char_count_13_word_count_and_4_line_count (){
		String text = "hello, How are you?\nI am fine\nAnd you?\nI am also good.\n";
		WcLib wc = new WcLib(text);
		assertTrue(wc.getWordCount().equals("4 13 59"));
	}
}