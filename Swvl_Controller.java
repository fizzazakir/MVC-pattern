public class Swvl_Controller {

	Swvl_Passenger_View view =new Swvl_Passenger_View();
	Swvl sw =new Swvl();
	Swvl_Driver d=new Swvl_Driver();
	Swvl_Controller(Swvl_Passenger_View view,Swvl sw,Swvl_Driver d){
		this.view=view;
		this.sw=sw;
		this.d=d;
	}
	public void SetPName(String name) {
		sw.SetPName(name);
	}
	public void SetPickUp(String PickUp) {
		sw.SetPickUp(PickUp);
	}
	public void SetDropOfLOcation(String DropOfLOcation) {
		sw.SetDropOfLOcation(DropOfLOcation);
	}
	public void SetDriverName(String DriverName ) {
		d.SetDriverName(DriverName);
	}
	public void SetDriverCarNo(String CarNo ) {
		d.SetDriverCarNo(CarNo);
	}
	public void setDriverId(int DriverId ) {
		d.setDriverId(DriverId);
	}
	public void setDriverNo(int DriverPhoneNo ) {
		d.setDriverNo(DriverPhoneNo);
	}
	 
	void Show() {
		view.ShowBookingDetails(sw.GetName(),sw.GetPickUp(),sw.GetDropOf(),d.GetDriverID(),d.GetDriverCarNo(),d.GetDriverName(),d.GetDriverPhoneNO(),sw.GetBoardingPass());
	}
	
}
