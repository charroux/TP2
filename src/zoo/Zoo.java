package zoo;

import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Animal> animaux;
	
	public Zoo(){
		animaux = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}

	@Override
	public String toString() {
		return "Zoo [animaux=" + animaux + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animaux == null) ? 0 : animaux.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zoo other = (Zoo) obj;
		if (animaux == null) {
			if (other.animaux != null)
				return false;
		} else if (!animaux.equals(other.animaux))
			return false;
		return true;
	}
	
	

 }
