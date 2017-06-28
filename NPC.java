/*
 * Nikhil Desai
 * Dungeons and Dragons Room Generator
 * NPC class - Makes a Non-Player Character with the variables defined
 */
package roomGenerator;

public class NPC {
	private String[] nameHolder = { "Rick Sanchez", "Morty Smith", "Beth Sanchez", "Summer Smith", "Jerry Smith",
			"Morty Jr.", "Mr. Poopie-Butthole" };
	private String name;
	private String[] alignmentHolder = { "Lawful Good", "Lawful Neutral", "Lawful Chaotic", "Lawful Neutral",
			"True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil" };
	private String alignment;
	private String[] raceHolder = { "Human", "Glip-Glob", "Rick", "Cronenberg", "Tiny", "Mr. Meeseeks", "Birdperson",
			"Amish Cat", "Squancher", "Insect", "Klorblok" };
	private String race;

	private int health;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	public NPC() {
		this.name = randomName();
		this.alignment = randomAlignment();
		this.race = randomRace();
		this.health = (int) (Math.random() * 101);
		this.strength = (int) (Math.random() * 21);
		this.dexterity = (int) (Math.random() * 21);
		this.constitution = (int) (Math.random() * 21);
		this.intelligence = (int) (Math.random() * 21);
		this.wisdom = (int) (Math.random() * 21);
		this.charisma = (int) (Math.random() * 21);
	}

	@Override
	public String toString() {
		return "NPC [Name:" + name + ", Alignment:" + alignment + ", Race:" + race + ", Health:" + health
				+ ", Strength:" + strength + ", Dexterity:" + dexterity + ", Constitution:" + constitution
				+ ", Intelligence:" + intelligence + ", Wisdom:" + wisdom + ", Charisma:" + charisma + "]";
	}

	private String randomRace() {
		int randomNumber = (int) (Math.random() * raceHolder.length);
		return raceHolder[randomNumber];
	}

	private String randomAlignment() {
		int randomNumber = (int) (Math.random() * alignmentHolder.length);
		return alignmentHolder[randomNumber];
	}

	private String randomName() {
		int randomNumber = (int) (Math.random() * nameHolder.length);
		return nameHolder[randomNumber];
	}

}
