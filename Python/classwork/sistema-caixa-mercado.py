"""Exercício - Sistema de Caixa de Supermercado
Exercício: Sistema de Caixa de Supermercado
 
Desenvolva um programa em Python que simule o fechamento de um caixa. O sistema deve ler o preço de cada item (valor real) de forma contínua.
Para encerrar a entrada de dados, o usuário deve digitar o valor sentinela -1.
Ao final, o programa deve exibir o valor total acumulado da compra, formatado como moeda (duas casas decimais).
Atenção: O valor sentinela não deve ser somado ao total.
 """

tot_prec_item = 0
cont = 1
while True:
    prec_item = float(input(f"Digite o preço do {cont}º item (Digite -1 para parar): "))
    cont += 1
    if prec_item == -1:
        break
    tot_prec_item += prec_item
print(f"O valor total acumulado da compra foi de: R${tot_prec_item:.2f}")    
