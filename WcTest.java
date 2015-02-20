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
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
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
		String text = "hello, this is a good day.\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(1,wc.countLines());
	}

	@Test
	public void countLines_gives_2_for_two_lines_present_in_a_string (){
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(2,wc.countLines());
	}

	@Test
	public void countLines_gives_3_for_three_lines_present_in_a_string (){
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(3,wc.countLines());
	}

	@Test
	public void countLines_gives_4_for_four_lines_present_in_a_string (){
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\nI am also good.\r\n";
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
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(9,wc.countWords());
	}

	@Test
	public void countWords_gives_13_for_thirteen_words_in_a_string (){
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\nI am also good.\r\n";
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
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(42,wc.countChars());
	}

	@Test
	public void countChars_gives_59_for_four_lines_in_a_string (){
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\nI am also good.\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(59,wc.countChars());
	}

	@Test
	public void wc_gives_42_char_count_9_word_count_and_3_line_count (){
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\n";
		WcLib wc = new WcLib(text);
		wc.getWordCount();
		assertTrue(wc.toString().equals("\t3\t9\t42"));
	}

	@Test
	public void wc_gives_48_char_count_10_word_count_and_2_line_count (){
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib(text);
		wc.getWordCount();
		assertTrue(wc.toString().equals("\t2\t10\t48"));
	}

	@Test
	public void wc_gives_59_char_count_13_word_count_and_4_line_count (){
		String text = "hello, How are you?\r\nI am fine\r\nAnd you?\r\nI am also good.\r\n";
		WcLib wc = new WcLib(text);
		wc.getWordCount();
		assertTrue(wc.toString().equals("\t4\t13\t59"));
	}

	@Test
	public void wc_should_return_1_one_line_when_l_option_is_given () {
		String text = "hello, How are you?\r\n";
		WcLib wc = new WcLib(text,"-l");
		wc.getWordCount();
		assertEquals("1", wc.toString());
	}

	@Test
	public void wc_should_return_4_for_four_words_when_w_option_is_given () {
		String text = "hello, How are you?\r\n";
		WcLib wc = new WcLib(text,"-w");
		wc.getWordCount();
		assertEquals("4", wc.toString());
	}

	@Test
	public void wc_should_return_21_for_twenty_one_characters_when_c_option_is_given () {
		String text = "hello, How are you?\r\n";
		WcLib wc = new WcLib(text,"-c");
		wc.getWordCount();
		assertEquals("21", wc.toString());
	}

	@Test
	public void wc_should_return_1_one_line_when_l_option_is_given_before_text () {
		String text = "hello, How are you?\r\n";
		WcLib wc = new WcLib("-l", text);
		wc.getWordCount();
		assertEquals("1", wc.toString());
	}

	@Test
	public void wc_should_return_4_for_four_words_when_w_option_is_given_before_text () {
		String text = "hello, How are you?\r\n";
		WcLib wc = new WcLib("-w", text);
		wc.getWordCount();
		assertEquals("4", wc.toString());
	}

	@Test
	public void wc_should_return_21_for_twenty_one_characters_when_c_option_is_given_before_text () {
		String text = "hello, How are you?\r\n";
		WcLib wc = new WcLib("-c", text);
		wc.getWordCount();
		assertEquals("21", wc.toString());
	}

	@Test
	public void getLongestLine_should_return_27_as_length_of_longest_line () {
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(26, wc.getLongestLine());
	}

	@Test
	public void getShortestLine_should_return_18_as_length_of_shortest_line () {
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib(text);
		assertEquals(18, wc.getShortestLine());
	}

	@Test
	public void wc_should_return_27_as_length_of_longest_line_when_asked_for_L_option () {
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib("-L", text);
		wc.getWordCount();
		assertEquals("26", wc.toString());
	}

	@Test
	public void wc_should_return_32_as_length_of_longest_line_when_asked_for_L_option () {
		String text = "hello, this is a good day.\r\nWhat do you think about the day?\r\n";
		WcLib wc = new WcLib("-L", text);
		wc.getWordCount();
		assertEquals("32", wc.toString());
	}

	@Test
	public void wc_should_return_18_as_length_of_shortest_line_when_asked_for_S_option () {
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib("-S", text);
		wc.getWordCount();
		assertEquals("18", wc.toString());
	}

	@Test
	public void getLengthsOfEachLine_gives_27_and_18_as_lengths_elements () {
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WcLib wc = new WcLib(text);
		int[] lengths = wc.getLengthsOfEachLine();
		assertEquals(26, lengths[0]);
		assertEquals(18, lengths[1]);
	}
}