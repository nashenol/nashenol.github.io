package zone.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NumberObject extends SimpleObject<Integer> {

	public NumberObject(Integer value) {
		super(value);
	}

}
