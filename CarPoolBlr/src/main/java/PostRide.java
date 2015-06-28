package main.java;

public class PostRide {
	private iPostRideDB postRideDB;
	public String post(Ride ride)
	{
		if(ride.fname.equalsIgnoreCase(""))
		{
			return "Posting failed";
		}
		else
		{
			boolean result = postRideDB.update(ride);
		return "Posting was successful";
		}
	}

}
