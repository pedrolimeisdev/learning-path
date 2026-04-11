"""(3,0) Exercício 2 (B-I) – Processamento de Múltiplos Salários

Desenvolva o fluxograma e implemente um programa em Python que calcule o valor do Imposto de Renda (IR) a ser pago por um funcionário, com base no seu salário:

Ler o salário do funcionário

Determinar a alíquota de imposto de acordo com a tabela:

Até R$ 1.903,98 → Isento

De R$ 1.903,99 até R$ 2.826,65 → 7,5%

De R$ 2.826,66 até R$ 3.751,05 → 15%

De R$ 3.751,06 até R$ 4.664,68 → 22,5%

Acima de R$ 4.664,68 → 27,5%

Calcular:

O valor do imposto a ser pago

O salário líquido (salário bruto – imposto)

Exibir:

Faixa salarial identificada

Alíquota aplicada

Valor do imposto

Salário líquido

Validar:

O salário informado deve ser maior que zero

Para renda familiar acima de 4.664,68 – alíquota de 27,5%"""

print("=-" * 25)
sal_func = float(input("Qual o salário do funcionário: "))
while sal_func < 0:
    print("Valor Inválido, o salário deve ser maior que zero.")
    sal_func = float(input("Qual o salário do funcionário: "))

porc = 0
if sal_func <= 1903.98:
    imp = 0
elif  1903.99 <= sal_func <= 2826.65:
    imp = (7.5/100) * sal_func
    porc = 7.5
elif 2826.66 <= sal_func <=3751.05:
    imp = (15/100) * sal_func
    porc = 15
elif 3751.06 <= sal_func <=4664.68:
    imp = (22.5/100) * sal_func
    porc = 22.5
else:
    imp = (27.5/100) * sal_func
    porc = 27.5

sal_liqui = sal_func - imp

print("=-" * 25)
print(f"A faixa salarial é {sal_func:.2f}")
print(f"A aliquota aplicada foi de {porc}%")
print(f"O valor do imposto aplicado foi de {imp:.2f}")
print(f"O Salário Líquido foi de R${sal_liqui:.2f}")
print("=-" * 25)