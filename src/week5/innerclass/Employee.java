package week5.innerclass;

public class Employee {

    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;

    public Employee(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone, email);
    }

    // Çalışan bilgilerini ve iletişim bilgilerini yazdıran metot
    public void displayEmployeeInfo() {
        System.out.println("Çalışan: " + firstName + " " + lastName);
        contactInfo.displayContactInfo();
    }

    public class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public void displayContactInfo() {
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-Posta: " + email);
        }
    }


}

