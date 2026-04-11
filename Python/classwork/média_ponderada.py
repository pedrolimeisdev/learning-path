"""Receba três notas de um aluno. Calcule a média ponderada considerando que a primeira nota tem peso 2, a segunda peso 3 e a terceira peso 5.
Processamento: media = (n1*2 + n2*3 + n3*5) / 10.
"""
print("-" * 30)
print("Calcular média ponderada")
print("-" * 30)

n1 = int(input("Digite a Primeira nota: "))
n2 = int(input("Diigite a Segunda nota: "))
n3 = int(input("Digite a Terceira nota: "))

media_pond = (n1*2 + n2*3 + n3*5) / 10

print(f"Sua média ponderada é de: {media_pond}")

