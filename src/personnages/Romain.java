package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
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
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force == 0) {
			parler("Aïe");
		}
		else{
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			}
		assert force < oldForce;
		return equipementEjecte;
			
			}

	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
		texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		for (int i = 0; i < nbEquipement; i++) {
			if ((equipements[i] != null &&
					equipements[i].equals(Equipement.BOUCLIER))) {
				resistanceEquipement += 8;
			} else {
				System.out.println("Equipement casque");
				resistanceEquipement += 5;
			}
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
				return equipementEjecte;
		}
	public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 0:
                ajouterEquipement(equipement);
                parler("s'équipe avec un " + equipement.getNom() + ".");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    parler("possède déjà un " + equipement.getNom() + " !");
                } else {
                    ajouterEquipement(equipement);
                    parler("s'équipe avec un " + equipement.getNom() + ".");
                }
                break;
            case 2:
                parler("est déjà bien protégé !");
                break;
           	default: // default clause should be the last one
        		break;
        }
    }
    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
    }
	public static void main(String[] args) {
		 Romain minus = new Romain("Minus", 10);
	     Equipement equipement = Equipement.CASQUE;
	     minus.sEquiper(equipement);
	     minus.sEquiper(equipement);
	     minus.sEquiper(Equipement.BOUCLIER);
	}
}
