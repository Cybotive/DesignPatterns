//Joshua Lini 10-4-19
public class GameCharacterHendrix extends GameCharacter {
	
	GameCharacterHendrix(){
		name = "Jimi Hendrix";
		this.setGuitar(0);
		this.setSolo(0);
	}
	
	GameCharacterHendrix(int guitarSel, int soloSel){
		name = "Jimi Hendrix";
		//filtering provided by set methods
		this.setGuitar(guitarSel);
		this.setSolo(soloSel);
	}
	
	public void playGuitar() {
		String playing = name + " plays the " + this.getGuitar() + " with his dreadlocks!";
		System.out.println(playing);
	}
	
	public void playSolo() {
		String soloing = name + " " + this.getSolo() + " while grinning wildly.";
		System.out.println(soloing);
	}
	
}
