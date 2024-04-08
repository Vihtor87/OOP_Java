package module;

public abstract class User {
    private String firstName;
    private String lastName;
    private String meddleName;

    public User(String firstName, String lastName, String meddleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.meddleName = meddleName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMeddleName() {
        return meddleName;
    }
    public void setMeddleName(String firstName) {
        this.meddleName = meddleName;
    }
}
