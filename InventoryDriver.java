import java.util.Date;

public class InventoryDriver extends Book{
    public static void main(String[] args) {
        Item[] myInventory = new Item[50];
        myInventory[0] = new Book("Godzilla on holiday", 24.95,5,"Wesly Wyrham Price", "Rasnam House","Fiction");
        myInventory[1] = new Book("Loch Ness Memories", 49.95,1,"Fred MacMurray","Penguin Press","Fiction");
        myInventory[2] = new Book("MWS JCL", 89.95,5,"Steve Balmer","Microsoft Press","Non-Fiction");
        myInventory[3] = new Book("Keep in the nature", 19.95,8,"Bill Gates","O-Relly","Non-Fiction");
        myInventory[4] = new Book("Unit computing", 29.95, 2,"Bobby Bonwald","Treuser Press","Non-Fiction");

        Artist artist1 = new Artist("YES");
        myInventory[5] = new CD("Going for the one", 12.95, 4, artist1, new Date("07/07/1977"));
        Artist artist2 = new Artist("Genesis");
        myInventory[6] = new CD("Trcik of the tail", 12.95, 7, artist2, new Date("07/07/1977"));
    }
}