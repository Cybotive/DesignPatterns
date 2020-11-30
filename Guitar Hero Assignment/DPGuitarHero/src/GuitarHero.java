//Joshua Lini 10-4-19
public class GuitarHero {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacter("Slash", new GibsonSG(), new GuitarOnFire()); //note that constructor could be designed to accept initial behaviors
        GameCharacter player2 = new GameCharacter("Jimi Hendrix", new GibsonSG(), new GuitarOnFire());
        GameCharacter player3 = new GameCharacter("Angus Young", new GibsonSG(), new GuitarOnFire());
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();

        //add code below to show the swapping of behaviors
        
        player1.setGuitar(new FendTelecaster());
        player1.setSolo(new SmashGuitar());
        player1.playGuitar();
        player1.playSolo();
        
        player1.setGuitar(new GibFlyingV());
        player1.setSolo(new JumpOffStage());
        player1.playGuitar();
        player1.playSolo();
        
    }
}