package com.example.cosasdemimente


fun main() {
    print("dime tu nombre porfavor:")
    var nombrePerosona = readLine()
    print("ahora dime tu edad:")
    var edadPersona= readLine()
    var edadPermiso = 18
    print("Cual es tu nacionlidad:")
    val Nacionalidad = readLine()

    if (edadPersona!! > edadPermiso.toString() && Nacionalidad == "chileno"){
        println("puedes pasar a votar, $nombrePerosona")
        votarBalonDeOro()
    }
    else{
        println("no puedes pasar, vuelva a tu casa, $nombrePerosona")
    }

}
fun votarBalonDeOro(){
    println("ahora vas a votar por los siguentes candidatos al balon de oro:")
    println("1.-Cristiano Ronaldo")
    println("2.-Leonel Messi")
    println("3.-Kylian Mbappe")
    println("4.-Zlatan ibraimobich")
    print("elige a tu candidato: ")
    var votacionFutboll = readLine()
    when (votacionFutboll) {
        1.toString() -> println("el ganador es CRISTIANO RONALDO.")
        2.toString() -> println("El ganador es LEONEL MESSI.")
        3.toString() -> println("El ganador es MBAPPE.")
        4.toString() -> println("El ganador es IBRAIMOBICH.")
        else -> println("no has ingresado el numero del candidato")
    }
}