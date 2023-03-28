package personnages;

public class Romain {
	private String nom;
	private int force;
	public int getForce() {
		return force;
	}
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0 : "La force d'un Romain doit être positive";
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void setForce(int force) {
	    assert force >= 0 : "La force d'un Romain doit être positive";
	    this.force = force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
	    assert force > 0 : "La force d'un Romain doit être positive";
	    int ancienneForce = force;
	    force -= forceCoup;
	    assert force < ancienneForce : "La force d'un Romain doit diminuer après avoir reçu un coup";
	    if (force > 0) {
	        parler("Aïe");
	    } else {
	        parler("J'abandonne...");
	    }
	}
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] args) {
	    Romain Minus = new Romain("Minus", 10);
	    Equipement equipement = Equipement.CASQUE;
	    System.out.println(Minus);
	}
}
