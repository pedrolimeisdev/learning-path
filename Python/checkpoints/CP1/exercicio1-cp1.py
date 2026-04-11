"""(3,0) Exercício 1 (B) – Cálculo de Comissão de Vendas

Desenvolva o fluxograma e implemente um programa em Python que calcule o valor total a receber por um vendedor ao final do mês. O programa deve:

Ler o nome do vendedor, o salário fixo e o valor total de vendas realizadas em um determinado período.

Considere que a comissão varia de acordo com o período das vendas:

Vendas realizadas entre segunda e quarta-feira: 20% de comissão

Vendas realizadas entre quinta e sexta-feira: 15% de comissão

Vendas realizadas entre sábado e domingo: 10% de comissão

O programa deve solicitar ao usuário que informe o período correspondente às vendas, utilizando uma das opções:

1 – Segunda a quarta

2 – Quinta a sexta

3 – Sábado e domingo

Calcular:

O valor da comissão

O salário total (salário fixo + comissão)

Exibir:

Nome do vendedor

Valor da comissão

Salário total a receber"""

print("=" * 30)
print("Cálculo de Comissão de Vendas")
print("=" * 30)

vend = str(input("Qual o nome do vendedor? "))
sal = float(input(f"Qual o salário fixo de {vend}? "))
vendas = float(input("Qual o valor total de vendas realizadas? "))

print("=" * 25)
print("1 - Segunda a quarta\n2 - Quinta a sexta \n3 - Sábado e domingo")
print("=" * 75)
periodo = int(input("Digite o número correspondente ao período que as vendas foram realizadas: "))
print("=" * 75)

comi = 0
if periodo == 1:
    comi = (20/100) * vendas
elif periodo == 2:
    comi = (15/100) * vendas
elif periodo == 3:
    comi = (10/100) * vendas

print("=" * 35)
print(f"O nome do vendedor é {vend}.")
print(f"O valor da comissão é R${comi:.2f}.")
print(f"O sálario total a receber é R${sal + comi:.2f}.")
print("=" * 35)

