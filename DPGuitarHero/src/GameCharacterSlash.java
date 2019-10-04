//Joshua Lini 10-4-19
public class GameCharacterSlash extends GameCharacter {
	
	GameCharacterSlash(){
		name = "Slash";
		this.setGuitar(0);
		this.setSolo(0);
	}
	
	GameCharacterSlash(int guitarSel, int soloSel){
		name = "Slash";
		//filtering provided by set methods
		this.setGuitar(guitarSel);
		this.setSolo(soloSel);
	}
	
	public void playGuitar() {
		String playing = name + " slashes the " + this.getGuitar() + " like the Hash-Slinging Slasher!!!";
		System.out.println(playing);
	}
	
	public void playSolo() {
		String soloing = name + " " + this.getSolo() + " while holding a spatula!";
		System.out.println(soloing);
	}
	
}
