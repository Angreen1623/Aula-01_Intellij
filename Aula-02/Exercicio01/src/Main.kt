fun main(args: Array<String>) {
    for(n in ordenar(38, 3, 456, 8, 61, 1, 88, 73)){
        print("$n ")
    }
}

fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}