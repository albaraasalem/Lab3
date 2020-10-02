public class BuddyInfo {
    public static String getName() {
        return name;
    }

    private static String name = "Ronaldo";
    private static String address;
    private static String phoneNumber;
    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args) {

        System.out.println("Hello "+getName());
    }
}
