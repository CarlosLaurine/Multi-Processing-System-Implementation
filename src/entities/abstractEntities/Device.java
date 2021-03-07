package entities.abstractEntities;

public abstract class Device {
	
	/*Standard Device Abstract Class with
	  Serial Code attribute defined */

	public String serialCode;

	public Device(String serialNumber) {
		this.serialCode = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialCode;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialCode = serialNumber;
	}

	public abstract void processDoc(String doc);
}