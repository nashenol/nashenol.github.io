package zone.app;

import java.util.ArrayList;
import java.util.List;

import zone.algorithms.sort.SelectionSort;
import zone.data.DataMaker;
import zone.models.NumberObject;

public class NumberApp {

	private SelectionSort selectionSort;

	private DataMaker dataMaker;

	public List<NumberObject> runNumberObjectSort() {
		List<NumberObject> list = new ArrayList<>();

		list = dataMaker.generateRandomdNumberList(10);

		System.out.println(list);

		list = selectionSort.sortNumberObjects(list);

		return list;
	}

	public static void main(String[] args) {

		NumberApp app = new NumberApp();

		List<NumberObject> sortedList = app.runNumberObjectSort();

		System.out.println(sortedList);

	}

}
