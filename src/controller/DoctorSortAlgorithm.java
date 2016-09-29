package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Doctor;


public class DoctorSortAlgorithm {
	List<Doctor> lstDoctors;

	public DoctorSortAlgorithm() {
		lstDoctors = new ArrayList<Doctor>();
		lstDoctors.add(new Doctor(1, "Maria", "SFO", "Cardiologist", 3.2));
		lstDoctors.add(new Doctor(2, "Ana", "SFO", "Cardiologist", 3.4));
		lstDoctors.add(new Doctor(3, "Charles", "SFO", "Neurologist", 3.1));
		lstDoctors.add(new Doctor(4, "George", "LA", "Neurologist", 4.5));
		lstDoctors.add(new Doctor(5, "Manish", "LA", "Orthopedic", 2.8));
		lstDoctors.add(new Doctor(6, "Steve", "Chicago", "Orthopedic", 3.6));
		lstDoctors.add(new Doctor(7, "Stella", "Chicago", "Cardiologist", 1.5));
		lstDoctors.add(new Doctor(8, "Rose", "Chicago", "Neurologist", 4.5));
		lstDoctors.add(new Doctor(9, "Crystal", "SFO", "Orthopedic", 3.8));
		lstDoctors.add(new Doctor(10, "Kemp", "LA", "Gynecologist", 3.9));
	}
	
	public List<Doctor> getAllDoctors(){
		return lstDoctors;
	}
	
	//Filter by Same Location and prioritized by review score(Doctor with high review score will be at the top)
		public List<Doctor> sameLocationSortByReviewScore(Doctor paramDoctor){
			List<Doctor> lstResult = new ArrayList<Doctor>();
			for(Doctor d :lstDoctors){
				if(d.getLocality().equalsIgnoreCase(paramDoctor.getLocality())){
					lstResult.add(d);
				}
			}
			
			Collections.sort(lstResult);
			return lstResult;
			
		}
		
		//Filter by Same Specialization and prioritized by review Score. (Doctor with high review score will be at the top)
		public List<Doctor> sameSpecialitySortByReviewScore(Doctor paramDoctor){
			List<Doctor> lstResult = new ArrayList<Doctor>();
			for(Doctor d :lstDoctors){
				if(d.getSpeciality().equalsIgnoreCase(paramDoctor.getSpeciality())){
					lstResult.add(d);
				}
			}	
			Collections.sort(lstResult);
			return lstResult;
			
		}


	
}
