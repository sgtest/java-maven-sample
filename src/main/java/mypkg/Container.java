package mypkg;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Container {
	public class Inner {
		public Container F() {
			return new Container();
		}
	}

	public Inner F() {
		return new Inner();
	}

	public void G() throws IOException {
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(null);
		for (CSVRecord record : records) {
			String lastName = record.get("Last Name");
			String firstName = record.get("First Name");
			System.out.println(lastName + ", " + firstName);
		}
	}
}
