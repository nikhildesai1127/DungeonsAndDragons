/*
 * Nikhil Desai
 * Dungeons and Dragons Room Generator
 * Door Class - Generates a Door with Variables Below
 */
package roomGenerator;

public class Door {
	private String[] nameHolder = {"Left", "Right", "Forward", "Back", "Floor", "Ceiling"};
	private String name;
	private boolean fake;
	
	public Door() {
		this.name = randomName();
		this.fake = isFake();
	}
	
	@Override
	public String toString() {
		return "Door:" + name + ", Fake:" + fake;
	}

	private boolean isFake() {
		int randomNumber = (int) (Math.random() * 101);
		if (randomNumber < 81) {
			return false;
		} else {
			return true;
		}
	}

	private String randomName() {
		int randomNumber = (int) (Math.random() * nameHolder.length);
		return nameHolder[randomNumber];
	}
	
}
