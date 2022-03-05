public class Swvl {
	int BoardingPass;
	String PassengerName;
	String PickUpLocation;
	String DropOfLOcation;
	Swvl(){
		BoardingPass = (int)Math.floor(Math.random()*(1000-0+1)+0);
	}
	public void SetPName(String name) {
		PassengerName=name;
	}
	public void SetPickUp(String PickUp) {
		PickUpLocation=PickUp;
	}
	public void SetDropOfLOcation(String DropOfLOcation) {
		this.DropOfLOcation=DropOfLOcation;
	}
	public String GetName() {
		return PassengerName;
	}
	public String GetPickUp() {
		return PickUpLocation;
	}
	public String GetDropOf() {
		return DropOfLOcation;
	}
	public int GetBoardingPass() {
		return BoardingPass;
	}
}
