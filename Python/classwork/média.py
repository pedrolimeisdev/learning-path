"""Escreva um programa em Python para calcular a média aritmética de 3 notas. O programa
deve receber as notas, calcular e imprimir a média obtida. Além disso, deve verificar
a condição de aprovação deste aluno (Aprovado ou Reprovado).
"""

print("----- Calculo da Média -----")

n1 = float(input("n1: "))
n2 =  float(input("n2: "))
n3 = float(input("n3: "))

media = (n1 + n2 + n3) / 3

print(f"Média: {media:.2f}")

if media >= 6:
    print("Você está Aprovado!")
else:
    print("Você está Reprovado")

