import java.util.ArrayList;
//this comment was made through gitHub
public class AddressBook {
    private ArrayList<BuddyInfo> collection;

    private AddressBook(){

        collection = new ArrayList<>();
    }

    /**
     * adds a buddyInfo to the buddyInfo collection
     */
    private void addBuddy(BuddyInfo obj){

        collection.add(obj);
    }

    /**
     * removes a buddyInfo from the buddyInfo collection
     */
    private void removeBuddy(BuddyInfo obj){

        collection.remove(obj);
    }

    private void newMethod(){

    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Ronaldo", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
