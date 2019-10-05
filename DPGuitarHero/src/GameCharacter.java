//Joshua Lini 10-4-19
public class GameCharacter {
	
	private GuitarBehavior guitarBehavior;
	private SoloBehavior soloBehavior;
	private String name;
	
	public GameCharacter(String name, GuitarBehavior gB, SoloBehavior sB) {
		if(name == null) {throw new IllegalArgumentException("Name may not be null");}
		this.name = name;//removed setName() to match UML diagram
		
		this.setGuitar(gB);
		this.setSolo(sB);
	}

	public void setGuitar(GuitarBehavior gB) {
		if(gB == null) {throw new IllegalArgumentException("GuitarBehavior may not be null");}
		this.guitarBehavior = gB;
	}
	
	public void setSolo(SoloBehavior sB) {
		if(sB == null) {throw new IllegalArgumentException("SoloBehavior may not be null");}
		this.soloBehavior = sB;
	}
	
	public void playGuitar() {
		System.out.print(name + " ");
		this.guitarBehavior.play();
	}

	public void playSolo() {
		System.out.print(name + " ");
		this.soloBehavior.solo();
	}

}
