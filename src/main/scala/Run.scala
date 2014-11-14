package de.scala_bs


object Run extends App {
  import problems._
  
  // Problem 1
  // Find the last element of a list.
  // scala> last(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 8
  println("\n1. Find the last element of a list.")
  println(last(List(1, 1, 2, 3, 5, 8))) // 8
  
  
  // Problem 2
  // Find the last but one element of a list.
  // scala> penultimate(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 5
  println("\n2. Find the last but one element of a list.")
  println(penultimate(List(1, 1, 2, 3, 5, 8))) // 
  
  
  // Problem 3
  // Find the Kth element of a list.
  // scala> nth(2, List(1, 1, 2, 3, 5, 8))
  // res0: Int = 2
  println("\n3. Find the Kth element of a list.")
  println(nth(2, List(1, 1, 2, 3, 5, 8)))
  
  
  // Problem 4
  // Find the number of elements of a list.
  // scala> length(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 6
  println("\n4. Find the number of elements of a list.")
  println(length(List(1, 1, 2, 3, 5, 8)))
  
  
  // Problem 5
  // Reverse a list.
  // scala> reverse(List(1, 1, 2, 3, 5, 8))
  // res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  println("\n5. Reverse a list.")
  println(reverse(List(1, 1, 2, 3, 5, 8)))
  
  
  // Problem 6
  // Find out whether a list is a palindrome.
  // scala> isPalindrome(List(1, 2, 3, 2, 1))
  // res0: Boolean = true
  println("\n6. Find out whether a list is a palindrome.")
  println(isPalindrome(List(1, 2, 3, 2, 1)))
  
  
  // Problem 7
  // Flatten a nested list structure.
  // scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  // res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  println("\n7. Flatten a nested list structure.")
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  
  
  // Problem 8
  // Eliminate consecutive duplicates of list elements.
  // scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  println("\n8. Eliminate consecutive duplicates of list elements.")
  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  
  
  // Problem 9
  // Pack consecutive duplicates of list elements into sublists.
  // scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  println("\n9. Pack consecutive duplicates of list elements into sublists.")
  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  
  // Problem 10
  // Run-length encoding of a list.
  // scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  println("\n10. Run-length encoding of a list.")
  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  
}