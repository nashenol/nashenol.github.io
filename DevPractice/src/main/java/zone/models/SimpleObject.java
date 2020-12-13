package zone.models;

import java.util.UUID;

import lombok.Data;

@Data
public class SimpleObject<T> {

	private UUID id;
	private T value;

	public SimpleObject() {
		super();
		this.id = UUID.randomUUID();
	}

	public SimpleObject(T value) {
		super();
		this.id = UUID.randomUUID();
		this.value = value;

	}

}
