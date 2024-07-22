"Lists" chapter:

```java
// EXAMPLE INPUT & RESULT
ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 8));

ArrayList<Integer> result = new ArrayList<>(listOne);
result.retainAll(listTwo);

// result should contain ONLY the number 3 for this input
```

// Why does <int> not work? Must write <Integer> //

```java
 ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
 ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 8));
 
ArrayList<Integer> result = new ArrayList<>(listOne);
result.addAll(listTwo);
Collections.sort(result);

System.out.println(result);
```

```java
 ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
 ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 8));
 
ArrayList<Integer> result = new ArrayList<>(listOne);
result.removeAll(listTwo);
result.addAll(listTwo);
Collections.sort(result);

System.out.println(result);
```


Iteration" chapter

1.

void printEvenOrOdd(int number) {
	   if (number % 2 == 0) {
		   System.out.println("Even");
	   }
	   if (number % 2 == 1) {
		   System.out.println("Odd");
	   }
   }


2.

void printVowelOrConsonant(String letter) {
        if (letter == "A" || letter == "a" || letter == "E" || letter == "e" || letter == "I" || letter == "i" || letter == "O" || letter == "o" || letter == "U" || letter == "u") {
            System.out.println("Vowel");
        } else if (letter == "!") {
            System.out.println("Not a letter!");
        } else { 
	        System.out.println("Consonant");
	    }
   }


3.

void sumOfNumbers(int number){
   ...>     int sum = 0;
   ...>     for (int i = 0; i <= number; i++) {
   ...>         sum += i;
   ...>     }
   ...>     System.out.println(sum);
   ...> }


