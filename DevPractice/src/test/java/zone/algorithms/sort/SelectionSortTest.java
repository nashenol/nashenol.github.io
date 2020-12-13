package zone.algorithms.sort;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import zone.data.DataMaker;
import zone.models.NumberObject;

public class SelectionSortTest {

	@InjectMocks
	private SelectionSort selectionSort;

	@Mock
	private DataMaker dataMaker;

	private Integer listRange;

	@Before
	public void initMocks() {
		MockitoAnnotations.openMocks(this);

		listRange = 10;
	}

	@Test
	public void sortNumberObjectsSuccessTest() {

		Integer size = dataMaker.generateListSize(listRange);
		List<NumberObject> mainList = dataMaker.generateRandomdNumberList(size);
		List<NumberObject> resultList = selectionSort.sortNumberObjects(mainList);

		for (int i = 0; i < resultList.size() - 1; i++) {
			assertTrue(resultList.get(i).getValue() < resultList.get(i).getValue());
		}

		given(dataMaker.generateListSize(listRange)).willReturn(10);

	}

}
