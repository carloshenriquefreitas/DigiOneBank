package com.digitalinnovationone.digionebank

import java.math.BigDecimal

fun main() {
    var func1 = Analista("007.764.603-74", "Carlos Henrique", BigDecimal.valueOf(10000.0))
    imprimeRelatorio(func1)

    println()

    var func2 = Gerente("123.456.789-00", "Abidoral", BigDecimal.valueOf(18000.0), "12345")
    imprimeRelatorio(func2)
}

fun imprimeRelatorio(func: Funcionario) = println(func.toString())