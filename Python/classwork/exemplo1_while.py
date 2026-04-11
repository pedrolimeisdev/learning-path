inicio = int(input("Início: "))
fim = int(input("Fim: "))

if inicio > fim:
    while fim < inicio:
        fim = fim + 1
        if fim % 2 == 0:
            print(f"x: {fim}")

elif inicio < fim:
    while fim > inicio:
        fim = fim - 1
        if fim % 2 != 0:
            print(f"x: {fim}")
            
else:
    print("sao iguais")