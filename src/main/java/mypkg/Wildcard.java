package mypkg;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wildcard {

	private static final Logger LOGGER = LoggerFactory.getLogger(Wildcard.class);

	void upper(List<? extends Integer> list) {
	}

	void lower(List<? super Integer> list) {
	}

	void unbound(List<?> list) {
	}

}
