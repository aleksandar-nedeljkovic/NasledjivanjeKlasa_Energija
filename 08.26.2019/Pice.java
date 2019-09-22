package domaci08262019;

public class Pice extends Namirnica {
	private double kolicina;
	private double energetskaVrednost;

	public Pice(String ime, double kolicina, double energetskaVrednost) {
		super(ime);
		this.kolicina = kolicina;
		this.energetskaVrednost = energetskaVrednost;
	}

	public double getKolicina() {
		return kolicina;
	}

	public double energetskaVrednost() {
		return energetskaVrednost * kolicina;
	}

	public String toString() {
		return super.toString() + " (" + kolicina + "l, " + energetskaVrednost() + "kJ)";
	}


}
