'''
Cálculo de Conta de Energia 2026
 
Escreva um programa para calcular o valor de uma conta de energia elétrica de
um consumidor com base no consumo de kWh. O programa deve receber o consumo de energia e
calcular o valor a pagar. Ao final, deve imprimir a conta detalhada (consumo, tarifa
aplicada, valor total a pagar...)
 
 
Regras de Negócio:
 
Consumo < 150 kWh: R$ 0,75 por kWh.
 
Consumo entre 150 e 500 kWh: R$ 0,95 por kWh.
 
Consumo acima de 500 kWh: R$ 1,20 por kWh.
 
Taxa Mínima (Disponibilidade): R$ 45,00 (se o cálculo do consumo for inferior a
este valor, o consumidor paga o mínimo).
'''



consumo = int(input("Digite sem consumo de energia em KWh: "))

print("-" * 30)
print("Conta de Energia 2026")
print("-" * 30)

if consumo < 150:
    tarifa =  0.75
elif 150 <= consumo <= 500:
    tarifa =  0.95
else:
    tarifa = 1.20

valor_final = tarifa * consumo

if valor_final < 45:
    valor_final = 45
    print("APLICADA A TAXA MÍNIMA DE R$45,00")
    print("-" * 30)
else:
    valor_final = valor_final

print(f"O consumo de KWh foi de: {consumo}")
print(f"a tarifa aplicada foi de: {tarifa}")
print(f"O valor final a ser pago é de: R${valor_final}")