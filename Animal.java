
abstract public class Animal implements Comparable<Animal> {
	String name;
	int numLegs;
	public Animal(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	public int getLegs() {
		return numLegs;
	}
	public String getName() {
		return name;
	}
}
