"""(4,0) Exercício 3 (I) – Processamento de Múltiplos Salários

Desenvolva o fluxograma e implemente um programa em Python que processe os salários de vários funcionários.

O programa deve:

Ler salários sucessivamente até que o usuário informe o valor 0, indicando o fim da entrada de dados

Para cada salário informado:

Calcular o imposto de renda conforme a tabela do Exercício 2

Ao final, calcular e exibir:

Quantidade total de funcionários processados

Média salarial

Valor total de imposto arrecadado

Validar:

Não permitir valores negativos

Observação

Todos os exercícios devem ser resolvidos utilizando:

Fluxograma (antes da implementação)

Estruturas condicionais (if/elif/else ou match-case)

Estruturas de repetição (while)

Boas práticas de organização e clareza do código

Não deve ser aplicado conceitos não trabalhados em sala de aula

Consulta a apenas anotações em caderno / materiais de aula"""

total_func = 0
soma_salarios = 0
total_imposto = 0

while True:
    salario = float(input("Informe o salário (ou 0 para encerrar): "))

    if salario == 0:
        break
    
    if salario < 0:
        print("Erro: Não são permitidos valores negativos!")
        continue 

    if salario <= 1903.98:
        imposto = 0
    elif salario <= 2826.65:
        imposto = salario * 0.075
    elif salario <= 3751.05:
        imposto = salario * 0.15
    elif salario <= 4664.68:
        imposto = salario * 0.225
    else:
        imposto = salario * 0.275

    total_func += 1
    soma_salarios += salario
    total_imposto += imposto

if total_func > 0:
    media = soma_salarios / total_func
    print("=" * 30)
    print(f"Total de funcionários: {total_func}")
    print(f"Média salarial: R${media:.2f}")
    print(f"Total de imposto: R${total_imposto:.2f}")
    print("=" * 30)
else:
    print("Nenhum funcionário foi processado.")
    