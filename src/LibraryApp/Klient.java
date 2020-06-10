package LibraryApp;

public class Klient {


    private String clientName;
    private String phoneNumber;
    private int clientID;


    private static int freeID = 0;

    public Klient(String clientName) {
        this.clientID = freeID;
        freeID++;
    }


    public Klient(String clientName, String phoneNumber) {
        this.clientID = freeID;
        freeID++;

        this.phoneNumber = phoneNumber;
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
}




