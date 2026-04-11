"""Exercício 4 – Rodízio de Veículos (São Paulo)
Escreva um programa em Python que solicite ao usuário o último dígito da placa de um veículo (um número inteiro de 0 a 9) e o dia da semana (também representado por um número de 1 a 5), considerando apenas dias úteis:
1 → Segunda-feira
2 → Terça-feira
3 → Quarta-feira
4 → Quinta-feira
5 → Sexta-feira
 
O programa deve utilizar if, elif e else para verificar se o veículo está impedido de circular naquele dia, de acordo com as regras do rodízio de veículos da cidade de São Paulo:
Segunda-feira (1): placas terminadas em 1 e 2
Terça-feira (2): placas terminadas em 3 e 4
Quarta-feira (3): placas terminadas em 5 e 6
Quinta-feira (4): placas terminadas em 7 e 8
Sexta-feira (5): placas terminadas em 9 e 0
O programa deve exibir uma das seguintes mensagens:
"Rodízio ativo: veículo não pode circular"
"Dia ou placa inválidos" (caso os valores informados estejam fora dos intervalos esperados)
Requisitos:
Utilizar  if, else if e else ou match-case.
Validar se o dia está entre 1 e 5.
Validar se o dígito da placa está entre 0 e 9.
Exemplo de execução:
Digite o último dígito da placa: 4
Digite o dia da semana (1 a 5): 2
Rodízio ativo: veículo não pode circular"""



"""
Exercício 4 – Rodízio de Veículos (São Paulo)
Regras:
1 (Seg) -> Placas 1, 2
2 (Ter) -> Placas 3, 4
3 (Qua) -> Placas 5, 6
4 (Qui) -> Placas 7, 8
5 (Sex) -> Placas 9, 0
"""

print("--- Sistema de Consulta de Rodízio (SP) ---")

digito = int(input("Digite o último dígito da placa (0-9): "))
dia = int(input("Digite o dia da semana (1-5): "))

match (digito, dia):

    case (d, w) if not (0 <= d <= 9 and 1 <= w <= 5):
        print("Dia ou placa inválidos")

    case (1 | 2, 1): # Segunda-feira
        print("Rodízio ativo: veículo não pode circular")
    case (3 | 4, 2): # Terça-feira
        print("Rodízio ativo: veículo não pode circular")
    case (5 | 6, 3): # Quarta-feira
        print("Rodízio ativo: veículo não pode circular")
    case (7 | 8, 4): # Quinta-feira
        print("Rodízio ativo: veículo não pode circular")
    case (9 | 0, 5): # Sexta-feira
        print("Rodízio ativo: veículo não pode circular")
    
    case _:
        print("✅ Veículo liberado para circular")