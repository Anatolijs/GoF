package builder;

public class UserAccount {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private boolean newsletter;

    //The constructor that takes a builder from which it will create object
    //the access to this is only provided to builder
    private UserAccount(UserAccountBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.newsletter = builder.newsletter;
    }

    public static class UserAccountBuilder {
        private String name;
        private String address;
        private String email;
        private String phoneNumber;
        private boolean newsletter;

        //All Mandatory parameters goes with this constructor
        public UserAccountBuilder(String name, String address) {
            this.name = name;
            this.address = address;
        }

        //setters for optional parameters which returns this same builder
        //to support fluent design
        public UserAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserAccountBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        //the actual build method that prepares and returns a BankAccount object
        public UserAccount build() {
            return new UserAccount(this);
        }
    }

    //getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isNewsletter() {
        return newsletter;
    }
}
