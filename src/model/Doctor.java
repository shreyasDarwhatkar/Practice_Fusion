package model;


public class Doctor implements Comparable<Doctor> {
	int id;
	String name;
	String locality;
	String Speciality;
	double reviewScore;
	
	public Doctor(int id, String name, String locality, String speciality,
			double reviewScore) {
		super();
		this.id = id;
		this.name = name;
		this.locality = locality;
		Speciality = speciality;
		this.reviewScore = reviewScore;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public double getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(double reviewScore) {
		this.reviewScore = reviewScore;
	}

	@Override
	public int compareTo(Doctor arg0) {
		double compareScore=((Doctor)arg0).getReviewScore();
        /* For Descending order*/
		if(compareScore<this.reviewScore)
			return -1;
		else 
			return 1;
	}

}
