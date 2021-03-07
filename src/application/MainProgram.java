package application;

import entities.concreteEntities.ConcretePhotocopier;
import entities.concreteEntities.ConcretePrinter;
import entities.concreteEntities.MultiTaskDevice;

public class MainProgram {

	public static void main(String[] args) {
		
		/*Main Program deigned in "Hardcode" Method (No-Scanner Inputs)
		  aiming to demonstrate inherited methods and attributes, 
		  originated from the Abstract Class mixed with 
		  Multi-Implementation of Interfaces Method.	
		 */

		
		ConcretePhotocopier s = new ConcretePhotocopier("2003");
		s.processDoc("WhatsappImg.png");
		System.out.println("Photocopy: " + s.Photocopy());
		
		System.out.println();
		
		ConcretePrinter p = new ConcretePrinter("7821325374721-EAGJCA");
		p.processDoc("Input Text");
		p.print("Input Text");
		
		
		System.out.println();
		MultiTaskDevice c = new MultiTaskDevice("2081");
		c.processDoc("Textual Content");
		c.print("Textual Content");
		System.out.println("Scan result: " + c.Photocopy());
	}
}