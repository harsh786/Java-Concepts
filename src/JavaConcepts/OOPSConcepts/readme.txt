https://www.javatpoint.com/instance-initializer-block



We can override the virtual function with the inheriting class function using the same function name. Generally, the virtual function is defined in the parent class and override it in the inherited class.
The virtual function is supposed to be defined in the derived class. We can call it by referring to the derived class's object using the reference or pointer of the base class.
A virtual function should have the same name and parameters in the base and derived class.
For the virtual function, an IS-A relationship is necessary, which is used to define the class hierarchy in inheritance.
The Virtual function cannot be private, as the private functions cannot be overridden.
A virtual function or method also cannot be final, as the final methods also cannot be overridden.
Static functions are also cannot be overridden; so, a virtual function should not be static.
By default, Every non-static method in Java is a virtual function.
The virtual functions can be used to achieve oops concepts like runtime polymorphism.

The Virtual Function is an ordinary function in Java.
We are not required to declare any explicit description to define the virtual function.
In Java, no virtual keyword is used to define the virtual function.
The Parent class pointer is used to refer to the object of the child class
the virtual function should be defined in the child class with the same name in the parent class.
All the instance methods in Java are considered the Virtual function except final, static, and private methods.