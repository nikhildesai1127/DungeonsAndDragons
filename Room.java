/*
 * Nikhil Desai
 * Dungeons and Dragons Room Generator
 * Room Generator Class - Makes a room with a random name, random # of random doors,
 *  random music, random # of random NPCs, and random # of random items
 */
package roomGenerator;

public class Room {
	private String[] nameHolder = { "Dungeon", "Earth C137", "Another Place", "Jail" };
	private String name;
	private Door[] doors = new Door[(int) (Math.random() * 5)];
	private NPC[] npcs = new NPC[(int) (Math.random() * 10)];
	private Item[] items = new Item[(int) (Math.random() * 10)];
	private int music;

	public Room() {
		this.name = randomName();
		this.doors = generateMultipleDoors();
		this.npcs = generateMultipleNPCs();
		this.items = generateMultipleItems();
		this.music = (int) (Math.random() * 10);
	}

	@Override
	public String toString() {
		return "Room [Name:" + name + ", Music:" + music + "]";
	}

	public String printDoors() {
		String tempString = "Doors: ";
		for (int i = 0; i < doors.length; i++) {
			tempString = tempString + doors[i].toString() + " | ";
		}
		return tempString;
	}

	public String printItems() {
		String tempString = "Items: ";
		for (int i = 0; i < items.length; i++) {
			tempString = tempString + items[i].toString() + " | ";
		}
		return tempString;
	}

	public String printNPCs() {
		String tempString = "NPCs: ";
		for (int i = 0; i < npcs.length; i++) {
			tempString = tempString + npcs[i].toString() + " | ";
		}
		return tempString;
	}

	private Item[] generateMultipleItems() {
		for (int i = 0; i < items.length; i++) {
			items[i] = new Item();
		}
		return items;
	}

	private NPC[] generateMultipleNPCs() {
		for (int i = 0; i < npcs.length; i++) {
			npcs[i] = new NPC();
		}
		return npcs;
	}

	private Door[] generateMultipleDoors() {
		for (int i = 0; i < doors.length; i++) {
			doors[i] = new Door();
		}
		return doors;
	}

	private String randomName() {
		String tempName = nameHolder[(int) (Math.random() * nameHolder.length)];
		return tempName;
	}

}
