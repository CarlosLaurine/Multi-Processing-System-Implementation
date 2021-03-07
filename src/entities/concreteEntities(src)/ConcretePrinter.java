package entities.concreteEntities;

import entities.abstractEntities.Device;
import entities.interfaces.PrinterInterface;

public class ConcretePrinter extends Device implements PrinterInterface {
	
	/*Through Device Abstract Class' Extension and PrinterInterface Implementation,
	 *ConcretePrinter Class is able to define a Concrete Printer Object which 
	 *overrides Print methods and inherits Abstract Class Device's Serial Number.
	 */

	public ConcretePrinter(String serialCode) {
		super(serialCode);
	}

	@Override
	public void processDoc(String document) {
		System.out.println("Printer processing: " + document);
	}

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}