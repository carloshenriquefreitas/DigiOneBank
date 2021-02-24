package com.digitalinnovationone.digionebank

import java.math.BigDecimal
import java.math.RoundingMode

class Gerente(
    cpf: String,
    nome: String,
    salario: BigDecimal,
    val senha: String
) : Funcionario(cpf = cpf, nome = nome, salario = salario), Logavel {

    override fun calculoAuxilio(): BigDecimal {
        return salario
            .multiply(BigDecimal.valueOf(40))
            .divide(BigDecimal.valueOf(100), RoundingMode.HALF_DOWN)
    }

    override fun login(): Boolean = "senha123" == senha

}