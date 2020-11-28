package zone.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NumberObject extends SimpleObject {

	private Integer value;

	public NumberObject(Integer value) {
		super();
		this.value = value;
	}

}
