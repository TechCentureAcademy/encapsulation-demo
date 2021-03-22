package session3;

public class Reservation {

	
	private int id;
	private String reserverName;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	private int buildingId;
	private int roomId;
	
	public Reservation(int id, String reserverName, String startDate, String endDate, String startTime, String endTime,
			int buildingId, int roomId) {
		
		this.id = id;
		this.reserverName = reserverName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.buildingId = buildingId;
		this.roomId = roomId;
	}

	
	
	
	
	
}
