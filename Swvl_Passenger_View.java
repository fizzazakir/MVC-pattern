import java.util.Scanner;

class Swvl_Passenger_View { 
	Scanner sc=new Scanner(System.in);
	void ShowBookingDetails(String pname,String pickUp,String DropOF,int DriverID,String CarNo, String DriverName,int Phone,int boardingPass) {
		System.out.println("RIDE DETAILS:");
		System.out.println("Passenger Name:" + pname);
		System.out.println("Boarding ID:" + boardingPass);
		System.out.println("Driver ID:" + DriverID);
		System.out.println("Driver Phone:" + Phone);
		System.out.println("Driver Name:" + DriverName);
		System.out.println("Car No :" + CarNo);
		System.out.println("From :" + pickUp);
		System.out.println("TO :" + DropOF);
	}
}
