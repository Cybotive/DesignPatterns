import java.util.Random;

//Joshua Lini 10-4-19
public abstract class GameCharacter {
	
	private String solo;
	private String guitar;
	protected String name;//if private I'd need a protected set method which doesn't know what to filter anyway, so pointless
	
	public void setGuitar(int sel) {
		switch(sel) {
		case 0:
			this.guitar = "Gibson SG";
			break;
		case 1:
			this.guitar = "Fender Telecaster";
			break;
		case 2:
			this.guitar = "Gibson Flying V";
			break;
			
		default:
			break;//don't assume default value here
		}
	}
	
	protected String getGuitar() {
		return guitar;
	}
	
	public void setSolo(int sel) {
		switch(sel) {
		case 0:
			this.solo = "sets their guitar on fire";
			break;
		case 1:
			this.solo = "jumps off the stage";
			break;
		case 2:
			this.solo = "smashes their guitar";
			break;
			
		default:
			break;//don't assume default value here
		}
	}
	
	protected String getSolo() {
		return solo;
	}
	
	public abstract void playGuitar();

	public abstract void playSolo();

}
