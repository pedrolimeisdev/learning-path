""" Uma empresa paga um salário fixo de R$ 2.000,00 mais uma comissão de 15% sobre o total de vendas efetuadas pelo vendedor. Receba o total de vendas do mês e exiba o salário final.
Entrada: Total de vendas (double).
Processamento: total = 2000 + (vendas * 0.15).
Saída: Salário final formatado."""

tot_vendas = float(input("Qual o valor total de vendas? "))
tot_sal = 2000 + (tot_vendas * 0.15)

print(f"O salário final do vendedor foi de {tot_sal:.2f}")

