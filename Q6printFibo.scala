import scala.io.StdIn._

object Q6printFibo extends App{
  
    var num = 10
    printFib(num)
  
  def fib(x:Int):Int= x match{
    case x if x==0 =>0
    case x if x==1 =>1
    case x => fib(x-1)+fib(x-2)
  }

  def printFib(n:Int):Any ={
    if(n>0) printFib(n-1)
    println(fib(n))
  }

}