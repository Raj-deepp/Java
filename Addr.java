// Define the Address interface
interface Address {
    void setAddress(String address);
    String getAddress();
}

// Concrete class HomeAddress implementing Address interface
class HomeAddress implements Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

// Concrete class OfficeAddress implementing Address interface
class OfficeAddress implements Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

// Concrete class SchoolAddress implementing Address interface
class SchoolAddress implements Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

// Main class to test the program
public class Addr {
    public static void main(String[] args) {
        // Creating instances of different address types
        Address homeAddress = new HomeAddress();
        Address officeAddress = new OfficeAddress();
        Address schoolAddress = new SchoolAddress();

        // Setting addresses
        homeAddress.setAddress("1234 Home Street, City, Country");
        officeAddress.setAddress("5678 Office Street, City, Country");
        schoolAddress.setAddress("91011 School Street, City, Country");

        // Displaying addresses
        System.out.println("Home Address: " + homeAddress.getAddress());
        System.out.println("Office Address: " + officeAddress.getAddress());
        System.out.println("School Address: " + schoolAddress.getAddress());
    }
}
