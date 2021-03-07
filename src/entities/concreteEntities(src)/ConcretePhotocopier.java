package entities.concreteEntities;

import entities.abstractEntities.Device;
import entities.interfaces.PhotocopierInterface;

public class ConcretePhotocopier extends Device implements PhotocopierInterface {
	
	/*Through Device Abstract Class' Extension and PhotocopierInterface Implementation,
	 *ConcretePhotocopier Class is able to define a Concrete Photocopier Object which 
	 *overrides Print methods and inherits Abstract Class Device's Serial Number.
	 */

	public ConcretePhotocopier(String serialCode) {
		super(serialCode);
	}

	@Override
	public void processDoc(String document) {
		System.out.println("Photocopy: " + document);
	}

	@Override
	public String Photocopy() {
		return "Photocopied content";
	}
}