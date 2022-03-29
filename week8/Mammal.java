/**
 * 
 * @author luisr
 *
 */

public class Mammal{
		//Attributes
		private int numOfLegs;
		private boolean hasFur;
		private String species;
		
		//Default Constructor
		public Mammal() {
			this.numOfLegs = 2;
			this.hasFur    = true;
			this.species   = "bear";
		}
		
		//Overloaded Constructor
		public Mammal (int numOfLegs, boolean hasFur, String species) {
			this.numOfLegs = numOfLegs;
			this.hasFur    = hasFur;
			this.species   = species;
		}
		
		//Setter
		public void setNumOfLegs (int numOfLegs) {
			this.numOfLegs = numOfLegs;
			
		}
		
		//Getter
		public int getNumOfLegs() {
			return this.numOfLegs;
			
		}
		
		public void setHasFur (boolean hasFur) { 
			this.hasFur = hasFur;
		}
		
		public boolean getHasFur() {
			return this.hasFur;
		}
		
		public void setSpecies(String species) {
			this.species = species;
		}
		
		public String species() {
			return this.species;
		}
		
		// Create the other 2 setters and getters, for hasFur, species
		
		
		public static void main(String[] args) {
			
			Mammal mammal1 = new Mammal();
			
			Mammal mammal2 = new Mammal(4,false, "cat");
					
			System.out.println(mammal2.getNumOfLegs());
		}
	}
		