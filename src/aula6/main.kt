package aula6

fun main() {
    val cliente1 = Cliente(1, "Freitas", "12344", "443434334")
    val cliente2 = Cliente(2, "Goncalves", "12344", "443434334")

    val cc = ContaCorrente(1000.00, cliente1, 200.00)
    val cp = ContaPoupanca(1000.00, cliente2, 20)

    println(cc.sacar(100.00))
    println(cc.saldo)


}