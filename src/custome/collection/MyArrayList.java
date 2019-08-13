package custome.collection;

import java.util.AbstractList;

class MyArrayList extends AbstractList implements java.io.Serializable {

	private Object[] x;

	MyArrayList(Object[] array) {
		x = array;
	}

	public Object get(int index) {
		return x[index];
	}

	public Object set(int index, Object element) {
		Object oldVal = x[index];
		x[index] = element;
		return oldVal;
	}

	public int size() {
		return x.length;
	}
}