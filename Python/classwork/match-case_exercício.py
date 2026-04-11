"""
Exercício 1 – Verificação dia da semana
 
1-Escreva um programa em Python que solicite ao usuário a entrada de um número inteiro de 1 a 7, representando os dias da semana, conforme a tabela abaixo:
1 → Domingo

2 → Segunda-feira

3 → Terça-feira

4 → Quarta-feira

5 → Quinta-feira

6 → Sexta-feira

7 → Sábado
 
O programa deve utilizar estruturas condicionais (match-case) para  verificar o valor informado e exibir uma das seguintes mensagens:
 
"Fim de semana" para os dias 1 (Domingo) e 7 (Sábado)

"Dia comercial" para os dias de 2 a 6 (Segunda a Sexta)

"Dia inválido" caso o número informado não esteja entre 1 e 7
Requisitos:
O programa deve ler o valor pelo teclado.

Validar a entrada do usuário.

Exibir a mensagem correspondente no console.
 """

print("""
1 → Domingo
2 → Segunda-feira
3 → Terça-feira
4 → Quarta-feira
5 → Quinta-feira
6 → Sexta-feira
7 → Sábado
""")

n = int(input("Digite um número inteiro de 1 a 7: "))

match n:
    case 1 | 7:
        print("Fim de semana")
    case 2 | 3 | 4 | 5 | 6:
        print("Dia comercial")
    case _:
        print("Dia inválido")

        