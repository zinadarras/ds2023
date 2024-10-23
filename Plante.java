package ds2023;

public class Plante {
	protected static int num=0;
	protected String nom;
	protected int hauteur;
	protected int age;
	protected double prix;
	public Plante(String nom, int hauteur, int age, double prix) {
		this.nom = nom;
		this.hauteur = hauteur;
		this.age = age;
		this.prix = prix;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Nom: "+this.nom+" Hauteur: "+this.hauteur+" Age: "+this.age+" Prix: "+this.prix;
	}
	public void description() {
		System.out.println(toString());
	}
}
