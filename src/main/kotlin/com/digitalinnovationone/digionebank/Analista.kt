package com.digitalinnovationone.digionebank

import java.math.BigDecimal
import java.math.RoundingMode

class Analista(
    cpf: String,
    nome: String,
    salario: BigDecimal
) : Funcionario(
    nome,
    cpf,
    salario) {

    override fun calculoAuxilio(): BigDecimal {
        return salario
                    .multiply(BigDecimal.valueOf(10))
                    .divide(BigDecimal.valueOf(100), RoundingMode.HALF_DOWN)
    }

}