package Exo7;

import java.util.Objects;

public class Joueur {
	

		private String name;
		private int age;
		
		
		
		public Joueur(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public Joueur() {
		}
		

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public int hashCode() {
			return Objects.hash(age, name);
		}
		int CompareTo(Joueur J)
		{
			return J.getName().compareTo(this.getName());
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
			return age == other.age && Objects.equals(name, other.name);
		}

		@Override
		public String toString() {
			return "Joueur : name=" + name + ", age=" + age ;
		}



			
			
}
