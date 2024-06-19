public class InsurancePolicy {
	private String packageCode;
	private String description;
	private int duration;

	public InsurancePolicy(String packageCode, String description, int duration){
		this.packageCode = packageCode;
		this.description = description;
		this.duration = duration;
	}

	public String getDescription(){
		return description;
	}
}
