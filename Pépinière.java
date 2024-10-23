package ds2023;

public class Pépinière {
	private Plante[] inventaire;
	private final int MAX_PLANTES=1000;
	private int nombreDePlantes=0;
	public Plante[] getInventaire() {
		return inventaire;
	}

	public void setInventaire(Plante[] inventaire) {
		this.inventaire = inventaire;
	}

	public int getNombreDePlantes() {
		return nombreDePlantes;
	}

	public void setNombreDePlantes(int nombreDePlantes) {
		this.nombreDePlantes = nombreDePlantes;
	}

	public Pépinière(int taille) {
		if (taille<MAX_PLANTES) {
			this.inventaire=new Plante[taille];
		}
		else System.out.println("le nombre des plantes doit etre inferieur a 1000");
	}
	public void ajoutPlante(Plante plante) {
		if (nombreDePlantes<inventaire.length){
			this.inventaire[nombreDePlantes]=plante;
			nombreDePlantes++;
			Plante.num ++;}
		else System.out.println("inventaire complet");
	}
	public void afficherInventaire() {
	    for (int i = 0; i < this.inventaire.length; i++) {
	        if (this.inventaire[i] != null) {
	            System.out.println("PLANTE #" + (i+1));
	            this.inventaire[i].description();
	        }}
	    }
	public double totalAbsorption() {
		double som=0;
		for (int i=0;i<this.nombreDePlantes;i++) {
			if (this.inventaire[i].getClass().getSimpleName().equals("Arbre"))
				som=som+((Arbre) inventaire[i]).absorptionCO2();
		}
		return som;
	}
	public int compterArbresCaduques() {
		int som=0;
		for (int i=0;i<this.nombreDePlantes;i++) {
			if (this.inventaire[i].getClass().getSimpleName().equals("Arbre")) {
				if (((Arbre) inventaire[i]).getType_Feuillage().equals("Caduque"))
					som++;}
			}
	return som;
}
}
