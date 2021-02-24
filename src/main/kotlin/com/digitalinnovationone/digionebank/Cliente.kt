package com.digitalinnovationone.digionebank

class Cliente (
    cpf: String,
    nome: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa (cpf = cpf, nome = nome), Logavel{
    override fun login(): Boolean = "23456" == senha

    override fun toString(): String {
        return "CPF: $cpf\nNome: $nome\nTipo: ${clienteTipo.descricao}"
    }

}