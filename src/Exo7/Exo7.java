package Exo7;

import java.util.ArrayList;
import java.util.Collection;

public class Exo7 {
	public static void main(String[] args) {
		
		Collection<Joueur> players= new ArrayList<Joueur>();
		Equipe eq=new Equipe(players);
		//Equipe equi = new Equipe (players);
		Joueur J1=new Joueur("Zinedine" ,42);
		Joueur J2=new Joueur("Jack" ,22);
		Joueur J3=new Joueur("John" ,32);
		Joueur J4=new Joueur("Makerem" ,24);
		Joueur J5=new Joueur("Michelle" ,29);

		System.out.println(J1);
		System.out.println(J2);
		System.out.println("J1 equals J2: " +J1.equals(J2));
		System.out.println("J1 compare J2: " +J1.CompareTo(J2));
		
		eq.addJoueur(J1);
		eq.addJoueur(J2);
		eq.addJoueur(J3);
		eq.addJoueur(J4);
		eq.addJoueur(J5);

		System.out.println(eq);
		eq.removeJoueur(J2);
		System.out.println(eq);
		System.out.println(eq.isJoueurPresent(J2));
		System.out.println(eq.getNombreJoueurs());
		System.out.println(eq.getMoyenneAge());
		 


	}

}
