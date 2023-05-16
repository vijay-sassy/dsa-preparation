package main;

public class ArrayList {
	private int[] data;
	private int nextPosition;
	
	public ArrayList() {
		data = new int[5];
		nextPosition = 0;
	}
	
	public void increaseSize() {
		int[] temp = new int[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
	
	private void add(int value) {
		if (nextPosition == data.length) {
			increaseSize();
		}
		
		data[nextPosition++] = value;
	}
	
	private int get(int index) {
		if (index >= nextPosition) {
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}
	
	private void set(int index, int value) {
		if (index >= nextPosition) {
			throw new IndexOutOfBoundsException();
		}
		data[index] = value;
	}
	
	private void remove(int index) {
		if (index >= nextPosition) {
			throw new IndexOutOfBoundsException();
		}
		for(int i = index; i < nextPosition-1; i++) {
			data[i] = data[i+1];
		}
		data[nextPosition-1] = 0;
		nextPosition--;
	}
	
	private void traverse() {
		for (int i = 0; i < nextPosition; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
	
	private int size() {
		return nextPosition;
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.traverse();
        System.out.println("List Size: " + list.size());
        
        System.out.println("Fourth Position Value: " + list.get(3));
        System.out.println("Current fourth position: " + list.get(3));
        list.set(3, 1);
        System.out.println("After updating: " + list.get(3));
        list.traverse();
        list.remove(0);
        
        System.out.println("After removing first position");
        list.traverse();
        list.remove(2);
        System.out.println("After removing third position");
        list.traverse();
        list.remove(list.size()-1);
        System.out.println("After removing last position 3");
        list.traverse();
        
        System.out.println("After removing three elements");
        System.out.println("List Size: " + list.size());
	}
}
