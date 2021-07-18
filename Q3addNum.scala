import scala.io.StdIn._

object Q3addNum extends App{
  
  var num=5
  println(add(num))
  
  def add(x:Int):Int={
    if(x==0)
      0
    else
      x+add(x-1)
  }

}