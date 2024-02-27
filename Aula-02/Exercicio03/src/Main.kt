fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>{
    val listarFiltrada = ArrayList<E>()
    for(e in lista){
      if(filtro(e)){
          listarFiltrada.add(e)
      }
    }
    return listarFiltrada

}

fun comTresLetras(nome: String): Boolean{
    return nome.length == 3
}

fun main(args: Array<String>) {
    val nomes = listOf("Ana","Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
}