1. Problem Set 4
   Pair, Append, Replace
   Implement the classes Pair, Append and Replace according to the specifications below.
   Problem 4.1
   In the file Pair.java, implement a class Pair<E> that stores an ordered pair of 
2. elements of type E. Provide accessors that return the first and second elements.
   Also, provide a method containedIn that, given an element of type E, returns true 
3. or false depending on whether or not the given element is equal to one contained 
4. in the pair, where equality is determined using the method equals().
   See the API documentation for information on this method, for example, here.
   It is suggested that you test your class using Strings and any other classes that 
5. you would like.
   Problem 4.2
   In a file called Append.java, implement a generic method append that receives two
6. ArrayLists, and appends all elements from the first array list (holding elements of 
7. some type E) to the second (holding elements of the same type E).
   Problem 4.3
   In a file called Replace.java, write a generic method replace, using a generic type 
8. parameter <T>, that replaces every element in an ArrayList<T> that is equal to a 
9. specified item, with a specified replacement item.
   The method should have three parameters: the list and the two items; each of the 
10. items should be of type T.