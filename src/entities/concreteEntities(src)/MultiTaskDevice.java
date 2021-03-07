package entities.concreteEntities;

import entities.abstractEntities.Device;
import entities.interfaces.PhotocopierInterface;
import entities.interfaces.PrinterInterface;

public class MultiTaskDevice extends Device implements PrinterInterface, PhotocopierInterface {
	
	/*Through Device Abstract Class' Extension and Multiple Interface Implementation,
	 *MultiTaskDevice Class is able to define a Device Object which 
	 *override both Photocopy and Print methods without performing an illegal
	 *Multi-Heritage.
	 */

	public MultiTaskDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Multitask Printing: " + doc);
	}

	@Override
	public String Photocopy() {
		return "Combo Photocopy";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Multitask Processing: " + doc);
	}
}