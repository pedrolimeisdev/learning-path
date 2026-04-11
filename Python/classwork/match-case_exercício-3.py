"""Exercício 3 – Cálculo de Média e Situação do Aluno
Crie um programa que receba duas notas (valores decimais) de um aluno e calcule a média.
Com base na média, o programa deve exibir:
Média maior ou igual a 7 → "Aprovado"
Média entre 5 e 6.9 → "Recuperação"
Média menor que 5 → "Reprovado"
Requisitos:
Utilizar apenas if, elif e else.
Calcular a média corretamente.
Considerar que as notas variam de 0 a 10 (não é obrigatório validar).
Exemplo:
Digite a primeira nota: 6
Digite a segunda nota: 8
Aprovado"""

n1 = float(input("Digite a primeira nota do aluno: "))
n2 = float(input("Digite a segunda nota do aluno: "))
media = (n1+n2)/2

print(f"Media {media}")
if media >= 7:
    print("Aprovado!")
elif 5 <= media <= 6.9:
    print("Recuperacao!")
elif media < 5:
    print("Reprovado!")
