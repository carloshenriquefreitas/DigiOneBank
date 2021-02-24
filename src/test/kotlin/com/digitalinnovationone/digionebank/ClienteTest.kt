package com.digitalinnovationone.digionebank

fun main() {
    val cl1 = Cliente("1345-748-685-00", "Fulano de tal", ClienteTipo.PF, "120435686")

    println(cl1)
    println(cl1.login())
}