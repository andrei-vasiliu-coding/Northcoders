psvm = public static void main //shortcut
sout = System.out.println() //shortcut

class = recipe (a blueprint, like instructions)
object = specific recipe, an instance of a class
methods= behaviours/functions inside a class

methods are functions that belong to an object, and have access to that object’s properties.

right click to select shortcut for making constructors, getters etc.

to instantiate remember = new X;

![[Pasted image 20240716144014.png]]

![[Pasted image 20240716144416.png]]
book.turnPage();
System.out.println(book.getPageContent());

each current object created with "new" keyword has its own "this" scope

#### Step 1

- Open IntelliJ and create a new project called `Java Basics` in the `intro-week` folder within the `northcoders` directory you created.
    
- Make sure that `Java` is selected as the language, `Maven` as the build system and your `JDK` is `openjdk-21`
    
- Hit 'Create'
    

#### Step 2

- Navigate through the `src` folder to get to the `Java` folder.
    

Depending on your settings, it's possible that IntelliJ created the `Main` class already, including the `main()` method. If so, just ignore the below instructions and move on to the next task!

- Create a new class here by right-clicking and selecting `New > Java Class`. Give this the name `Main`.
    
- Within the curly braces you need to create a `main` method, which will be the **entry-point** to this application, allowing us to execute the code we write.
    
- Within the curly braces, type `psvm`, which is the shortcut for creating the main method, and hit `enter`
    
- Now the code for the first few tasks will be written within this `main()` method.


Extend function to create subclass
![[Pasted image 20240716164427.png]]

![[Pasted image 20240716164552.png]]

create new Enum (Java class) tab type
![[Pasted image 20240716165117.png]]

now in the class you say Enum (as the type) and variable name

![[Pasted image 20240716165225.png]]

![[Pasted image 20240716165750.png]]

Strings
![[Pasted image 20240717085329.png]]
String x = "sock" is not the same as String x = new String("Sock"), an equality operator == will say false. They are stored as different elements in the String pool. However, String x = "sock" is the same as String y = "sock", the == will give true. It is because this checks if the reference is the same. To check if the value is the same, use .equals(). Unless there is a very specific reason to use new String, don't use it.

System.identityHashCode(variable) to check the code for its location in memory(it's not the actual address in the memory, but an identifier)

.concat() to combine multiple string variables into one variable
variable.concat(x).concat(y)
it's better than variable + x + y because it does not allow for null values

if you want to combine strings and ints in the same string, use variable.format()

.substring(number) to split and start from that index number in the string. .substring(number, number) indexes for start and finish

expect "up to but not including" with all functions

to check == *chararcter* you need to put the character between single quotation marks '' not ""

![[Pasted image 20240718085207.png]]

![[Pasted image 20240718091625.png]]

%d is for i, %s is for friends[i], %n is for new line underneath

![[Pasted image 20240718092725.png]]

![[Pasted image 20240718093351.png]]


"final" type when you want to write a constant variable (immutable, unchangeable etc.)

Debugging shortcuts:
Step Into:  f7  
Step Over: f8  
Step Out: shift f8  
Resume execution: f9


To go back to the beginning and loop again, use % operator index % input.size()

