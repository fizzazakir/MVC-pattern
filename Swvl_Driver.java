public class Swvl_Driver {
String DriverName;
String CarNo;
int DriverId;
int NoOfRides;
int DriverPhoneNo;

public void SetDriverName(String DriverName ) {
	this.DriverName=DriverName;
}
public void SetDriverCarNo(String CarNo ) {
	this.CarNo=CarNo;
}
public void setDriverId(int DriverId ) {
	this.DriverId=DriverId;
}
public void setDriverNo(int DriverPhoneNo ) {
	this.DriverPhoneNo=DriverPhoneNo;
}
public String GetDriverName() {
	return DriverName;
}
public int GetDriverID() {
	return DriverId;
}
public String GetDriverCarNo() {
	return CarNo;
}
public int GetDriverPhoneNO() {
	return DriverPhoneNo;
}
}
