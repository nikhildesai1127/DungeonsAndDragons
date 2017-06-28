/*
 * Nikhil Desai
 * Dungeons and Dragons Room Generator
 * Data Structure Class - Stores Previous Rooms
 */

package roomGenerator;

public class RoomDataStructure {
	private int size;
	private Room[] stack;
	private int topItem;

	public RoomDataStructure(int size) {
		this.size = size;
		this.stack = new Room[this.size];
		this.topItem = -1;
	}

	public void push(Room object) {
		if (stackIsFull()) {
			doubleStack();
		}
		stack[++topItem] = object;
	}

	public Room pull() {
		if (stackIsEmpty()) {
			System.out.println("No Rooms Available.");
		}
		Room entry = this.stack[--topItem];
		return entry;
	}
	
	public Room peak() {
		if (stackIsEmpty()) {
			System.out.println("No Rooms Available.");
		}
		return stack[topItem];
	}

	private boolean stackIsFull() {
		return (topItem == size - 1);
	}

	private boolean stackIsEmpty() {
		return (topItem == -1);
	}

	private void doubleStack() {
		Room[] tempStack = new Room[this.size * 2];
		for (int i = 0; i > topItem; i++) {
			tempStack[i] = stack[i];
		}
		this.stack = tempStack;
		this.size = this.size * 2;
	}
}
