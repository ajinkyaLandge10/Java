package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	static final int MIN_fEE = 50;

//	UsMedical interface
	@Override
	public void physioServices() {
		System.out.println("FH --> physioServices");
	}
	@Override
	public void oncologyServices() {
		System.out.println("FH --> oncologyServices");
	}
	@Override
	public void pediaServices() {
		System.out.println("FH --> pediaServices");
	}

//	UKMedical interface
	@Override
	public void dentalServices() {
		System.out.println("FH --> dentalServices");
	}
	@Override
	public void orthoServices() {
		System.out.println("FH --> orthoServices");
	}

//	IndianMedical interface
	@Override
	public void gynoServices() {
		System.out.println("FH --> gynoServices");	
	}
	@Override
	public void ENTServices() {
		System.out.println("FH --> ENTServices");
	}
	

//	Common method from all Interfaces
	@Override
	public void emergencyServices() {
		System.out.println("FH --> emergencyServices");
	}
	
//	Individual Methods(FH)
	public void medicalInsurance() {
		System.out.println("FH --> medicalInsurance");
	}
	public void medicalTraining() {
		System.out.println("FH --> medicalTraining");
	}
	
	//Method hiding
//	public static void billing() {
//		//buss logic:
//		System.out.println("FH - billing");
//	}
	
	@Override
	public void RnD(){
		System.out.println("FH --> R&D");
	}
	
//	WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH --> covidVaccination");
	}
	

}
