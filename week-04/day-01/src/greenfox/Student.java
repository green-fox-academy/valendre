package greenfox;

public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    this.previousOrganization = " The School of Life";
    this.skippedDays = 0;
  }

  @Override
  protected Student clone() {
    return new Student(this.getName(), this.getAge(), this.getGender(), this.getPreviousOrganization());
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public String getPreviousOrganization() {
    return this.previousOrganization;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " +
        super.getGender() + " from " + this.previousOrganization + " who skipped " + this.skippedDays +
        " days from the course already.");

  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}
