package pac1;

public class Orange {
	private double prix;
	private String origine;
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix){
		if (prix<0) throw new RuntimeException("Le prix ne peut pas être négatif");
		else
			this.prix = prix;
			
	}
	
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public Orange(double prix, String origine) {
		super();
		this.prix = prix;
		this.origine = origine;
	}
	
	public String toString() {
				
		return getOrigine()+ " | "+getPrix()+"\n";
	}
	
	public boolean equals(Orange o1, Orange o2) {
		boolean resultat=false;
		if (o1.getOrigine().equals(o2.getOrigine()) && o1.getPrix()==o2.getPrix())
			resultat=true;
		return resultat;
	}
	
	
	
}
