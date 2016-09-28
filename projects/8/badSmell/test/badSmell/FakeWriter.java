package badSmell;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FakeWriter extends PrintWriter {

	private final List<String> _content;
	
	public FakeWriter(String fileName) throws FileNotFoundException {
		super(fileName);
		
		_content = new ArrayList<>();
	}

	@Override
	public void println(String x) {
		getContent().add(x);
	}

	public List<String> getContent() {
		return _content;
	}
}
