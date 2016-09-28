package badSmell;

import static smell.Format.line;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FakeWriter extends PrintWriter {

	private String _content = "";

	public FakeWriter(File file) throws FileNotFoundException {
		super(file);
	}
	
	@Override
	public void println(String x) {
		_content += line(x);
	}

	@Override
	public void print(String b) {
		_content += b;
	}
	
	public String getContent() {
		return _content;
	}
}
