package degineParten;

abstract class Laptop {
	public abstract String getConfiguraction();
}

class Dell extends Laptop {
	int version;
	String ram;

	public Dell(int version, String ram) {
		this.ram = ram;
		this.version = version;
	}

	@Override
	public String getConfiguraction() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "Ram" + ram + " Version" + version;
	}

}

class Hp extends Laptop {
	int version;
	String ram;

	public Hp(int version, String ram) {
		this.ram = ram;
		this.version = version;
	}

	@Override
	public String toString() {
		return "Ram" + ram + " Version" + version;
	}

	@Override
	public String getConfiguraction() {
		// TODO Auto-generated method stub
		return toString();
	}
}

class Mac extends Laptop {
	int version;
	String ram;

	public Mac(int version, String ram) {
		this.ram = ram;
		this.version = version;
	}

	@Override
	public String getConfiguraction() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "Ram" + ram + " Version" + version;
	}

}

enum LaptopName {
	hp, dell, Mac;
}

class Factory {
	public Laptop getLaoptop(LaptopName laptopName) {
		switch (laptopName) {
		case dell:
			return new Dell(7, "64");
		case Mac:
			return new Hp(7, "128");
		case hp:
			return new Mac(7, "12");

		}
		return null;

	}
}

public class FactoryMethod {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Laptop laptop = factory.getLaoptop(LaptopName.dell);
		System.out.println(laptop.getConfiguraction());
	}

}
