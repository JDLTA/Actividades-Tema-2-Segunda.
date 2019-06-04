import scala.collection.mutable.ListBuffer

object SustituirPAlabra {
  
     //Funcione para solicitar el numero de palabras
  def solicitarPalabras(numoPal:Int):ListBuffer[String] = {
    val palabras = ListBuffer.empty[String]
    for (i <- 0 until numoPal){
      println("Ingresa la palabra "+ (i+1))
      palabras.+=(readLine())
    }
    palabras
  }
      //Funcion para sustituir palabra
  def sustituir(p1:String, p2:String, lista:ListBuffer[String] ) = {
   val listaRes = ListBuffer.empty[String]
   lista.foreach(e => if(e.equals(p1)) listaRes.+=(p2) else listaRes.+=(e))
   listaRes
  }
 
    //Main
  def main(args: Array[String]): Unit = {
     println("Ingresa la cantidad de palabras a ingresar: ")
     var lista = solicitarPalabras(readInt()) 
     
     println("Ingresa la primera palabra: ")
     var p1 = readLine()
     println("Ingresa la segunda palabra: ")
     var p2 = readLine()
     
     lista = sustituir(p1, p2, lista)
     
     println(lista)
     
     
  }

}