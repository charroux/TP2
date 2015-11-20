package zoo;

public class Utilisation {
	
	public static void main(String[] a){
		Animal a1 = new Animal(10, "Milou");
		Animal a2 = new Animal(10, "Milou");
		Animal a3 = new Animal(75, "Hadock");
		
		if(a1.equals(a2)){
			System.out.println(a1 + " est egale a " + a2);
		}
		
		if(!a1.equals(a3)){
			System.out.println(a1 + " n'est pas egale a " + a3);
		}
		
		System.out.println("Codes de hachage de a1 : " + a1.hashCode());
		System.out.println("Codes de hachage de a2 : " + a2.hashCode());
		System.out.println("Codes de hachage de a3 : " + a3.hashCode());
	}

}
