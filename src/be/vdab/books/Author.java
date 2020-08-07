package be.vdab.books;

public class Author {

    private String name;
    private String email;
    private Gender gender;

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * interessante oplossing! Extra punt voor creativiteit.
     */
    public enum Gender {M, V, X}

    @Override
    public String toString() {
        return "Author" + "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender;
    }
}
