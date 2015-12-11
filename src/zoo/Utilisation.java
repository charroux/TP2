package zoo;

import java.util.ArrayList;

public class Utilisation {
	
	public static void main(String[] a){
		Animal a1 = new Animal(10, "Milou");
		Animal a2 = new Animal(10, "Milou");
		Animal a3 = new Animal(75, "Hadock");
		
		if(a1.equals(a2)){
			System.out.println(a1 + " est egale a " + a2);
		}
		
		if(a1 == a2){
			System.out.println("a1 == a2");
		} else {
			System.out.println("a1 != a2");
		}
		
		if(!a1.equals(a3)){
			System.out.println(a1 + " n'est pas egale a " + a3);
		}
		
		System.out.println("Codes de hachage de a1 : " + a1.hashCode());
		System.out.println("Codes de hachage de a2 : " + a2.hashCode());
		System.out.println("Codes de hachage de a3 : " + a3.hashCode());
		
		Chien milou = new Chien(10, "Milou", "Tintin");
		int poids = milou.getPoids();
		String nom = milou.getNom();
		String maitre = milou.getMaitre();
		
		System.out.println(poids + " " + nom + " " + maitre);
		
		System.out.println(milou);
		
		Chien medor = new Chien(1, "Medor", "Castaphiore");
		Chien mechant = new Chien(30, "Allien", "Hadock");
		
		/// Chien c = a1; impossible car Java ne sait pas comment initialiser l'attribut maitre de c
		a1 = medor;
		
		Chien[] chiens = new Chien[4];	// taille fixe : 4
		chiens[0] = milou;
		chiens[1] = medor;
		chiens[2] = mechant;
		// chiens[3] = a1; impossible
		
		ArrayList<Chien> listChiens = new ArrayList<Chien>();	// tableau taille variable
		listChiens.add(milou);
		listChiens.add(medor);
		listChiens.add(mechant);
		// listChiens.add(a1); impossible
		
		ArrayList<Animal> listAnimaux = new ArrayList<Animal>();
		listAnimaux.add(a1); 	// possible !
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(a1);
		
		System.out.println(zoo);
		
	}

}
