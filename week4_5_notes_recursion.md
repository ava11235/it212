### Recursion

"To understand recursion, you must first understand recursion." 

## Reading

zyBooks Ch 4.1 - 4.9

Recursion can be defined as an operation in terms of itself.
To solve problems recursively, we break down the problem into smaller occurrences of the same problem.

Recursive programming refers to the writing of methods that call themselves to solve problems recursively.

Recursion is well suited for solving certain types of problems and can be used as a solution to iterative problems (loops).
Some problems can, in fact, be solved better with recursion. The solutions are more simple and elegant. 

An recursive algorithm involves at least 2 cases:

Base case: A simple occurrence that can be answered directly.

Recursive case: A more complex occurrence of the problem that cannot be directly answered, but can instead be described in terms of smaller occurrences of the same problem.

It is possible to have more than one base or recursive case, but all  recursive problems must have at least one of each.
One of the challenges of  recursive programming is correctly identifying these cases.

## Reference

https://www.geeksforgeeks.org/recursion-in-java/

## Practice
zyBooks Ch 4.1 - 4.9 Participation Activities

### Examples

```
//Factorial loop
  int i,fact=1;  
	int number=5;//It is the number to calculate factorial    
	for(i=1;i<=number;i++){    
	     fact=fact*i;    
	 }    
	System.out.println("Factorial of "+ number +" is: "+fact); 
    
     
//Factorial: recursive solution
 static int factorial(int n){   
 
  if (n == 0)    //base case
    return 1;    
  else    //recursive case
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+ number +" is: "+fact);    
 }  
 
 //Recursive directories search
 public class SearchDirsFiles {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Directory or File name? ");
		String name = console.nextLine();
		File f = new File(name);
		if(!f.exists()) {
			System.out.println("No such file or dir found");
		} else {
			print(f, 0);
		}

	}
	
	public static void print(File f, int level) {
		for(int i = 0; i < level; i++) {
			System.out.print("    ");
		}
		System.out.println(f.getName());
		if(f.isDirectory()) {
			for (File subF : f.listFiles()) {
				print(subF, level + 1);
			}
		}
	}

}
```


    
    
## Learning Outcomes
Upon successful completion of the material, students will be able to:
*  Identify problems best solved with recursion. 
*  Identify base and recursive cases of such problems.
*  Implement recursive algorithms in Java.
*  Implement binary search recursively.
*  Apply best practices to debugging recursive code.
*  Implement well known recursive methods such as Fibonacci sequence,  GCD and factorial.
*  Implement recursive probabilities exploration.
*  Understand common memory problems associated with the use of recursion, such as stack overflow. 
