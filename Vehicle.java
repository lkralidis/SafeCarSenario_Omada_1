public class Vehicle {
	private String _vehiclePlate;
	private String _brand;
	private String _model;
	private int _year;
	private String _cc;
	private String _color;
	private String _vehicleType;
	private String VIN;

	public Vehicle(String brand, String model, String vehiclePlate, int year, String VIN){
		if (!(Main.vehicleVINArrayList.contains(VIN))){
			this._brand = brand;
			this._model = model;
			this._vehiclePlate = vehiclePlate;
			this._year = year;
			this.VIN = VIN;
			Main.vehicleVINArrayList.add(VIN);
		}
		else System.out.println("Internal Error: A vehicle with this VIN (Vehicle Identification Number) already exists!");
	}

	public void printVehicleInfoInOneLine(){
		System.out.printf("%s %s - %s - %d - %s ", _brand, _model, _vehiclePlate, _year, VIN);
	}

	public String getVehiclePlate(){
		return _vehiclePlate;
	}
}
