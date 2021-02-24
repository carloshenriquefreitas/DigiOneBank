package com.digitalinnovationone.digionebank

import java.math.BigDecimal

fun main() {
    var func1 = Gerente("123.456.789-00", "Abidoral", BigDecimal.valueOf(5000L), "senha123")
    println(func1.login())
}