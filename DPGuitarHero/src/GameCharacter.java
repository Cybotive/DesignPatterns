//Joshua Lini 10-4-19
public class GameCharacter {
	
	private GuitarBehavior guitarBehavior;
	private SoloBehavior soloBehavior;
	private String name;
	
	public GameCharacter(GuitarBehavior gB, SoloBehavior sB) {
		this.setGuitar(gB);
		this.setSolo(sB);
	}
	
	public void setGuitar(GuitarBehavior gB) {
		if(gB != null)
			this.guitarBehavior = gB;
	}
	
	public void setSolo(SoloBehavior sB) {
		if(sB != null)
			this.soloBehavior = sB;
	}
	
	public void playGuitar() {
		this.guitarBehavior.play();
	}

	public void playSolo() {
		this.soloBehavior.solo();
	}

}
