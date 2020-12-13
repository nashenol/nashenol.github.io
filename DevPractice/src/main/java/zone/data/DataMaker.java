/**
 *
 */
package zone.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import zone.models.NumberObject;

/**
 * @author csnas
 *
 */
public class DataMaker {

	private static final Integer DEFAULT_LIST_SIZE = 10;

	public Integer generateListSize(Integer sizeRange) {
		Random rand = new Random();
		Integer range = sizeRange != null ? sizeRange : DEFAULT_LIST_SIZE;

		try {
			return rand.nextInt(range);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid size range given");
			return null;
		}
	}

	public List<NumberObject> generateRandomdNumberList(Integer listSize) {
		List<NumberObject> list = new ArrayList<>();
		List<Integer> usedNumberList = new ArrayList<>();
		Random rand = new Random();
		Integer range = listSize != null ? listSize : generateListSize(listSize);

		while (usedNumberList.size() < range) {
			int number = rand.nextInt(range);
			if (!usedNumberList.contains(number)) {
				usedNumberList.add(number);

				list.add(new NumberObject(number));
			}

		}

		return list;
	}

}
