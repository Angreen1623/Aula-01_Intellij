import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.sqrt


fun main(args: Array<String>) {

    println("Qual area deseja calcular? triangulo, retangulo, circunferencia, losango, trapezio?")
    var opc: String = readLine().toString()

    var x: Double = 10.0
    var y: Double = 9.0
    var z: Double = 0.0

    when(opc){
        "triangulo" -> {
            println("Digite o valor do primeiro lado do triangulo")
            x = readLine()?.toDouble() ?: 0.0
            println("Digite o valor do segundo lado do triangulo")
            y = readLine()?.toDouble() ?: 0.0
            println("Digite o valor do terceiro lado do triangulo")
            z = readLine()?.toDouble() ?: 0.0
            println("A area do triangulo é "+calc(x,y,z, ::tri))
        }
        "retangulo" -> {
            println("Digite o valor do primeiro lado do retangulo")
            x = readLine()?.toDouble() ?: 0.0
            println("Digite o valor do segundo lado do retangulo")
            y = readLine()?.toDouble() ?: 0.0
            println("A area do retangulo é "+calc(x,y,-1.0, ::ret))
        }
        "circunferencia" -> {
            println("Digite o valor do diametro da circunferencia")
            x = readLine()?.toDouble() ?: 0.0
            println("A area da circunferencia é "+calc(x, -1.0,-1.0, ::cir))
        }
        "losango" -> {
            println("Digite o valor da diagonal maior do losango")
            x = readLine()?.toDouble() ?: 0.0
            println("Digite o valor da diagonal menor do losan")
            y = readLine()?.toDouble() ?: 0.0
            println("A area do losango é "+calc(x,y,-1.0, ::los))
        }
        "trapezio" -> {
            println("Digite o valor do primeiro lado do trapézio")
            x = readLine()?.toDouble() ?: 0.0
            println("Digite o valor do segundo lado do trapézio")
            y = readLine()?.toDouble() ?: 0.0
            println("Digite o valor da altura do trapézio")
            z = readLine()?.toDouble() ?: 0.0
            println("A area do trapézio é "+calc(x,y,z, ::tra))
        }
        else -> println("por favor, digite como no exemplo")
    }

}


fun calc(a:Double, b:Double, c:Double, funcao:(Double, Double, Double) -> Double): String{
    val res: Double = funcao(a,b,c)
    if (res == -1.0){
        return "Valores inseridos são incorretos"
    }else{
        return "$res"
    }
}

fun tri(a:Double, b:Double, c: Double): Double{
    if((a==b)&&(b==c)){
        val res:Double = (a*a*sqrt(3.0)/4)
        return res
    }else if(a!=b && b!=c && c!=a){
        val p : Double = (a+b+c)/2
        val res : Double = sqrt(p*(p-a)*(p-b)*(p-c))
        return res
    }else {
        var res: Double = -1.0
        if (a == b) {
            val h: Double = sqrt(abs(pow(a, 2.0) - pow(c / 2, 2.0)))
            res = (c * h) / 2

        } else if (b == c) {
            val h: Double = sqrt(abs(pow(a / 2, 2.0) - pow(b, 2.0)))
            res = (a * h) / 2
        } else {
            val h: Double = sqrt(abs(pow(a, 2.0) - pow(b / 2, 2.0)))
            res = (b * h) / 2
        }
        return res
    }
}

fun ret(a:Double, b:Double, c: Double): Double{
    return a*b
}
fun cir(a:Double, b:Double, c: Double): Double{

    val res : Double = PI * pow(a/2, 2.0)

    return res
}
fun los(a:Double, b:Double, c: Double): Double{

    val res : Double = (a*b)/2

    return res
}
fun tra(a:Double, b:Double, c: Double): Double{
    return ((a+b)*c)/2
}