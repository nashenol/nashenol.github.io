/**
 *
 */
package zone.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import zone.models.NumberObject;

/**
 * @author csnas
 *
 */
public class DataMaker {

	public Integer generateListSize(Integer sizeRange) {

		Random rand = new Random();

		try {
			return rand.nextInt(sizeRange);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid size range given");
			return null;
		}
	}

	public Set<NumberObject> generateRandomdList(Integer range) {

		Set<NumberObject> list = new HashSet<>();
		List<Integer> usedNumberList = new ArrayList<>();
		Random rand = new Random();

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
