package oops;

public class EncapsulationEx {
	private int value;

	public EncapsulationEx(int value) {
	this.value = value;
	}

	public int getValue() {
	return value;
	}

	public void setValue(int value) {
	this.value = value;
	}

	public static void main(String[] args) {
		EncapsulationEx example = new EncapsulationEx(42);

	System.out.println("Initial Value: " + example.getValue());

	example.setValue(99);

	System.out.println("Updated Value: " + example.getValue());
	}
	}