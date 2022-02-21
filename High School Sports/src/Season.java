
public class Season extends highSchoolSports {
	private String season;
	
	public Season() {
		
	}
	public void Season(String season) {
		this.season = season;
	}
	public Season(String season, int numberOfSports, boolean filled) {
		this.season = season;
		setNumberOfSports (numberOfSports);
	}
	public void setNumberOfSports (int numberOfSports) {
		this.numberOfSports = numberOfSports;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	protected void Season(){
		System.out.println("Season: ");
	}
	void stop() {
		System.out.println("Stop");
	}

}
