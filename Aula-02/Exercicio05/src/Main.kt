inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("entrando no método $nomeFuncao...")
    try{
        return funcao()
    }finally {
        println("Método $nomeFuncao foi realizado...")
    }
}

fun somar(a:Int,b:Int):Int{
    return a+b
}

fun main(args: Array<String>) {
    val resultado = executarComLog("somar"){
        somar(4,5)
    }
    println(resultado)
}