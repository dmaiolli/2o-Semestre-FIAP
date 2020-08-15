def estaOrdenado(lista):
    maior = 0
    for num in lista:
        if maior < num:
            maior = num
        else:
            return False
    return True
lista = [1,2,3,4]
print(estaOrdenado(lista))