import scala.annotation.tailrec
import scala.io.StdIn._
import scala.util.control.Breaks._

object Q2printPrimeSeq extends App{
  
  
  var num = 10
  println(printSeq(num,2))
  
  @tailrec
  def gcd(i:Int,j:Int):Int=  j match{
    case 0=>i
    case j if (j>i) =>gcd(j,i)
    case _=>gcd(j,i%j)
  }

  @tailrec
  def isPrime(x:Int,y:Int):Boolean= y match{
    case a if x==a => true
    case a if gcd(x,a)>1 =>false
    case a =>isPrime(x,a+1)
  }

  @tailrec
  def printSeq(a:Int,b:Int){
     if(a==b){
       break
     }
    if(isPrime(b,2)){
      println(b)
    }
    printSeq(a,b+1)
  }


}