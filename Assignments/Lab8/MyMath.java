/**
 * The MyMath Interface
 * Download the MyMath interface from the course web page (under the lecture notes) and use it as a part of your program
 * You may not alter the interface in any way.
 * You will create two classes, MyFraction and MySet. 
 * Each of these classes must implement the above interface. 
 * When you implement the interface you must use the correct "generic" for the class which implements the interface: 
 * implements MyMath<MyFraction> for the MyFraction class 
 * implements MyMath<MySet> for the MySet class
 */

package Homework1.Lab8;

public interface MyMath<T> {
	
	public T add(T o);
	
	public T subtract(T o);
	
	public T divide(T o);
	
	public T multiply(T o);
	
}