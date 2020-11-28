package zone.app;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class AppTest {

	@InjectMocks
	private App app;

	@Before
	public void initMocks() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testMain() throws IOException {
		System.out.println("main");
		String[] args = null;
		App.main(args);
	}
}
