package zone.models;

import java.util.UUID;

import lombok.Data;

@Data
public class SimpleObject {

	private UUID id;

	public SimpleObject() {
		super();
		id = UUID.randomUUID();
	}

}
