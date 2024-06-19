public class InsuranceContract {
	public InsurancePolicy policyOfContract;
	public Customer customerOfContract;
	public Vehicle vehicleOfContract;
	private String _startingEndingDate;
	private Double _price;

	public InsuranceContract(Customer customerOfContract, Vehicle vehicleOfContract, InsurancePolicy policyOfContract, Double price){
		this.customerOfContract = customerOfContract;
		this.vehicleOfContract = vehicleOfContract;
		this.policyOfContract = policyOfContract;
		this._price = price;
		customerOfContract.contractsOfCustomerArrayList.add(this);
	}

	public void printData(){
		System.out.printf("Customer Name: %s %s | Vehicle Plate: %s | Insurance Policy Description: %s | Insurance Contract Price: %.2f€\n", customerOfContract.getName(), customerOfContract.getSurname(), vehicleOfContract.getVehiclePlate(), policyOfContract.getDescription(), _price);
	}
	
	public Vehicle getVehicleOfContract(){
		return vehicleOfContract;
	}
	public Double getContractPrice(){
		return _price;
	}
}