## Reading

zyBooks Ch 2.1 - 2.4


### Interfaces

The "IS-A" relationship occurs often and is modeled in OOP with the use inheritance, about which you learned in Java 1.
Interfaces in Java are a form of inheritance.  
An interface declares a set of method signatures without implementation  or instance variables. Therefore, an interface defines the behavior but not the state of an object.
Reminder: States are attributes, such as "name", "age", "major". Behaviors are actions, such as "register", "payTuition", "graduate."
The concrete class implementing an interface is responsible for implementing the interface methods.
When a class implements an interface, it "writes a contract" that it will implement the methods of the interfaces.
For example, every shape has an area and perimeter, however the formulas vary.
By implementing the Shape interface, the classes state the they have a "contract" with, or are "certified" as a Shape.

### Generics

Classes may differ by type but be otherwise very similar. In such cases generic classes may be used. 
A generic class has a special Type parameter. A Type is a class must always be an object.

A generic class has the following general format:

```
class name<T1, T2, ..., Tn> { /* ... */ }
```

```
ArrayList<String> a = new ArrayList<String>();
a.add(Integer()); // error
```


Example:

Result:

```
Area : 95.03317777109123
Perimeter: 34.55751918948772
Area : 0.0
Perimeter: 6.0
Area : 172.03361371057707
Perimeter: 46.49557127312894 
```

## Reference
https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html

https://docs.oracle.com/javase/tutorial/java/generics/types.html

## Practice
zyBooks Ch 2.1 - 2.4 Participation Activities

## Learning Outcomes
Upon successful completion of the material, students will be able to:

* Identify common relationship patterns 
* Distinguish between State and Behavior
* Model IS-A inheritance relationships with a new "tool:" Interfaces
* Work with the Java Collections Comparable interface
* Define and work with generic methods and classes
