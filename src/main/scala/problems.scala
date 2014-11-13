package de.scala_bs


import scala.annotation.tailrec


package object problems {
  
  // Problem 1
  // Find the last element of a list.
  // last(List(1, 1, 2, 3, 5, 8))
  
  
  // Problem 2
  // Find the last but one element of a list.
  // penultimate(List(1, 1, 2, 3, 5, 8))
  
  
  // Problem 3
  // Find the Kth element of a list.
  // scala> nth(2, List(1, 1, 2, 3, 5, 8))
  // res0: Int = 2
  
  
  // Problem 4
  // Find the number of elements of a list.
  // scala> length(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 6
  
  
  // Problem 5
  // Reverse a list.
  // scala> reverse(List(1, 1, 2, 3, 5, 8))
  // res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  
  
  // Problem 6
  // Find out whether a list is a palindrome.
  // scala> isPalindrome(List(1, 2, 3, 2, 1))
  // res0: Boolean = true
  
  
  // Problem 7
  // Flatten a nested list structure.
  // scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  // res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  
  
  // Problem 8
  // Eliminate consecutive duplicates of list elements.
  // scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  
  
  // Problem 9
  // Pack consecutive duplicates of list elements into sublists.
  // scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  
  
  // Problem 10
  // Run-length encoding of a list.
  // scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  
  
}

