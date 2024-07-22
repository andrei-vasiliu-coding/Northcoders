1. Introduction
```java
jshell> int x = 35;
x ==> 35

jshell> int banana = 100;
banana ==> 100
```

```java
jshell> String name = "Smita";
name ==> "Smita"

jshell> String hello = "Hello, ";
hello ==> "Hello, "

jshell> hello + name;
$21 ==> "Hello, Smita"
```

Function:
```java
jshell> int add(int x, int y) {
   ...> return x + y;
   ...> }
```

Var: Java decided the type
```java
var result = add(12,15)
```

Void: gives no return
```java
void greet(String name) {
    System.out.println("Hello, " + name);
}
```

```java
 int greet(String name){
   ...>     var output = "Hello, " + name;
   ...>     System.out.println(output);
   ...>     return output.length();
   ...> }
|  replaced method greet(String)
```
```java
 var length = greet("Nobody")
Hello, Nobody
length ==> 13
```


2. Objects and classes
```java
String opinion = "I like coffee";
System.out.println(opinion); // prints "I like coffee"
```

This syntax is equivalent:

```java
String opinion = new String("I like coffee");
System.out.println(opinion); // prints "I like coffee"
```

With a `String`, it's almost always preferred to use the simpler syntax `var opinion="Lemons are tasty";`

```java
var ford = new Car("Ford", 1995, "Blue", "95mph");
var ferrari = new Car("Ferrari", 2024, "Red", "9999mph");
```

```java
int greet(String name){
   ...>     var output = "Hello, " + name;
   ...>     System.out.println(output);
   ...>     return output.length();
   ...> }
```

## Making our own classes

```java
class Person {
    
    String name;
    int age;
        
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }
}
```

```java
// replace the parameters with your name and age
var me = new Person("MY_NAME", MY_AGE);
```

```java
jshell> me.name
$17 ==> "YOUR_NAME"

jshell> me.age
$18 ==> 27

jshell> me.sayHello()
Hello, my name is YOUR_NAME and I am 27 years old.
```

```java
me.name = "Mili";
me.name; 
$20 ==> "Mili";
```

```java
me.age += 1; // this means add 1 to the existing value
me.age; 
$21 ==> 28
```

```java
public void sayHello() {
    System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
}
```

```java
me.sayHello();
you.sayHello();
```


# Constructors

```java
// tell Java we are defining a new class called "Person"
class Person {
    
        // define fields to store data for each instance
    String name;
    int age;
        
        // a very weird-looking method..?
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
        // a method to display data for each instance
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }
}
```

This method in the middle stands out as odd:

```java
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
```

A **method signature** is a declaration that specifies the method's name, return type, and parameter types in a programming language. For example, `int add(int x, int y)` is a **method signature** for a method which takes two `int` parameters and returns an `int`.

```java
this.name = name;
this.age = age;
```

In cases like this, where the class fields share names with the parameters, we use `this.name` to distinguish the class field `name` from the parameter called `name`.

```java
public class Person {
    String name;
    int age;

    // Constructor with both name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name parameter (age set to default)
    public Person(String name) {
        this.name = name;
        this.age = 99; // Default age
    }

    // ...other methods and code for the Person class can go here...
}
```

```java
var firstPerson = new Person("Davina", 28);
var secondPerson = new Person("Jurgen");

firstPerson.age; // 28 - using the value passed in
secondPerson.age; // 99 - using the default
```

```java
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
                System.out.println("Used 2-parameter constructor");
    }
    
    public Person(String name) {
        this.name = name;
        this.age = 99;
                System.out.println("Used 1-parameter constructor");
    }    
}
```

```java
var thirdPerson = new Person("Virgil", 26);
var fourthPerson = new Person("Stephen");
```

```java
int add(int x, int y){
    return x + y;
}

double add(double x, double y){
    return x + y;
}
```

# Access Modifiers

```java
public class Bike {
    
    private String make;
    private int year;
    
    public String colour;

    public Bike(String make, int year, String colour){		
        this.make = make;
        this.year = year;
        this.colour = colour;
    }

}
```

Let's try instantiating this new class and accessing its properties:

```java
var raleigh = new Bike("Raleigh", 1990, "Blue");

raleigh.make; // error
raleigh.year; // error
raleigh.colour; // allowed
```
## Getters

```java
public class Bike {
    
    private String make;
    private int year;	
    private String colour;

    public Bike(String make, int year, String colour){		
        this.make = make;
        this.year = year;
        this.colour = colour;
    }

    public String getMake(){
        return this.make;
    }

    public int getYear(){
        return this.year;
    }

    public String getColour(){
        return this.colour;
    }
}
```

Enter the above class in JShell, and then try it out by entering the following lines of code:

```java
Bike b = new Bike("Raleigh", 1990, "Red");

b.make; // ERROR: Can't access a private field directly

b.getMake(); // SUCCESS: "Raleigh"

b.make = "Not Raleigh"; // ERROR: Can't assign to a private field
```
## Setters

```java
public class Bike {
    
    private String make;
    private int year;	
    private String colour;

    public Bike(String make, int year, String colour){		
        this.make = make;
        this.year = year;
        this.colour = colour;
    }

    public String getMake(){
        return this.make;
    }

    public int getYear(){
        return this.year;
    }

    public String getColour(){
        return this.colour;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
}
```

We can test this code out too:

```java
var b = new Bike("Raleigh", 1990, "Red");
b.setColour("Blue");   // SUCCESS
b.colour;              // ERROR: Can't access a private field directly
b.getColour();         // SUCCESS
```


```java
private int year;

public void setYear(int year){
    this.year = year;
    }
```
Since the outer scope (the class) contains the inner scope (the method), inside the method there are technically TWO identically-named variables.

This is why we distinguish them using the `this` keyword. Without the keyword, Java assumes you're referring to the method parameter, because that variable is "more local" than the class field.


```java
var raleigh = new Bike("Raleigh", 1990, "Red");

raleigh.setColour("Blue");
```

In this snippet, `raleigh` is an **instance** of the **class** `Bike`. The method `setColour` is an **instance method** because it acts on that specific instance of the class. (Contrast this with an imaginary method which changes the colour of ALL bikes when we call it - that would NOT be an instance method because it operates on the entire class, not on a specific instance.)


# 3. Branching and Conditional Logic

```java
int sum = 10;
if (sum < 0) {
    System.out.println("Sum is negative");
} else {
    System.out.println("Sum is positive");
}    
```

|Data Type|Description|Example|
|---|---|---|
|`int`|Integer numbers|`42`|
|`float`|Single-precision floating-point numbers|`2.71f`|
|`double`|Double-precision floating-point numbers|`3.14`|
|`char`|Single characters|`'A'`|
|`String`|Multiple characters|`"I like bananas"`|
|`boolean`|Can be either true or false|`true`|

```java
boolean isRainy = true;

if (isRainy) {
    System.out.println("It's a rainy day!");
} else {
    System.out.println("It's not rainy today.");
}
```

```java
// We haven't defined the getCurrentRainAmount function, so this code won't work in JShell.
// But we can imagine that it exists elsewhere in our program.
int amountOfRain = getCurrentRainAmount("Manchester");
boolean isRainy = amountOfRain > 0;

if (isRainy) {
    System.out.println("It's a normal day in Manchester!");
} else {
    System.out.println("It's not rainy today. Are you sure you're in Manchester?");
}
```

```java
int a = 5;
int b = 7;

if (a == b) {
    System.out.println("a is equal to b");
} else {
    System.out.println("a is not equal to b");
}
```

```java
int x = 10;
int y = 15;

if (x != y) {
    System.out.println("x is not equal to y");
} else {
    System.out.println("x is equal to y");
}
```

```java
double num1 = 8.5;
double num2 = 6.2;

if (num1 > num2) {
    System.out.println("num1 is greater than num2");
} else {
    System.out.println("num1 is not greater than num2");
}

int p = 15;
int q = 15;

if (p >= q) {
    System.out.println("p is greater than or equal to q");
} else {
    System.out.println("p is less than q");
}
```

```java
boolean isInteger = a instanceof Integer;
boolean isPositive = a >= 0;

boolean isPositiveInteger = isInteger && isPositive;

// NB: we could just write this in one go rather than assigning the extra booleans:
boolean isPositiveInteger2 = a instanceof Integer && a >= 0;
```

`instanceof` is an operator which checks if a value is an **instance** of a particular `class`. In this case, we're checking if `a` is an `Integer`, which is a wrapper class for the primitive type `int`.

```java
boolean isPositiveInteger = a instanceof Integer || a >= 0;
```

```java
boolean isSunny = true;

if (!isSunny) {
    System.out.println("Welcome to Manchester.");
} else {
    System.out.println("Enjoy your trip.");
}
```

```java
boolean personLikesBananas = person.likes("Banana");
boolean bananasInStock = stock.getCount("Banana") > 0;

if (personLikesBananas && bananasInStock) {
        System.out.println("It's your lucky day!");
} else if (personLikesBananas && !bananasInStock) {
        System.out.println("Bad news - there's no bananas!");
} else {
        System.out.println("We have no bananas, but luckily you don't care!");
}
```

```java
int dayOfWeek = 3;

switch (dayOfWeek) {
        case 1:
                System.out.println("It's Monday!");
                break;
        case 2:
                System.out.println("It's Tuesday!");
                break;
        case 3:
                System.out.println("It's Wednesday!");
                break;
        case 4:
                System.out.println("It's Thursday!");
                break;
        case 5:
                System.out.println("It's Friday!");
                break;
        case 6:
                System.out.println("It's Saturday!");
                break;
        case 7:
                System.out.println("It's Sunday!");
                break;
        default:
                System.out.println("Invalid day of the week!");
}
```

```java
String location;
boolean isInManchester = true;

// We could just write if (isInManchester) here - the "== true" is implied
if (isInManchester == true) {
  location = "Manchester";
} else {
    location = "The World";
}
```

```java
String location = isInManchester ? "Manchester" : "The World";
```
[NEW_VARIABLE] = [CONDITION] ? [TRUE_VALUE] : [FALSE_VALUE]

# 4. Arrays

```java
DataType[] arrayName; // where data type can be any class

// e.g.
int[] numbers = new int[5];
```

```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

System.out.println(numbers[2]); // 30
```

```java
// Note this syntax allows assigning values to an array WHILE initialising it
// This saves us assigning every element separately after declaring the array.
char[] letters = {'A', 'B', 'C', 'D', 'E'};

System.out.println(letters[0]); // 'A'
System.out.println(letters[1]); // 'B'
```

```java
String[] items = {"apple", "banana", "strawberry"};
System.out.println(items.length); // prints `3`
```

## Clone

The `clone` method creates a shallow copy of the array. Enter the following code into JShell:

```java
int[] originalArray = {1, 2, 3, 4, 5};
int[] newArray = originalArray.clone();

System.out.println(newArray[2]); // 3

newArray[2] = 999;

System.out.println(newArray[2]); // 999
System.out.println(originalArray[2]); // still 3
```

The `copyOf` method copies the specified length of the array into a new array, starting from index `0`. Enter this code in JShell:

```java
int[] originalArray = {1, 2, 3, 4, 5};
// notice the Arrays helper class:
int[] newArray = Arrays.copyOf(originalArray, 3); // Copy first 3 elements
```

The `copyOfRange` method copies the specified range of the array into a new array, starting from and ending at indexes you specify. Enter this code in JShell:

```java
int[] originalArray = {1, 2, 3, 4, 5};
int[] newArray = Arrays.copyOfRange(originalArray, 1, 3); // Copies from indexes 1 to 2
```

```java
int[] newArray = Arrays.copyOfRange(originalArray, 1, originalArray.length); // Copies from indexes 1 to the end
```

## toString

```java
int[] numbers = {1, 2, 3, 4, 5};
String numbersAsString = Arrays.toString(numbers);
System.out.println(numbersAsString);
```
## Sort

The `.sort()` method sorts the elements of an array in ascending order.

```java
int[] array = {5, 2, 8, 1, 3};
Arrays.sort(array);
System.out.println(Arrays.toString(array));
```
# Lists

```java
import java.util.ArrayList;
```

Declare
```java
ArrayList<String> myList = new ArrayList<>();
```

Add
```java
ArrayList<String> myList = new ArrayList<>();
myList.add("Element 1");
myList.add("Element 2");
myList.add("Element 3");
```

Access
```java
ArrayList<String> myList = new ArrayList<>();
myList.add("Element 1");
myList.add("Element 2");
myList.add("Element 3");

// Here we get the item at index 1:
String element = myList.get(1);
```

Remove
```java
myList.remove(1); // Remove by index

// use .toString() to easily view the list contents
System.out.println(myList.toString())

myList.remove("Element 3"); // Remove by value
System.out.println(myList.toString())
```

Replace
```java
System.out.println(myList.toString());

myList.set(0, "Replaced the first one!"); 

System.out.println(myList.toString());
```


```java
var person = people.get(0);
person.setName("New name");
```
vs
```java
people.set(0, new Person("Totally new person object"));
```


```java
// Array must be intialised with a fixed size
String[] array = new String[3];

// We can use add/remove to alter this list flexibly
ArrayList<String> list = new ArrayList<>();
```

```java
var immutableList = Arrays.asList("One", "Two", "Three");

immutableList.add("Four");
```

```java
String[] numbers = { "One", "Two", "Three"};

var immutableList = Arrays.asList(numbers);

ArrayList<String> myList = new ArrayList<String>(immutableList);

System.out.println(myList.toString());

myList.add("Four"); // no error!

System.out.println(myList.toString()); // Includes four
```

## Contains

```java
boolean containsWorld = myList.contains("World"); 
```

## Size

Just like the `length` property on arrays, the `size` method returns the number of elements in a list.

```java
int size = myList.size();
```

## Clear

```java
var immutableList = Arrays.asList("One", "Two", "Three");

ArrayList<String> myList = new ArrayList<>(immutableList);

System.out.println(myList.toString());

myList.clear();
System.out.println(myList.toString());
```

## IndexOf

Sometimes we want to find the index of the first occurrence of a specified element.

```java
int index = myList.indexOf("World");
```

# 5. For Loops

```java
String[] names = {"Harry", "Sally", "Bob"};

for(int i = 0; i < names.length; i++){
  System.out.println(names[i]);
}
```

## While Syntax

```java
int i = 1;      

while (i <= 5) {
        System.out.println("While loop: " + i);
        i++;
}
```

While do

```java
while (someCondition) {
    // Code to repeat here
    // This will NOT execute if someCondition starts out `false`
}

do {
    // Code to repeat here
    // This WILL execute ONCE if someCondition starts out `false`
} while (someCondition)
```

Commonly, we'll reach for `while` loops when we need to execute a block of code an **unknown** number of times. For example:

```java

// imaginary function that gets a command from the user
String userInput = requestUserInput(); 

// for readability, let's store the loop condition in a variable
boolean isExit = userInput.equalsIgnoreCase("exit");

while(!isExit){
    
    // process the command
    processUserCommand(userInput);
    
    // get the next command
    userInput = requestUserInput(); 

    // update the condition
    isExit = userInput.equalsIgnoreCase("exit");
            
}
```

```java
while (true) {
        
    String userInput = requestUserInput(); 

    if(userInput.equalsIgnoreCase("exit")){
        break; // this ends the loop
    };

    processUserCommand(userInput);
            
}
```

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length; i++) {
  System.out.println(numbers[i]);
}
```

Enhanced loop

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
    System.out.println(number);
}
```

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int banana : numbers) {
    System.out.println(banana);
}
```

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
List<Integer> evenNumbers = new ArrayList<>();

for (int x : numbers) {
        if (x % 2 == 0) {
                evenNumbers.add(x);
        }
}

System.out.println(evenNumbers);
```


# 6. Java Files and Projects

Create file.java -> javac file //in the terminal to compile to bytecode (name of file must be same name as the class in the java code) -> java file //to run the code

# Static Keyword

```java
public class Person {
    
        // Instance variables - these values differ for each `Person`
    String name;
    int age;

    // Static variable - this exists on the class itself, not on a particular `Person` instance
    static int totalPeople = 0;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        // Increment each time a new Person instance is created
        totalPeople++;
    }
  
    // Static getter method to return a static private member
    public static int getTotalPeople() {
        return totalPeople;
    }

        /* rest of class goes here*/
}
```

Recall that to access an instance member, we must first create the instance and then access the member:
```terminal
Person keith = new Person("Keith", 45);
System.out.println(keith.getName());
```

In contrast, to access a `static` member we don't require an instance. Static members exist on the `class` itself. In this case, the class is `Person` so we use `Person.whatever` to access a static method or member:
```java
System.out.println(Person.getTotalPeople());
```


```java
public class Greet {
    
    public static void displayGreeting() {
        System.out.println("Greetings!");
    }
}
```
If this method was non-static, i.e. an instance method, then we'd have to first instantiate a greet object and THEN call the method:
```terminal
Greet greeter = new Greet();
greeter.displayGreetings();
```
With our static version, we can simply call the method directly without creating an instance:
```java
Greet.displayGreetings();
```

# Entry Points

One of the method declarations we included in `HelloWorld.java` is special. It's known as an **entry point**, and it looks like this:

```java
public static void main(String[] args){

}
```
`args`, for "arguments"

The `main` method is where the JVM (Java Virtual Machine) begins execution for a particular program. (You may have wondered earlier how our `HelloWorld`/`Greet` program knew where to start - why did it display "Hello, World!" before "Greetings!" - this is why.) When you run a Java application, the JVM looks for the `main` method with the above specified signature and starts executing the code inside it.

If we add more than one `main` method to a program, then the compiler will not know which we intend to be the **entry point**. Since a program can only start in one place (it doesn't make sense to start in more than one place at once!), this will cause a compilation error, and the program will not compile.

As a result, **each program should have one** `main` **method**.

# Command Line Arguments

```java
// HelloWorld.java

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        if (args.length != 1) {            
            throw new IllegalArgumentException("Exactly one command line argument is required.");
        }

        Greet.displayGreeting(args[0]);
    }
}
```

```java
// Greet.java

public class Greet {
   public static void displayGreeting(String name) {
        System.out.println("Greetings " + name + "!");
    }
}
```

We use the keyword `throw` to indicate that an exception has occurred.There are a large number of built-in exceptions in Java, and we can even define our own if required.

In this case, the most appropriate exception is the `IllegalArgumentException`. This is for when a program is given incorrect arguments. We want the end user to be forced to supply a name, so we throw an `IllegalArgumentException`.

As developers, it's an important part of our job to handle exceptional situations in our program. If possible, we want the program to recover and to get itself into a correct state again. One way we could do that in this case would be to provide a **default name** instead of throwing an exception. This means that if a user executes our program without providing a command line argument, we could instead display something like "Greetings, user!"

However, if it doesn't make sense to provide a default name - imagine the business requirements are that we MUST refer to them by their name, and we can't say "user" - then it makes sense to throw an exception. There is no way for the program to sensibly handle this situation - we require the user to enter their name via the command line argument.

# Interfaces

```java
public interface Animal {
    void makeSound();
    void move();
}

public class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void move() {
        System.out.println("Running on four legs.");
    }
}
```

```java
// Define the tyre interface
public interface Tyre {
    void roll();
}

// A specific class which implements this interface in its own way
public class MichelinTyre implements Tyre {
    @Override
    public void roll() {
        System.out.println("Michelin tyre is rolling smoothly.");
    }
}

// Another class which implements this interface in a different way
public class BridgestoneTyre implements Tyre {
    @Override
    public void roll() {
        System.out.println("Bridgestone tyre is rolling smoothly.");
    }
}

public class Car {
    // this interface member can hold any class that implements the Tyre interface
        private Tyre tyre; 

    public Car(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive() {
        System.out.println("Car is moving...");
        
                // this will call the roll method on EITHER 
                // the Michelin or Bridgestone class
                // depending on which one was passed in
        tyre.roll();
    }

    public void changeTyre(Tyre newTyre) {
        System.out.println("Changing tyre...");
        this.tyre = newTyre;
    }
}
```

# HashMaps

```java
// for an actual dictionary, we'd map a String (the word) to a string (the definition)
HashMap<String, String> dictionary = new HashMap<>();

// to track student scores, we'd map a String (the student name or ID) to an Integer (their score)
HashMap<String, Integer> studentScores = new HashMap<>();
```

```java
import java.util.HashMap;

public class HashMapExample {
    
        public static void main(String[] args) {
                    
        HashMap<String, Integer> fruitRatings = new HashMap<>();

        // Adding key-value pairs
        fruitRatings.put("apple", 10);
        fruitRatings.put("banana", 5);
        fruitRatings.put("orange", 8);

        // Accessing values using keys
        int appleCount = fruitRatings.get("apple");
        System.out.println("Number of apples: " + appleCount);
    }
```

```java
import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language. Java is used for web development and more.";

        String[] words = text.split("\\s+"); // Split the text into separate words

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Count word frequency
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitivity
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
```

# Shallow vs deep copies

```java
int[] originalArray = {1, 2, 3, 4, 5};
int[] newArray = originalArray.clone();

System.out.println(newArray[2]); // 3

newArray[2] = 999;

System.out.println(newArray[2]); // 999
System.out.println(originalArray[2]); // still 3
```

In the phrase "shallow or deep copy", **shallow or deep** refers to whether or not every element of the array is individually cloned, or if only the array is cloned.

This brings us to the first rule of shallow and deep copies in Java: **For primitive types, there's no distinction between shallow and deep copying**.

In Java, there's an important distinction between **value types** (like primitives such as `int` or `String`) and **reference types** (like a `Person` class you might define).

```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

        public void setName(String name){
            this.name = name;
        }
}

Person[] originalArray = {new Person("Alice"), new Person("Bob")};

// Shallow copy using .clone()
Person[] shallowCopy = originalArray.clone();

// Deep copy (clone each object in the array as well as the array itself)
Person[] deepCopy = new Person[originalArray.length];
for (int i = 0; i < originalArray.length; i++) {
        deepCopy[i] = new Person(originalArray[i].getName());
}

// Modify an object inside the original array
originalArray[0].setName("Charlie");

// Output
System.out.println("Original Array: " + originalArray[0].getName() + ", " + originalArray[1].getName());
System.out.println("Shallow Copy: " + shallowCopy[0].getName() + ", " + shallowCopy[1].getName());
System.out.println("Deep Copy: " + deepCopy[0].getName() + ", " + deepCopy[1].getName());
```
you can see that the when we modify the shallow copy, the original is also modified.

That's because in memory the variables `originalArray[0]` and `shallowCopy[0]` both contain an address - or **reference** to a `User` object. When the array was cloned, the reference was also cloned - but the underlying object was not.

To understand this, imagine you're giving out places to live to a queue of people. You could just copy the same address down on multiple pieces of paper... but every person you give the address to is going to end up at the same house. To actually give everybody a place to live, you first need to clone the _house_, and then store the new addresses on fresh pieces of paper.

So when we look up `originalArray[0]` in memory, we see an address to a `User` object. When we look up `shallowCopy[0]` in memory we see an address to the SAME user object. This is why modifying one object modifies the other - they're fundamentally the same object.

Reference types store addresses in their associated variables, rather than the objects themselves. These addresses point to the actual object.

In contrast, the deep cloned array is made up of completely new objects. Modifying one doesn't affect the others. `deepCopy[0]` has a reference to a wholly separate `User` object.



Random comments:

-With an ArrayList (as opposed to an array) you have to use `someArrayList.get(0)` . `someArray[0]` is the correct syntax for arrays

-Person currentPerson = input.get(i); System.out.println(currentPerson.name); System.out.println(currentPerson.isDentist);

-String class doesn't have a `length` property, you need to call `length()` method

-if it's an array with multiple elements try String[] variableName =

-To split a string on a period (`.`), use `str.split("\\.")`.

-The Equality Operator `==` is used to compare primitive data types such as boolean, byte, char, short, int, long, float and double. Strings are not value objects. The String `equals()` method is used to compare two String objects and it specifically checks if the content is exactly equal.

-In order to get the index of each char use the inbuilt method charAt(x) instead of get(i).

-when appending a Character to a String you cannot use (add), try just using +=.

-add adds them as separate characters, += will add the characters and form a word

-length, length(), size, size(), unclear which one in which situation

-in order to simply check whether the string only contains ALPHABETS use the following code:

```java
if (text.matches("[a-zA-Z]+")){
   // your operations
}
```

In order to simply check whether the string only contains NUMBER use the following code:

```java
if (text.matches("[0-9]+")){
   // your operations
}
```

-.contains for specific elements

-you can't use for loop to iterate through a single int number, it's one element, it won't go through the number's digits separately.

-n%10 means **modulus of 10** . This is used to get last digit. 12345 % 10 means remainder when 12345 is divided by 10 , which gives you 5 . Thereafter when you perform (n/10) you get 1234 (all the numbers except the least significant digit that you got in previous step).

-if performs the code once, while performs it as long as it's true

-Since `char` is a primitive you can compare it using the `==` operator. In the former code you were comparing a `String` using `==`, since a `String` is an `Object` the code is checking to see if they are the same `Object` not if they have the same value as the `String.equals()` method would.

-input[i] and .length is only for Array. For arraylist use get(i) and .size(). For string it's .length().

-HashMap methods: .put, .get, containsKey, containsValue, replace, putIfAbsent, remove, .getOrDefault(variable, 0) + 1;

-loops are only for lists, arrays, collections

-instantiate a new string: String currentString = new String("x");
-instantiate a new object: EnglishStudent current student = new EnglishStudent(name, age, location);

-writing a class with the values from another/"changing" variable names: EnglishStudent currentStudent = new EnglishStudent(input.prénom, input.age, input.location);

-To use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class documentation. In our example, we will use the `nextLine()` method, which is used to read Strings:

-double firstNumber = getNumberInput(new String(“Enter first number”));

double secondNumber = getNumberInput(new String(“Enter second number”));

Asta e echivalentul a:

String firstMessage = new String(“Enter first message”);
double firstNumber = getNumberInput(firstMessage);

String secondMessage = new String(“Enter second message”);
double secondNumber = getNumberInput(secondMessage);

-**Reopening of `Scanner` object**: You should not close the `Scanner` object after each input because once it's closed, it cannot be reopened. Instead, use a single `Scanner` object throughout the program.

-elements must not be out of scope, scanner should be added as a parameter for other methods if used in main method.

-