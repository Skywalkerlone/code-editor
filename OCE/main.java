
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Online Code Editor ===");
        System.out.println("Write and execute Java code directly in your browser!");
        System.out.println("================================
");
        
        // Basic Java Syntax Examples
        System.out.println("Basic Java Examples:");
        System.out.println("--------------------");
        
        // Variables and Data Types
        String name = "Java Developer";
        int age = 25;
        double salary = 75000.50;
        boolean isActive = true;
        char grade = 'A';
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.printf("Salary: $%.2f%n", salary);
        System.out.println("Active: " + (isActive ? "Yes" : "No"));
        System.out.println("Grade: " + grade);
        
        // Arrays
        String[] languages = {"Java", "JavaScript", "Python", "C++"};
        System.out.println("\nLanguages: " + Arrays.toString(languages));
        
        // Functions/Methods
        System.out.println("\nFunction Examples:");
        System.out.println("Sum of 10 and 20: " + calculateSum(10, 20));
        System.out.println("Is 15 even? " + (isEven(15) ? "Yes" : "No"));
        
        // Control Structures
        System.out.println("\nControl Structures:");
        int score = 85;
        System.out.print("Score: " + score + " - ");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        
        // Loops
        System.out.print("\nNumbers 1-10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // While loop
        System.out.print("Even numbers (while): ");
        int num = 2;
        while (num <= 10) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
        
        // Collections
        System.out.println("\nCollection Examples:");
        
        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);
        
        // HashMap
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 88);
        studentGrades.put("Charlie", 92);
        System.out.println("Student Grades: " + studentGrades);
        
        // Object-Oriented Programming
        System.out.println("\nObject-Oriented Programming:");
        Person person1 = new Person("John Doe", 30);
        System.out.println(person1.introduce());
        
        Student student1 = new Student("Jane Smith", 20, "S001", "Computer Science");
        System.out.println(student1.introduce());
        
        // Exception Handling
        System.out.println("\nException Handling Example:");
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cannot divide by zero!");
        }
        
        // Current Date and Time
        System.out.println("\nDate and Time:");
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println("Current Date: " + now.toLocalDate());
        System.out.println("Current Time: " + now.toLocalTime());
        System.out.println("Day of Week: " + now.getDayOfWeek());
        
        System.out.println("\n=========================================");
        System.out.println("✓ Program executed successfully!");
        System.out.println("Try modifying the code or load an example.");
        System.out.println("=========================================");
    }
    
    // Static methods
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

// Person class
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String introduce() {
        return "Hello, I'm " + name + ", " + age + " years old.";
    }
}

// Student class (inherits from Person)
class Student extends Person {
    private String studentId;
    private String major;
    
    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    
    @Override
    public String introduce() {
        return super.introduce() + " I'm a " + major + " student (ID: " + studentId + ").";
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getMajor() {
        return major;
    }
}