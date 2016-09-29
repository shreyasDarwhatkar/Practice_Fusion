import java.util.*;

import model.Doctor;

import org.junit.Test;

import controller.DoctorSortAlgorithm;
import static org.junit.Assert.assertEquals;

public class UnitsTestJava {
	
	@Test
	 public void TestgetAll() {
		DoctorSortAlgorithm objDoctorSortAlgorithm= new DoctorSortAlgorithm();
		  List<Doctor> lstDoc = objDoctorSortAlgorithm.getAllDoctors();
		  assertEquals(lstDoc.size(),10);
		  assertEquals(lstDoc.get(0).getName(),"Maria");
		
	  }
	
	@Test
	 public void TestSameLocationSortByReviewScore() {
		DoctorSortAlgorithm objDoctorSortAlgorithm= new DoctorSortAlgorithm();
		Doctor objDoctor = new Doctor(1, "Maria", "SFO", "Cardiologist", 3.2);
		  List<Doctor> sortbyLoc = objDoctorSortAlgorithm.sameLocationSortByReviewScore(objDoctor);
		  assertEquals(sortbyLoc.size(),4);
		  assertEquals(sortbyLoc.get(0).getName(),"Crystal");
		  assertEquals(sortbyLoc.get(0).getLocality(),"SFO");
		  assertEquals((Double.toString(sortbyLoc.get(0).getReviewScore())),Double.toString(3.8));
	  }
	
	@Test
	 public void TestSameSpecialitySortByReviewScore() {
		DoctorSortAlgorithm objDoctorSortAlgorithm= new DoctorSortAlgorithm();
		Doctor objDoctor = new Doctor(1, "Maria", "SFO", "Cardiologist", 3.2);
		  List<Doctor> sortbySpecialization = objDoctorSortAlgorithm.sameSpecialitySortByReviewScore(objDoctor);
		  assertEquals(sortbySpecialization.size(),3);
		  assertEquals(sortbySpecialization.get(0).getName(),"Ana");
		  assertEquals(sortbySpecialization.get(0).getSpeciality(),"Cardiologist");
		  assertEquals((Double.toString(sortbySpecialization.get(0).getReviewScore())),Double.toString(3.4));
	  }

}
