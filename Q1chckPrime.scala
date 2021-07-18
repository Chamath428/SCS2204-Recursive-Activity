  
import scala.annotation.tailrec
import scala.io.StdIn._

object Q1chckPrime extends App{
  
  //change the number you want to check
  var num=5

  println(isPrime(num,2))
  
  @tailrec
  def gcd(i:Int,j:Int):Int=  j match{
    case 0=>i
    case j if (j>i) =>gcd(j,i)
    case _=>gcd(j,i%j)
  }

  def isPrime(x:Int,y:Int):Boolean= y match{
    case a if x==a => true
    case a if gcd(x,a)>1 =>false
    case a =>isPrime(x,a+1)
  }

}