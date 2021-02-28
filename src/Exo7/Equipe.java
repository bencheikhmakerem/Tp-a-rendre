package Exo7;

import java.util.ArrayList;
import java.util.Collection;


public class Equipe {
	
	Collection<Joueur> players= new ArrayList<Joueur>();

	public Equipe(Collection<Joueur> players) 
		{
		this.players = players;
		}

	public void addJoueur(Joueur j)
		{
			players.add(j);
		
		}
	public boolean removeJoueur(Joueur j)
		{
			 return players.remove(j);
			
		}
			
	public boolean isJoueurPresent(Joueur j)
	{
		return players.contains(j);
	}
	
	/*public void addAllEpuipe(Equipe e)
	{
		
	}*/
	public void clear()
	{
		players.clear();
	}
	public int getNombreJoueurs() 
	{
		return players.size();
		
	}
	public double getMoyenneAge()
	{
		
		double moyenne=0;
		int s=0;
		for(Joueur j: players)
		{
			s=s+ j.getAge();
		
		}
		moyenne=s/(players.size());
		return moyenne;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Equipe : ").append(players.size())
				.append(" joueurs\n");

		for (Joueur j : players) {
			str.append(j).append("\n");
		}

		return str.toString();
	}
	

	
	
	
}

	

	
	


