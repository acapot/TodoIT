package org.example;

public class Person {
  /*  id : int
- firstNmae: String
- lastName: String
- email : String*/

    private static int id;
    private String firstname;
    private String lastName;
    private String email;

    public Person(String firstname, String lastName, String email) {
      /*  if(id == 0){
            throw new RuntimeException("id was null");
        }*/
        if(firstname == null){
            throw new RuntimeException("firstname was null");
        }

        if(lastName == null){
            throw new RuntimeException("lastname was null");
        }

        if(email == null){
            throw new RuntimeException("email was null");
        }
        // this.id = id;
        id++; //id Autoincrement

        //this.firstname = firstname;
        setFirstname(firstname);

        //this.lasName = lasName;
        setLastName(lastName);

        //this.email = email;
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummary(){
        String result ="The id is: "+this.id + "\nThe Name is: " + this.firstname + " " + this.lastName +
    "\nThe email is : " + this.email;

        return result;
    }

}
