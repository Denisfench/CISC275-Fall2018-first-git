
public class Dog extends Animal{
	Dog(String name, int numLegs) {
super(name, numLegs);
	}
	public String toString() {
		return this.name;
	}
	
	@Override
	public int compareTo(Animal o) {
		if (getLegs() - o.getLegs() == 0 && o instanceof Dog) {
			return getName().compareTo(((Dog)o).getName());
		}
		else {
			return getLegs() - o.getLegs();
		}
	}
}
