/*
 * Nikhil Desai
 * Dungeons and Dragons Room Generator
 * Main Class - Runs code
 */
package roomGenerator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RoomDataStructure rooms = new RoomDataStructure(2);
		Room room1 = new Room();
		rooms.push(room1);
		System.out.println(room1.toString());
		System.out.println(room1.printDoors());
		System.out.println(room1.printNPCs());
		System.out.println(room1.printItems());
		System.out.println("_______________________________");
		System.out.println(room1.toString());
		System.out.println(room1.printDoors());
		System.out.println(room1.printNPCs());
		System.out.println(room1.printItems());
		
	}

}
