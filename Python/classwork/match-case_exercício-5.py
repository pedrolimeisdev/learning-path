"""Exercício 5 – Desconto em Compra (Teste Composto)
Escreva um programa em Python que solicite ao usuário o valor total de uma compra e a forma de pagamento:
1 → Dinheiro
2 → Cartão
O programa deve utilizar testes compostos (condições com operadores lógicos && e ||) com if, else if e else para aplicar as seguintes regras de desconto:
Se o valor da compra for maior ou igual a 100 e o pagamento for em dinheiro → aplicar 10% de desconto
Se o valor da compra for maior ou igual a 100 e o pagamento for em cartão → aplicar 5% de desconto
Se o valor da compra for menor que 100 → não há desconto
O programa deve exibir o valor final da compra e uma mensagem indicando se houve desconto.
Requisitos:
Utilizar apenas if, elif e else ou match-case.
Utilizar operadores lógicos (&&, ||) para formar condições compostas.
Validar a forma de pagamento (apenas 1 ou 2).
Exemplo de execução:
Digite o valor da compra: 150
Forma de pagamento (1-Dinheiro / 2-Cartão): 1
Desconto aplicado!
Valor final: 135.0"""

valor_pago = float(input("Digite o valor pago: "))
form_pag = int(input("Qual a forma de pagamento? (Cartao - 1) (Dinheiro - 2): "))

if valor_pago >= 100 and form_pag == 2:
    desc = (10/100) * valor_pago
    print("Desconto Aplicado!")
elif valor_pago >= 100 and form_pag == 1:
    desc = (5/100) * valor_pago
    print("Desconto Aplicado!")
elif valor_pago < 100:
    desc = 0
    print("Nao Houve Desconto!")

print(f"Valor final: {valor_pago-desc}")

