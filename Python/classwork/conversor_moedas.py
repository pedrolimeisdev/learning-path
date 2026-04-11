"""Crie um programa que receba um valor em Reais (R$) e a cotação atual do Dólar. O programa deve exibir quanto esse valor representa em Dólares (US$).
Entrada: Valor em reais e cotação do dólar.
Processamento: dolar = reais / cotacao.
Saída: Valor convertido."""

real = float(input("Digite um valor em reais: R$ "))
cotacao = float(input("Digite a cotacao atual do dolar: $ "))

dolar = real/cotacao

print(f"O valor em real convertido em dolar é igual a: {dolar}")


