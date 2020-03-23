package greenfox;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() +
        " year old " + super.getGender() + " who represents " + this.getCompany() + " and hired " +
        this.getHiredStudents() + " students so far.");
  }

  public void hire() {
    this.hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public String getCompany() {
    return company;
  }
}
