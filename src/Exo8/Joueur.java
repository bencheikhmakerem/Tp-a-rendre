package Exo8;

import java.util.Objects;

public class Joueur {
	private String name;
	private int anneeDeNaissance;
	
	public Joueur(String name, int anneeDeNaissance) {
		this.name = name;
		this.anneeDeNaissance = anneeDeNaissance;
	}

	public Joueur() {
		
	}
	
	
	public int getAnneeDeNaissance() {
		return anneeDeNaissance;
	}

	public void setAnneeDeNaissance(int anneeDeNaissance) {
		this.anneeDeNaissance = anneeDeNaissance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anneeDeNaissance, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		return anneeDeNaissance == other.anneeDeNaissance && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Joueur [name=" + name + ", anneeDeNaissance=" + anneeDeNaissance + "]";
	}
	
	
	
	
}
