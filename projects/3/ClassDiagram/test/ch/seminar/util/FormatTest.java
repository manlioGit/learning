package ch.seminar.util;

import static ch.seminar.util.Format.line;
import static java.lang.System.getProperty;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FormatTest {

	@Test
	public void lineAppendLineSeparator() throws Exception {
		assertThat(line("aaa"), is("aaa" + getProperty("line.separator")));
	}
}
