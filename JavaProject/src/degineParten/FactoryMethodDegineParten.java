package degineParten;

abstract class plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}

class dometicsPlan extends plan {

	@Override
	void getRate() {
		rate = 3;

	}

}

class CommercialPlan extends plan {

	@Override
	void getRate() {
		rate = 7;

	}

}

class InstitutionalPlan extends plan {

	@Override
	void getRate() {
		rate = 10;

	}

}

class GetPlanFactory {
	public plan getPlan(String getType) {
		if (getType.equals("Insti")) {
			return new InstitutionalPlan();
		} else if (getType.equals("Domitics")) {
			return new dometicsPlan();
		} else if (getType.equals("Commical")) {
			return new CommercialPlan();
		} else

		{
			return null;
		}
	}
}

public class FactoryMethodDegineParten {
	public static void main(String[] args) {
		GetPlanFactory factory = new GetPlanFactory();
		plan plan = factory.getPlan("Domitics");
		plan.getRate();
		plan.calculateBill(10);
	}

}
