import java.util.ArrayList;
import java.util.List;

public class Main 
{

    public static Person createPerson(String name, int age, char gender, boolean isMarried, int salary, String[] hobbies) 
    {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIsMarried(isMarried);
        person.setSalary(salary);
        for (String hobby : hobbies) 
        {
            person.addHobby(hobby);
        }
        return person;
    }

    public static void evaluateExpressions() 
    {
        // Arithmetic expressions
        System.out.println("Arithmetic Expressions:");
        System.out.println("1 + 2");
        System.out.println("7 - 4");
        System.out.println("5 * 10");
        System.out.println("8 / 2");
        System.out.println();
    
        // Relational expressions
        System.out.println("Relational Expressions:");
        System.out.println("1 < 2");
        System.out.println("5 >= 5");
        System.out.println("10 == 10");
        System.out.println("8 != 9");
        System.out.println();
        
        // Logical expressions
        System.out.println("Logical Expressions:");
        System.out.println("True if both 'a' and 'b' are true: a && b");
        System.out.println("True if 'a' is false: !a");
        System.out.println("True if 'a' or 'b' are true: a || b");
        System.out.println();
        
        // Method call expressions
        System.out.println("Method Call Expressions:");
        //Math.pow take the first argument and raise it to the power of the second argument
        System.out.println("System.out.println(Math.pow(2, 3)) = " + Math.pow(2, 3));
        System.out.println();
        
        // Array access expressions
        System.out.println("Array Access Expressions:");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("numbers[]: {1, 2, 3, 4, 5}");
        int indexCall = numbers[2];
        System.out.println("int indexCall = numbers[2]");
        System.out.println("int indexCall = " + indexCall);
        System.out.println();
    }

    public static void conditionalsFunction() 
    {
        System.out.println("Conditionals:");
    
        int a = 4;
        int b = 2;
    
        //if, else if, else statements
        System.out.println("If, Else If and Else Conditional Statements:");
        //Check if the code in the parentheses is true, if so execute the code in the brackets
        if (a < b) 
        {
            //Tell it to do something
            System.out.println("a is less than b");
        }
        //If the first if was not true check if the code in these parentheses is true, if so execute the code in the brackets
        //*Note* you can have as many "else if" conditionals as you want
        else if (a > b) 
        {
            //Tell it to do something
            System.out.println("a is greater than b");
        }
        //If none of the if or else if conditionals are true, it will automatically run the else statement
        else 
        {
            //Tell it to do something
            System.out.println("a is equal to b");
        }
    
        int day = 3;
    
        System.out.println("Switch Conditional Statement:");
        //Use a switch statement to run a specific block of code based on a variable or expression
        //Check what the value of the day is
        switch (day) 
        {
            //If the value is one, display Monday
            case 1:
                System.out.println("Monday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //If the value is two, display Tuesday
            case 2:
                System.out.println("Tuesday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //If the value is three, display Wednesday
            case 3:
                System.out.println("Wednesday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //If the value is four, display Thursday
            case 4:
                System.out.println("Thursday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //If the value is five, display Friday
            case 5:
                System.out.println("Friday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //If the value is six, display Saturday
            case 6:
                System.out.println("Saturday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //If the value is seven, display Sunday
            case 7:
                System.out.println("Sunday");
                break;  //Break tells the program to stop executing more code from this switch block of code
            //default will run if there is no other match from the cases above it
            default:
                System.out.println("Not a valid number");
        }
    }    

    public static void loopFunction() 
    {
        int x = 5;
    
        System.out.println("\nWhile Loop");
        while (x > 0) 
        {
            System.out.println(x);
            x--;
        }
    
        int y = 4;
    
        System.out.println("\nDo While Loop");
        do 
        {
            System.out.println(y);
            y--;
        } while (y > 0);
    
        System.out.println("\nFor Loop");
        for (int i = 5; i <= 10; i++) 
        {
            System.out.println(i);
        }
    }    
      
    public static void main(String[] args) 
    {
        //Create a list so that you can add multiple people to the list so that you can display their information all at once
        List<Person> people = new ArrayList<>();
        
        //Add individual people to the list of people
        people.add(createPerson("Jane Doe", 30, 'F', true, 220000, new String[] {"Snowboarding"}));
        people.add(createPerson("John Doe", 33, 'M', false, 150000, new String[] {"Programming", "Car Repair"}));

        //run through the entire list of people
        for (Person person : people) 
        {
            //Display the info of the person it is currently on
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Married: " + person.getIsMarried());
            System.out.println("Salary: " + person.getSalary());
            System.out.println("Hobbies: " + person.getHobbies() + "\n");
        }

        evaluateExpressions();
        conditionalsFunction();
        loopFunction();
        System.out.println();

        CarBrand bmw = new BMW();
        CarBrand volkswagen = new Volkswagen();
        CarBrand chevrolet = new Chevrolet();

        System.out.println("Brand: " + bmw.getBrandName());
        bmw.displayCarModels();
        System.out.println();

        System.out.println("Brand: " + volkswagen.getBrandName());
        volkswagen.displayCarModels();
        System.out.println();

        System.out.println("Brand: " + chevrolet.getBrandName());
        chevrolet.displayCarModels();
        System.out.println();
    }
}
