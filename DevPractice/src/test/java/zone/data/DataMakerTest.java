package zone.data;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import zone.models.NumberObject;

public class DataMakerTest {

	@InjectMocks
	private DataMaker dataMaker;

	@Before
	public void initMocks() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void generateListSizeSuccessTest() {

		Integer bound = 10;

		Integer listSize = dataMaker.generateListSize(bound);

		assertEquals(listSize.getClass(), Integer.class);
	}

	@Test
	public void generateListSizeFailTest() {

		Integer bound = -10;

		Integer listSize = dataMaker.generateListSize(bound);

		assertEquals(listSize, null);

	}

	@Test
	public void generateRandomdListSuccessTest() {

		Integer bound = 10;

		List<NumberObject> list = dataMaker.generateRandomdNumberList(bound);

		assertEquals(list.size(), bound.intValue());
	}

}
