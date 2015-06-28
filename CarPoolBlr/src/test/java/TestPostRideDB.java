package test.java;

import junit.framework.TestCase;

import main.java.PostRideDB;
import main.java.Ride;

public class TestPostRideDB extends TestCase{

	public void postRideDBConnectionCheck()
	{
		PostRideDB postRideDB = new PostRideDB();
		String connection = "DB=carpool, password=admin";
		assertEquals(true, postRideDB.connection(connection));
	}
	public void postRideUpdate()
	{
		Ride ride = new Ride();
		ride.setFname("Naveen");
		ride.setLname("Singh");
		PostRideDB postRideDB = new PostRideDB();
		assertEquals(true, postRideDB.update(ride));
	}
}
