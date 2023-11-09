package zooFantastique;

public class Creatures {

	private String nom;
	private String sexe;
	private float poids;
	private float taille;
	private int age;
	private boolean aFaim;
	private boolean dort;
	private String sante;

	Creatures(String nom, String sexe, float poids, float taille, int age,
			boolean aFaim, boolean dort, String sante) {
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.aFaim = aFaim;
		this.dort = dort;
		this.sante = sante;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isaFaim() {
		return aFaim;
	}

	public void setaFaim(boolean aFaim) {
		this.aFaim = aFaim;
	}

	public boolean isDort() {
		return dort;
	}

	public void setDort(boolean dort) {
		this.dort = dort;
	}

	public String getSante() {
		return sante;
	}

	public void setSante(String sante) {
		this.sante = sante;
	}
	
	public void mange() {
		if (this.aFaim == true && this.dort == false) {
			this.aFaim = false;
		}
	}
	
	public void emmetreSon() {
		System.out.println("Bruitage");
	}

	public void soin() {
		if (this.sante != "en forme" && this.sante != "mort") {
			this.sante = "en forme";
		}
	}
	
	public void dormir() {
		if(this.dort ==false) {
			this.dort = true;
		}
	}
	
	public void seReveiller() {
		if (this.dort == false) {
			this.dort = true;
		}
	}
	
	public void viellir() {
		this.age += 1;
	}
	
	public void meurt(int ageMax) {
		if(this.age > ageMax) {
			this.sante = "mort";
		}
	}
	
}
