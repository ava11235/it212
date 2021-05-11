### Recursion Review

Write a  method numPow with parameters: integer base and exponent and returns the base raised to that exponent.
Example: numPow(2,3) returns 8

Solution:

``` 
public static int numPow (int base, int exp) {
    // base case. any num to zero power is 1
        
    if (exp == 0) {
        return 1;
     // recursive case:  x^y = x * x^(y-1)
    } else {
         return base * numPow(base, exp - 1);
    }
} 
```

### Recursive Exploration 
Recursion is a good technique for exploring all possibilities
```
#zyBook 4.7.1
import java.util.Scanner;
import java.util.ArrayList;


public class NumScrambler {
   public static void scrambleNums(ArrayList<Integer> remainNums, 
                                   ArrayList<Integer> scramNums) {
      ArrayList<Integer> tmpRemainNums;
      int tmpRemovedNum;
      int i;

      if (remainNums.size() == 0) {
         System.out.print(scramNums.get(0));
         System.out.print(scramNums.get(1));
      //   System.out.println(scramNums.get(2));
      }
      else {
         for (i = 0; i < remainNums.size(); ++i) {
            tmpRemainNums = new ArrayList<Integer>(remainNums); // Make a copy.
            tmpRemovedNum = tmpRemainNums.remove(i);
            scramNums.add(tmpRemovedNum);
            scrambleNums(tmpRemainNums, scramNums);
            scramNums.remove(scramNums.size() - 1);
         }
      }
   }

   public static void main(String[] args) {
   //    Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numsToScramble = new ArrayList<Integer>();
      ArrayList<Integer> resultNums = new ArrayList<Integer>();

      numsToScramble.add(9);
      numsToScramble.add(2);
      numsToScramble.add(4);

      scrambleNums(numsToScramble, resultNums);
   }
}

Output:
924
942
294
249
492
429

```


### Searching and Algorithm Analysis

## Reading

zyBooks Ch 5.1 - 5.9 

Linear search is a search algorithm that finds a value in a list by examining each element from start to end.

An algorithm's runtime is the time it takes the algorithm execute.

Binary search finds the search value in a sorted list by eliminating half of the array from consideration.

Big O Notation, or efficiency,  is used to classify algorithms based on how resources (space and time )requirements grow depending on the size of the input.

To determine an alogoritmn’s Big O notation, we need to make a few assumptions:
Every statement is considered to take the same amount of time to run
To measure the run time of a method, we add up the sum of the statements that belong to this method.
To measure the Big O a loop, multiply the number of statements in the loop times how many times the loop runs.
To measure the Big O of a nested loop, we multiply the number o

Assume the following: 

Any single Java statement takes the same amount of time to run.
A method call's runtime is measured by the total of the statements inside the method's body.
A loop's runtime, if the loop repeats N times, is N times the runtime of the statements in its body.
The Big O complexity of a nested loop is  O(N^2)
The highest order term determines the Big O. For example, if we have
N^2 + 5N + 35, the Big O complexity would be N^2 (we are only concerned with the highest order term. 
Divide and conquer approach algorithm such as binary search have a complexity of O(Log 2 N)
 
How Big O is affected based on  changes on doubling the value of N:
Big O Complexity Classes: 

O(1) constant. Time not dependent on N
O(log2 N) logarithmic Time increase in a logarithmic fashion (not much)
O(N) linear Time increases linearly as N increases
O(N2) quadratic Time quadruples as N doubles  as N doubles
O(N3) cubic Time multiplied by 8
O(2N) exponential  time increases greatly



```
public static void testBigO (ing[] list){

for (int i = 0; i <= list.lenght; i++){
	List[i] = list[i *3];
	list[i]= list[i ^2]
}
}
Answer:
O(N):  2 statements = 2 * N (number of times the loop will run)
```

## Reference

https://www.bigocheatsheet.com/

## Practice
zyBooks Ch 5.1 - 5.9 Participation Activities 

    
## Learning Outcomes
Upon successful completion of the material, students will be able to:
* Apply linear and binary search algorithms and know their efficiencies.
* Determine an algorithm' s runtime.
* Identify constant vs. non-constant time operations in code.
* Determine upper and lower bounds of algorithms.
* Classify algorithms based on their runtime complexity.
* Determine a function's growth rate as it relates to its input.
* Recognize common Big O complexity classes.
* Determine worst-case algorithm analysis based on number of operations for input resulting in longest execution.

