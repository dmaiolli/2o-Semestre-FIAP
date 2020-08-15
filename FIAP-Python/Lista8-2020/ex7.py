def maiorQueX(x):
    lista = [0,15,14,2,3,6,4]
    contador = 0
    for num in lista:
        if x < num:
            contador += 1
    return contador

print(maiorQueX(2))