addLista = str(input("Digite uma string: "))

def inverteLista():
    i = 0
    lista = []
    while i < 10:
        addLista = str(input("Digite uma string: "))
        lista.append(addLista)
        i = i + 1

    lista.reverse()
    return lista

print(inverteLista())