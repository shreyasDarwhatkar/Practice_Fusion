import model.*;
import controller.*;;


public class MainPage {

	public static void main(String[] args) {
		DoctorSortAlgorithm objDoctorSortAlgorithm = new DoctorSortAlgorithm();
		System.out.println("********All the Doctors in the List");
		for(Doctor d : objDoctorSortAlgorithm.getAllDoctors()){
			System.out.println(d.getName());
		}
		System.out.println("**************Elelemt Filter by Location and Sortby Score");
		Doctor objDoctor = new Doctor(1, "Maria", "SFO", "Cardiologist", 3.2);
		for(Doctor d: objDoctorSortAlgorithm.sameLocationSortByReviewScore(objDoctor)){
			System.out.println(d.getName()+"-"+d.getLocality()+"-"+d.getReviewScore());
		}
		
		System.out.println("*******Elelemt Filter by Speciality and Sortby Score");
		for(Doctor d: objDoctorSortAlgorithm.sameSpecialitySortByReviewScore(objDoctor)){
			System.out.println(d.getName()+"-"+d.getSpeciality()+"-"+d.getReviewScore());
		}

	}

}
