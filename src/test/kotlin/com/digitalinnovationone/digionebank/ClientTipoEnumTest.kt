package com.digitalinnovationone.digionebank

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} $it")
    }

    println()

    ClienteTipo.values().forEach { tipo ->
        println("${tipo.name} $tipo")
    }

    println()

    val pf = ClienteTipo.PF
    println("$pf ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("$pj ${pj.descricao}")
}