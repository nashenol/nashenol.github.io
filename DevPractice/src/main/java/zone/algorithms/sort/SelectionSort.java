package zone.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

import zone.models.NumberObject;

public class SelectionSort {

	public List<NumberObject> sortNumberObjects(List<NumberObject> list) {

		List<NumberObject> sortedList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			sortedList.add(findLeastObject(list, i));
		}

		return sortedList;
	}

	public NumberObject findLeastObject(List<NumberObject> list, int start) {

		NumberObject object = new NumberObject(-1);

		for (int i = start; i < list.size(); i++) {
			if (list.get(i).getValue() < object.getValue()) {
				object = list.get(i);
			}
		}

		return object;
	}

}
