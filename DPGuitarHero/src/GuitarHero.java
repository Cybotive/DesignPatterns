//Joshua Lini 10-4-19
public class GuitarHero {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash(); //note that constructor could be designed to accept initial behaviors
        GameCharacter player2 = new GameCharacterHendrix();
        GameCharacter player3 = new GameCharacterAngus();
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();

        //add code below to show the swapping of behaviors
        
        //could've combined 'for' loops, but am showing decoupling
        for(int i = 1; i < 3; i++) {
        	System.out.println("------------------------------------------------------------");
            
            player1.setGuitar(i);
            player2.setGuitar(i);
            player3.setGuitar(i);
            
            player1.playGuitar();
            player2.playGuitar();
            player3.playGuitar();
            player1.playSolo();
            player2.playSolo();
            player3.playSolo();
        }
        
        for(int i = 1; i < 3; i++) {
        	System.out.println("------------------------------------------------------------");
            
        	player1.setSolo(i);
            player2.setSolo(i);
            player3.setSolo(i);
            
            player1.playGuitar();
            player2.playGuitar();
            player3.playGuitar();
            player1.playSolo();
            player2.playSolo();
            player3.playSolo();
        }
        
    }
}