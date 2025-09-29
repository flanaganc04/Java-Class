public class SongCard {
    
    boolean active;
    int songs;

    public SongCard() {
        active = false;
        songs = 0;
    }

    public SongCard(int numbSongs) {
        active = false;
        songs = numbSongs;
    }

    public void activate() {
        if (active = true) {
            System.out.println("This card is already active");
        }
        else {
            active = true;
            System.out.println("This card has been activated!");
        }
    }

    public boolean active() {
        return active;
    }

    public void buyASong() {
        if (active == true) {
            if (songs > 0) {
                songs -= 1;
                System.out.println("Your purchase was succesful!");
                System.out.println("The number of songs remaining is " + songs);
            }
            else {
                System.out.println("There are no songs remaining on this card!");
            }
        }
        else{
            System.out.println("This card is not active!");
        }
    }

    public void buySongs(int numbSongs) {
        if (active == true) {
            if (numbSongs < songs && songs > 0) {
                songs -= numbSongs;
                System.out.println("Your purchase was succesful!");
                System.out.println("The number of songs remaining is " + songs);
            }
            else {
                System.out.println("There are not enough songs remaining on this card!");
            }
        }
        else{
            System.out.println("This card is not active!");
        }
    }

    public int Songs() {
        return songs;
    }

    public static void main(String[] args) {
        
        SongCard firstCard = new SongCard(5);

        firstCard.buyASong();

        firstCard.activate();

        firstCard.buyASong();
        firstCard.buyASong();
        firstCard.buyASong();
        firstCard.buyASong();
        firstCard.buyASong();
        firstCard.buyASong();
        firstCard.buyASong();

        SongCard secondCard = new SongCard(10);

        secondCard.activate();
        secondCard.buySongs(11);
        secondCard.buySongs(5);
        System.out.println(secondCard.Songs());
    }
}
