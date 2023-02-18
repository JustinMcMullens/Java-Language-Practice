import java.util.ArrayList;

class Person 
{
  private String name;
  private int age;
  private char gender;
  private boolean isMarried;
  private double salary;
  private ArrayList<String> hobbies;

  public Person() 
  {
    this.hobbies = new ArrayList<>();
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public void setAge(int age) 
  {
    this.age = age;
  }

  public void setGender(char gender) 
  {
    this.gender = gender;
  }

  public void setIsMarried(boolean isMarried) 
  {
    this.isMarried = isMarried;
  }

  public void setSalary(double salary) 
  {
    this.salary = salary;
  }

  public void addHobby(String hobby) 
  {
    this.hobbies.add(hobby);
  }

  public String getName() 
  {
    return this.name;
  }

  public int getAge() 
  {
    return this.age;
  }

  public char getGender()
  {
    return this.gender;
  }

  public boolean getIsMarried() 
  {
    return this.isMarried;
  }

  public double getSalary() 
  {
    return this.salary;
  }

  public ArrayList<String> getHobbies() 
  {
    return this.hobbies;
  }
}
