"""Escreva um programa que receba um número, verifique se ele é POSITIVO, NEGATIVO ou ZERO.
O programa deve imprimir uma mensagem ao usuário."""

n = int(input("Número: "))

if n > 0:
    print("Positivo!")
else:
    if n < 0:
        print("Negativo!")
    else:
        print("Zero!")