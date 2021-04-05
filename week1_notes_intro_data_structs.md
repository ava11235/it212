## Reading

Review the syllabus and post any questions on the Q&A forum

zyBooks Ch 1.1 - 1.6

### Data Structures

Data structures, such as an array, a linked list, or a binary tree, are used to organize data.
There are operations associated with data structures such as accessing or inserting or removing data.

### Algorithms 
An algorithm is a sequence of steps used to perform a calculation. 
Specifi algorithms have been developed to address computational problems in various domains such as biologoy or e-commerce.
NP-complete are problems for which it is not known if an efficient algorithms exists. An example of NP-complete problem is the Cliques problem. 


### Big O Notation

Big O Notation, or efficiency,  is used to classify algorithms based on how resources (space and time )requirements grow depending on the size of the input.

To determine an alogoritmn’s Big O notation, we need to make a fes assumptions:

* Every statement is considered to take the same amount of time to run
* To measure the run time of a method, we add up the sum of the statements that belong to this method.
* To measure the Big O a loop, multiply the number of statements in the loop times how many times the loop runs.
* To measure the Big O of a nested loop, we multiply the number o

Assume the following: 

* Any single Java statement takes the same amount of time to run.
* A method call's runtime is measured by the total of the statements inside the method's body.
* A loop's runtime, if the loop repeats N times, is N times the runtime of the statements in its body.
* The Big O complexity of a nested loop is  O(N^2)
* The highest order term determines the Big O. For example, if we have
* N^2 + 5N + 35, the Big O complexity would be N^2 (we are only concerned with the highest order term. 
* Divide and conquer approach algorithm such as binary search have a complexity of O(Log 2 N)
 
How Big O is affected based on  changes on doubling the value of N:
Big O Complexity Classes: 

* O(1) constant. Time not dependent on N
* O(log2 N) logarithmic Time increase in a logarithmic fashion (not much)
* O(N) linear Time increases linearly as N increases
* O(N2) quadratic Time quadruples as N doubles  as N doubles
* O(N3) cubic Time multiplied by 8
* O(2N) exponential  time increases greatly


## Reference
https://www.bigocheatsheet.com/


## Practice
zyBooks Ch 1.1 - 1.6 Participation Activities

## Learning Outcomes
Upon successful completion of the material, students wll be able to:
* Identify basic data structures and choose the appropriate data structures depending on data types and operations performed.
* Describe what an algorithm and a computational problem is.
* Find the best algorithms for solving common computational problems.
* Define what NP-complete problems are.
* Describe common operations used with data structures such as inserting, removing or searching for data.
* Work with common Abstract Data Types(ADTs) without knowing implementation details.
* Be familiar with algorithm efficiency, runtime complexity and best and worst cases.
