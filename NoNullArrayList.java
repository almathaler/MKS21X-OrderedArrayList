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
			throw new IllegalArgumentException("Error: can't set element to null in NoNullArrayList");
		}
		return super.set(i, value);
	}

	public boolean add(T value) {
		if (value == null) {
			throw new IllegalArgumentException("Error: can't add null value to NoNullArrayList");
		}
		return super.add(value);
	}

	public void add(int i, T value) {
		if (value == null) {
			throw new IllegalArgumentException("Error: can't add null value to NoNullArrayList");
		}
		super.add(i, value);
	}
}
