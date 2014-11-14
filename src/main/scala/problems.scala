package de.scala_bs


import scala.annotation.tailrec


package object problems {
  
  // Problem 1
  // Find the last element of a list.
  // last(List(1, 1, 2, 3, 5, 8))
  @tailrec
  val last: List[Int] => Int = {
    case Nil => sys.error("is Nil")
    case a :: Nil => a
    case _ :: as => last(as)
  }
  
  
  // Problem 2
  // Find the last but one element of a list.
  // penultimate(List(1, 1, 2, 3, 5, 8))
  @tailrec
  val penultimate: List[Int] => Int = {
    case Nil => sys.error("is Nil")
    case _ :: Nil => sys.error("just one element")
    case a :: _ :: Nil => a
    case _ :: as => penultimate(as)
  }
  
  
  // Problem 3
  // Find the Kth element of a list.
  // scala> nth(2, List(1, 1, 2, 3, 5, 8))
  // res0: Int = 2
  def nth(n: Int, list: List[Int]): Int = {
    
    @tailrec
    def nth(list: List[Int])(n: Int): Int = list match {
      case Nil => sys.error("index overflow")
      case a :: as => n match {
        case 0 => a
        case n => nth(as)(n-1)
      }
    }
    
    nth(list)(n)
  }
  
  
  // Problem 4
  // Find the number of elements of a list.
  // scala> length(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 6
  def length[A](list: List[A]): Int = {
    
    @tailrec
    def length(n: Int)(list: List[A]): Int = n match {
      case n => list match {
        case Nil => n
        case _ :: as => length(n+1)(as)
      }
    }
    
    list match {
      case list => length(0)(list)
    }
  }
  
  // Problem 5
  // Reverse a list.
  // scala> reverse(List(1, 1, 2, 3, 5, 8))
  // res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  def reverse[A](list: List[A]): List[A] = {
    
    @tailrec
    def reverse[A](reversed: List[A])(list: List[A]): List[A] = reversed match {
      case reversed => list match {
        case Nil => reversed
        case a :: as => reverse(a :: reversed)(as)
      }
    }
    
    reverse(Nil)(list)
  }
  
  // Problem 6
  // Find out whether a list is a palindrome.
  // scala> isPalindrome(List(1, 2, 3, 2, 1))
  // res0: Boolean = true
  def isPalindrome[A](list: List[A]): Boolean = {
    list == reverse(list)
  }
  
  // Problem 7
  // Flatten a nested list structure.
  // scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  // res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  val flatten: List[Any] => List[Any] = {
    
    @tailrec
    def flatten(flattened: List[Any])(list: List[Any]): List[Any] = flattened match {
      case flat => list match {
        case Nil => flat
        case (as @ _ :: _) :: bs => flatten(flat)(as ::: bs)
        case a :: as => flatten(a :: flat)(as)
      }
    }
    
    { case list => reverse(flatten(Nil)(list)) }
  }
  
  
  // Problem 8
  // Eliminate consecutive duplicates of list elements.
  // scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  def compress[A](list: List[A]): List[A] = {
    
    @tailrec
    def compress[A](current: A)(compressed: List[A])(list: List[A]): List[A] = current match {
      case current => compressed match {
        case compressed => list match {
          case Nil => compressed
          case a :: as if current == a => compress(current)(compressed)(as)
          case a :: as => compress(a)(a :: compressed)(as)
        }
      }
    }
    
    list match {
      case Nil => Nil
      case a :: as => reverse(compress(a)(a :: Nil)(as))
    }
  }
  
  
  // Problem 9
  // Pack consecutive duplicates of list elements into sublists.
  // scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  def pack[A](list: List[A]): List[List[A]] = {
    
    @tailrec
    def pack[A](sublists: List[List[A]])(list: List[A]): List[List[A]] = sublists match {
      case Nil => list match { case _ => Nil }
      case List(Nil) => list match { case _ => Nil }
      case (a :: as) :: bs => list match {
        case Nil => reverse(sublists)
        case c :: cs if c == a => pack((c :: a :: as) :: bs)(cs)
        case c :: cs => pack((c :: Nil) :: (a :: as) :: bs)(cs)
      }
    }
    
    list match {
      case Nil => Nil
      case a :: as => pack((a :: Nil) :: Nil)(as)
    }
  }
  
  
  // Problem 10
  // Run-length encoding of a list.
  // scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  def encode[A](list: List[A]): List[(Int, A)] = {
    
    @tailrec
    def encode[A](encoded: List[(Int, A)])(list: List[List[A]]): List[(Int, A)] = encoded match {
      case encoded => list match {
        case Nil => reverse(encoded)
        case Nil :: bs => encode(encoded)(bs)
        case (a :: as) :: bs => encode((length(as) + 1, a) :: encoded)(bs)
      }
    }
    
    list match {
      case Nil => Nil
      case list => encode(Nil)(pack(list))
    }
  }
  
}

