"""Exercício 1 - estrutura de repetição
Simulação de Compras com Limite de Crédito
 
Desenvolva um programa que gerencie o limite de crédito de um cliente durante uma sessão de compras. O programa deve simular o funcionamento de uma carteira digital ou cartão pré-pago.
 
Requisitos:
Entrada de Crédito: O programa deve iniciar solicitando ao usuário o valor do Crédito Disponível (valor real).
Processamento de Itens: Utilize uma estrutura de repetição para receber o preço de cada item sucessivamente.
Lógica de Abatimento: A cada item inserido, o programa deve verificar se o saldo atual é suficiente para cobri-lo:
Se o saldo for suficiente, o valor do item é subtraído do crédito e a compra continua.
Se o saldo for insuficiente, o programa deve informar que não há crédito para aquele item e encerrar a entrada de dados imediatamente.
Saída de Dados: Ao final, exiba:
O Valor Total acumulado da compra.
O Saldo Restante (crédito que sobrou).
 """

totitem = 0
cont = 1
saldo = float(input("Digite seu crédito disponível: "))
while True:
    item = float(input(f"insira o preço do {cont}º item: "))
    cont += 1
    if saldo >= item:
        saldo -= item
        totitem += item
    else:
        print("Crédito insuficiente para este item!")
        break
    print(f"Seu saldo atual: R${saldo:.2f}")

print("=-" * 30)
print(f"O Valor total acumulado da compra foi de: R${totitem:.2f}")
print(f"Sobrou R${saldo:.2f} de crédito.")
print("=-" * 30)