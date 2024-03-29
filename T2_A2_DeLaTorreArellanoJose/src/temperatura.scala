import scala.collection.mutable.ArrayBuffer

object temperaturas {
  
   //funcion para registrar la hora
  def llenarHora(vec:Array[Int]): Array[Int] = {
    var hora = 0;
    for(i <- 0 until vec.length){
      if(i%2 == 0){
        vec(i) = hora
        hora += 1
      }
    }
    vec
  }
  //funcion para registrar la temperatura
  def llenarTemperatura(vec:Array[Int]): Array[Int] ={
     var temp = numAleatorio(23);
     var cont = 0;
    for(i <- 0 until vec.length){
      if(i%2 != 0){
        vec(i) = temp(cont)
        cont += 1
      }
    }
    vec
  }
  //funcion para buscar la temperatura
  def buscarTemperatura(vec:Array[Int]){
    for(i <- 0 until vec.length){
     if (vec(i) == 25 && vec(i)%2 != 0){
       println("Hora: "+vec(i-1)+ " Temperatura: "+vec(i))
    }
    }
  }
  //funcion para buscar la temeperatura
  def buscarTemperaturaArray(vec:Array[Int]): ArrayBuffer[Int]={
    var tem = ArrayBuffer[Int]()
    for(i <- 0 until vec.length){
     if (vec(i) == 25 && vec(i)%2 != 0){
          tem.+=(vec(i-1))
          tem.+=(vec(i))
      }
    }
    tem
  }
  //funcion para mostrar el resultado
  def mostrarVector(cal:Array[Int]){
    for(i <- 0 until cal.length){
      println(cal(i))
    }
  }
  //funcion para generar los aleatorios
  def numAleatorio(n : Int) = {
   val r = new scala.util.Random
   1 to n map { _ => r.nextInt(50) } 
  }
  
  //main
  def main(args: Array[String]): Unit = {
    var temperaturas = new Array[Int](46);
    
   temperaturas = llenarHora(temperaturas)
   temperaturas = llenarTemperatura(temperaturas)
   //mostrarVector(temperaturas)
   
   buscarTemperatura(temperaturas)
   println(buscarTemperaturaArray(temperaturas))
   
  
  }
 
  
}