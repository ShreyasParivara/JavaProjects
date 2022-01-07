package com.te.arrayimpl;

import java.util.Iterator;

public class ArrayLists {

	Object[] array;
	int position;


	public ArrayLists(int size) {
	
		
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position <= array.length) {
			increaseSize();
		}
		array[position] = obj;
		position++;
		

	}

	public void increaseSize() {
		Object[] temp = new Object[(array.length * 3) / 2 + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public void remove(int index) {
		for (int i = index; i <position; i++) {
			array[i] = array[i + 1];
		}
		position--;
	}
	
	public Iterator iterator() {
		return new Myitr();
	}

	private class Myitr implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			
			return index<position?true:false;
		}

		@Override
		public Object next() {
			
			return array[index++];
		}
		
	}
}


