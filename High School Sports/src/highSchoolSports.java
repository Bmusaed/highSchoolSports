
public class highSchoolSports {

		String season;
		int numberOfSports = 0;
		private int f;
		private int b;
		private int s;
		private int t;
		boolean filled;
		java.util.Date dateCreated;
	
	public highSchoolSports() {
		dateCreated = new java.util.Date();
				
	}
	public highSchoolSports (String season, int numberOfSports, boolean filled) {
		dateCreated = new java.util.Date();
		this.season = season;
		this.numberOfSports = numberOfSports;
		this.filled = filled;

	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getNumberOfSports() {
		return numberOfSports;
	}
	public void setNumberOfSports(int numberOfSports) {
		this.numberOfSports = numberOfSports;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getB() {
		return b;
	}
	public void setB(int f) {
		this.b = b;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public String toString() {
		return "created on " + dateCreated + "/nSeason: " + season + "and filled: " + filled;
		
	}
}
