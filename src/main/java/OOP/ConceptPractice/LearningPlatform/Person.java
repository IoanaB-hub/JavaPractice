package OOP.ConceptPractice.LearningPlatform;

public abstract class Person {

    private int userID;
    private String name;
    private String email;


    public Person(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    abstract String getRole();


}
