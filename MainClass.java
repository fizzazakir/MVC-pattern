public class MainClass {
	public static void main(String [] args) {
		Swvl_Passenger_View view=new Swvl_Passenger_View();
		Swvl sw=new Swvl();
		Swvl_Driver sd=new Swvl_Driver();
		Swvl_Controller  controller=new Swvl_Controller(view,sw,sd);
		controller.SetPName("fizza");
		controller.SetDriverCarNo("2323");
		controller.setDriverId(23);
		controller.SetDriverName("elon");
		controller.setDriverNo(2323);
		controller.SetPickUp("wireless gate");
		controller.SetDropOfLOcation("Fast Nuces");
		controller.Show();
	}
}
