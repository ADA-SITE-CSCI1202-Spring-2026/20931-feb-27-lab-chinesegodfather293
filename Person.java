public class Person {
    String firstName;
    String lastName;
    String gender;

    Person(String firstName, String lastName, String gender ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;   
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString(){
        return firstName + " " + lastName + " " + gender;
    }
    public boolean equals(Person p){
        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && gender.equals(p.gender);
    }
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", "Male");
        Person p2 = new Person("Jane", "Doe", "Female");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1 equals p2: " + p1.equals(p2));
    }
}
