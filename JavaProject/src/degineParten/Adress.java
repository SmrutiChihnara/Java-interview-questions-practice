package degineParten;

public class Adress {
	Adress adress;
	public String state;
	public int pin;

	@Override
	public String toString() {
		return "Adress [state=" + state + ", no=" + pin + "]";
	}

	public Adress(Adress adress) {
		this(adress.getState(), adress.getNo());
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getNo() {
		return pin;
	}

	public void setNo(int no) {
		this.pin = no;
	}

	public Adress(String state, int no) {
		super();
		this.state = state;
		this.pin = no;
	}

}
