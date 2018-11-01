import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
	public NoNullArrayList() {
		super();	
	}
	public NoNullArrayList(int startingCapacity) {
		super(startingCapacity);	
	}

	public T set(int i, T value) {
		if (value == null) {
			throw new IllegalArguementException("Error: can't add null to NoNullArrayList");
		}
		else {
			return super.set(i, value);
		}
	}

	
}
