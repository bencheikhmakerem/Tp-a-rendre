package Exo8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exo8 {

	public static void main(String[] args) 
	{
		List<Joueur> players=new ArrayList<>();
		List<Joueur> listeJ;
	    Map<Integer,List<Joueur>> map = new HashMap<Integer,List<Joueur>>();
	    RegistreJoueurs registre=new RegistreJoueurs();
	    
	    players.add(new Joueur("Laurent",1965));
	    players.add(new Joueur("Marcel",1968));
	    players.add(new Joueur("Patrick",1976));
	    players.add(new Joueur("Alain",1970));
	    players.add(new Joueur("Didier",1968));
	    
	    for(Joueur j : players)
	    {
	    	registre.addJoueur(j);
	    }
	    System.out.println(registre);
	    

	}

}
