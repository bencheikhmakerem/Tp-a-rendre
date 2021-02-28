package Exo8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RegistreJoueurs {
	
	private Map<Integer,List<Joueur>> map = new HashMap<Integer,List<Joueur>>();
	
	

	public RegistreJoueurs(Map<Integer, List<Joueur>> map) 
	{
		this.map = map;
	}
	

	public RegistreJoueurs() {
		
	}


	public void setMap(Map<Integer, List<Joueur>> map) {
		this.map = map;
	}
	
	public void addJoueur(Joueur j)
	{
		int decennie;
		decennie=j.getAnneeDeNaissance()/10;
		if(map.get(decennie)==null)
		{
			List<Joueur> val=new ArrayList<Joueur>();
			val.add(j);
			map.put(decennie, val);
		}
		else 
		{
			List<Joueur> val=map.get(decennie);
			val.add(j);
		}
			
		
	}
	
	public List<Joueur> get(int decennie)
	{
		List<Joueur> listeJ=new ArrayList<Joueur>();
 		for (Entry<Integer, List<Joueur>> entry : map.entrySet()) 
		{
			if (entry.getKey().equals(decennie)) 
			{
				   
				listeJ=entry.getValue() ;

			}
		}
		return listeJ;
		
	}


	@Override
	public String toString() {
		return "RegistreJoueurs [map=" + map + "]";
	}
	



}
