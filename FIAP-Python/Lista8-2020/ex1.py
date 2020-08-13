itemAdd = str(input("Digite uma string: "))

def adicionaLista():
    i = 0
    lista = []
    while i < 10:
        itemAdd = str(input("Digite uma string: "))
        lista.append(itemAdd)
        i = i + 1
    return lista

print(adicionaLista())