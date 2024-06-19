import java.util.ArrayList;

public class Customer {
	private String customerID;
	private String name;
	private String surname;
	private String dateOfBirth;
	private String address;
	private String driversLicenseID;
	private String telephone;
	private String email;

	public ArrayList<InsuranceContract> contractsOfCustomerArrayList = new ArrayList<>();

	public Customer(String name, String surname, String telephone, String email, String customerID){
		if (!(Main.customerIDArrayList.contains(customerID))){
			this.customerID = customerID;
			this.name = name;
			this.surname = surname;
			this.telephone = telephone;
			this.email = email;
			Main.customerIDArrayList.add(customerID);
		}
		else System.out.println("Internal Error: This customer ID already exists!");
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}

	public void printData(){
		System.out.printf("Customer Name: %s %s | ", name, surname);
		System.out.printf("Insured Vehicles: ", name, surname);
		double TotalInsuranceCostOfCustomer = 0;
		for (InsuranceContract insurance_contract : contractsOfCustomerArrayList){
			insurance_contract.getVehicleOfContract().printVehicleInfoInOneLine();
			TotalInsuranceCostOfCustomer += insurance_contract.getContractPrice();
		}
		System.out.printf("| Customer's Total Insurance Cost: %.2f€", TotalInsuranceCostOfCustomer);
		System.out.println();
	}
}