package ds2023;

public class Arbre extends Plante {
	private String type_Feuillage;
	private final int AbsorMoyenne=22;
	public String getType_Feuillage() {
		return type_Feuillage;
	}
	public void setType_Feuillage(String type_Feuillage) {
		this.type_Feuillage = type_Feuillage;
	}
	public int getAbsorMoyenne() {
		return AbsorMoyenne;
	}
	
	public Arbre(String nom, int hauteur, int age, double prix,String type_Feuillage) {
		super(nom, hauteur, age, prix);
		this.type_Feuillage=type_Feuillage;
	}
	public void description() {
		super.description();
		System.out.println(" type de Feuillage: "+this.type_Feuillage);
	}
	public double absorptionCO2() {
		if (this.hauteur>50)
			return 25;
		else return 22;
		}
}
