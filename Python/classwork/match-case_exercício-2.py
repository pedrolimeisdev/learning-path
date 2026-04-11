"""Exercício 2 – Classificação de Idade
 
Escreva um programa em Python que solicite ao usuário a entrada de uma idade (número inteiro).
O programa deve classificar a idade informada de acordo com as regras abaixo:
0 a 12 → "Criança"
13 a 17 → "Adolescente"
18 a 59 → "Adulto"
60 ou mais → "Idoso"
Idade negativa → "Idade inválida"
Requisitos:
Utilizar apenas if, elif e else.
Validar valores negativos.
Exemplo:
Digite a idade: 25
Adulto"""

idade = int(input("Informe uma idade: "))

if 12 >= idade >= 0:
    print("Criança")
elif 17 >= idade >= 13:
    print("Adolescente")
elif 18 <= idade <= 59:
    print("Adulto")
elif idade >= 60:
    print("Idoso")
else:
    print("Idade Inválida")

    