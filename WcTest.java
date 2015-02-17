import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getLines_gives_0_for_empty_string (){
		String text = " ";
		Wc wc = new Wc();
		assertEquals(0,wc.getLines(text));
	}	

	@Test
	public void getLines_gives_2_for_two_lines_present_in_a_string (){
		String text = "hello, this is a good day.\nWhat do you think?\n";
		Wc wc = new Wc();
		assertEquals(2,wc.getLines(text));
	}
}