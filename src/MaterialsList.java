import java.util.ArrayList;



public class MaterialsList {
	
	// my understanding is that this class will use the objectes created in the material class
	
	// contains a list of all the materials that could be used for construction
	// stores each object into an array of materials
	// get procedure would take in the material name and return the cost per pallet after searching
	// the array for the material name
	// if no material found, return "material unavailable"
	// get all procedure to display list of all avaliable materials
	
	private ArrayList<Material> materialList = new ArrayList<Material>();
	
	 public void addMaterial(Material M) 
	 {
		 materialList.add(M);
	 } 
	 public void removeMaterial(int i)
	 {
		 materialList.remove(i);
	 }
	 public Material getMaterial(int i)
	 {
		 return materialList.get(i);
	 }
	 public void getAll(ArrayList<Material> materialList)
	 {
	
		 for(int i = 0; i < materialList.size(); i++)
				 {
			 		System.out.println(materialList.get(i));
				 }
		
	 }
}


