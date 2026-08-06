package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices(); // US
		fh.oncologyServices(); // US
		fh.pediaServices(); // US
		
		fh.dentalServices();// UK
		fh.orthoServices();// UK
		
		fh.gynoServices();// India
		fh.ENTServices();// India
		
		fh.emergencyServices();// Common
		
		fh.medicalInsurance();// FH
		fh.medicalTraining();// FH
		
		System.out.println(USMedical.MIN_fEE);//10
//		USMedical.MIN_fEE =60; // As it was final & static we can't change it
		System.out.println(FortisHospital.MIN_fEE);
		
		USMedical.billing();
		fh.medicalNewsPublish();
		fh.covidVaccination();
		
		System.out.println("------------");
//		Top casting: child class object can be referred by parent interface reference variable
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices(); 
		 
		IndianMedical in = new FortisHospital();
		in.gynoServices();
		in.ENTServices();
		in.emergencyServices();
		
//		Down casting: Parent interface object can be referred by child class reference variable --> NA
//		As we can not create object of interface it is not even possible at compile time.
//		FortisHospital fh1 = new USMedical();

	}

}
