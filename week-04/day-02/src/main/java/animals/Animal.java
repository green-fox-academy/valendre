package main.java.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;

  public Animal(String name) {
    this.name = name;
  }


  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();
}
