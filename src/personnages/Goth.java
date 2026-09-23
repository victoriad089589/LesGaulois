package personnages;

public class Goth {
	private String nom;
	private int force;
	
	
	public Goth(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}


	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole());
		
	}


	private char[] prendreParole() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
