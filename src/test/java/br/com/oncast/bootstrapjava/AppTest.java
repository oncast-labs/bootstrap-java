package br.com.oncast.bootstrapjava;

import static junit.framework.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSum() {
		assertEquals(new App().sum(2, 2), 4);
	}
}
