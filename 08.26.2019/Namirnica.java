package domaci08262019;

public abstract class Namirnica extends Energent{
	protected String ime;
	protected int ID;
	protected static int globalID = 1;

	public Namirnica(String ime) {
		super();
		this.ime = ime;
		ID = globalID++;
	}

	public String getIme() {
		return ime;
	}

	public int getID() {
		return ID;
	}

	public String toString() {
		String s ="";
		s +="[" + ID + "]" + ime;
		return s;
	}

}
