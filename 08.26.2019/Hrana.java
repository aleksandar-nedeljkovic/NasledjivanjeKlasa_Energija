package domaci08262019;

public class Hrana extends Namirnica {
	private double tezina;
	private double belancevine;
	private double masti;
	private double ugljeniHidrati;

	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljeniHidrati) {
		super(ime);
		if (belancevine + masti + ugljeniHidrati <= 100) {
			this.tezina = tezina;
			this.belancevine = belancevine;
			this.masti = masti;
			this.ugljeniHidrati = ugljeniHidrati;
		}
	}

	@Override
	public double energetskaVrednost() {
		double uk = 0;
		uk += (16.7 * (belancevine * tezina / 100));
		uk += (37.6 * (masti * tezina / 100));
		uk += (17.2 * (ugljeniHidrati * tezina / 100));
		return uk;
	}

	public double getTezina() {
		return tezina;
	}

	public double getBelancevine() {
		return belancevine;
	}

	public double getMasti() {
		return masti;
	}
	

	public double getUgljeniHidrati() {
		return ugljeniHidrati;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + tezina + "g, " + energetskaVrednost() + "kJ)";
	}


}
