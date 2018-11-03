
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}
	public int findIndex(T element) {
		if (element == null) {
			throw new IllegalArgumentException("Error: cannot add/set null value to OrderedArrayList");
		}
		int foundIndex = 0;
		if (this.size() == 0) {
			return foundIndex;
		}
		for (int i = 0; i<this.size(); i++) {
			if (element.compareTo(this.get(i)) < 0) {
				return foundIndex;
			}
			else {
				foundIndex++;
			}
		}
		return foundIndex;
	}
	public boolean add(T element) {
		int index = this.findIndex(element);
		super.add(index, element);
		return true;
	}
	public void add(int index, T element) {
		int i = this.findIndex(element);
		super.add(i, element);
	}
	public T set(int index, T element) {
		T old = this.get(index);
		this.add(element);
		if (element.compareTo(old) < 0) {
			this.remove(index+1);
		}
		else {
		this.remove(index);
		}
		//this.add(element);
		return old;
	}
	//for adding, instance.compareTo() returns -1 if instance is before parameter (can be like index += instance.compareTo(). it returns 0 if they're
	//lexicographically equivalent (so it can be put in place of the parameter or after, it's whatever), and +1 if it's after (index += instance.compareTo())
	//probably same with ints
	//use super.add(int i, T element) after you find the proper index to put the element at so it shifts all the elements over to make space
}
