"""
Estrutura condicionais
- if - elif - else
- match- case

Sintaxe:

match <var>:
    case <valor_1>:
        #açao 1 <bloco de código>
    case <valor_2>
        #açao 2 <bloo de código>
    case <valor_2>
        #açao 3 <bloco de código>
    case _:
        #açao default (caso nenhum padrao anterior combine)
"""

#Exemplo com número:

n = int(input("Número: "))

match n:
    case 1:
        print(f"n: {n}")
    case 2:
        print(f"n: {n}")
    case 3:
        print(f"n: {n}")
    case _:
        print(f"Número {n} inválido!")

#Exemplo com texto (String):

status = input("Status: ")

match status:
    case "Pendente" | "pendente" | "PENDENTE": # | significa or
        print("Aguardando pagamento.")
    case "Pago" | "pago" | "PAGO":
        print("Peparando para envio.")
    case "Enviado" | "enviado" | "ENVIADO":
        print("Produto a caminho!")
    case "Entregue" | "entregue" | "ENTREGUE":
        print("Pedido Finalizado.")
    case _:
        print(f"Status {status} nao reconhecido")