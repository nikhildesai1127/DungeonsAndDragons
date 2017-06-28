/*
 * Nikhil Desai
 * Dungeons and Dragons Room Generator
 * Item Class - Generates an Item with Variables Below
 */
package roomGenerator;

public class Item {
	private String[] nameHolder = { "Sword", "Shield", "Portal Gun", "Plumbus" };
	private String name;
	private boolean broken;
	private boolean poison;
	private boolean rare;

	public Item() {
		this.name = randomName();
		this.broken = isBroken();
		this.poison = isPoison();
		this.rare = isRare();
	}

	@Override
	public String toString() {
		return "Item [Name:" + name + ", Broken:" + broken + ", Poison:" + poison + ", Rare:" + rare + "]";
	}

	private String randomName() {
		int randomNumber = (int) (Math.random() * nameHolder.length);
		return nameHolder[randomNumber];
	}

	private boolean isBroken() {
		int randomNumber = (int) (Math.random() * 101);
		if (randomNumber < 81) {
			return false;
		} else {
			return true;
		}
	}

	private boolean isPoison() {
		int randomNumber = (int) (Math.random() * 101);
		if (randomNumber < 91) {
			return false;
		} else {
			return true;
		}
	}

	private boolean isRare() {
		int randomNumber = (int) (Math.random() * 101);
		if (randomNumber < 96) {
			return false;
		} else {
			return true;
		}
	}

}
