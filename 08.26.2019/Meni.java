package domaci08262019;

public class Meni {
	private int brojNamirnica;
	private Namirnica[] nizNamirnica;

	public Meni(int brojNamirnica) {
		this.brojNamirnica = brojNamirnica;
		nizNamirnica = new Namirnica[brojNamirnica];
	}

	public void dodaj(Namirnica n) {
		for (int i = 0; i < nizNamirnica.length; i++) {
			if (nizNamirnica[i] == null && brojNamirnica > 0) {
				nizNamirnica[i] = n;
				brojNamirnica--;
				break;
			}

		}
	}

	public double ukupnaEnergetskaVrednost() {
		double ukupno = 0;
		for (Namirnica namirnice : nizNamirnica) {
			if (namirnice == null)
				continue;
			ukupno += namirnice.energetskaVrednost();
		}
		return ukupno;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MENI (" + ukupnaEnergetskaVrednost() + "kJ)\n");
		for (Namirnica namirnice : nizNamirnica) {
			if (namirnice == null)
				break;
			sb.append("\t" + namirnice + "\n");
		}
		return sb.toString();
	}

	public Namirnica getNam(int i) {
		return nizNamirnica[i];
	}

}
