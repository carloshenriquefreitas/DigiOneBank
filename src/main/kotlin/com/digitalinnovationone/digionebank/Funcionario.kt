package com.digitalinnovationone.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    cpf: String,
    nome: String,
    val salario: BigDecimal
) : Pessoa(cpf, nome) {

    protected abstract fun calculoAuxilio():BigDecimal

    override fun toString(): String {
        return "CPF: $cpf\nNome: $nome\nSalário: $salario\nAuxílio: " + calculoAuxilio().toString()
    }

}