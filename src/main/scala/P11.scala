import P10.lengthEncode
object P11 extends App{

 def encodeModified(list: List[Char]): List[Any] = {

  val lengthEncodedList =  lengthEncode(list)
   lengthEncodedList.map{
     element =>
     if(element._1 == 1) element._2
       else element
   }

 }
   println(encodeModified(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}
