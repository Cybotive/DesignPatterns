//Joshua Lini 10-4-19
public class GameCharacterAngus extends GameCharacter {
	
	GameCharacterAngus(){
		name = "Angus Young";
		this.setGuitar(0);
		this.setSolo(0);
	}
	
	GameCharacterAngus(int guitarSel, int soloSel){
		name = "Angus Young";
		//filtering provided by set methods
		this.setGuitar(guitarSel);
		this.setSolo(soloSel);
	}
	
	public void playGuitar() {
		String playing = name + " tenderizes the " + this.getGuitar() + " by playing a G chord over and over.";
		System.out.println(playing);
	}
	
	public void playSolo() {
		String soloing = name + " " + this.getSolo() + " while riding a cow!";
		System.out.println(soloing);
	}
	
}
