import random

def criaMatriz():
    matriz = []
    i = 0

    for i in range(5):
        num = random.randrange(0, 101)
        matriz.append([num] * 7)
        i += 1

    return matriz

def somaPos(matriz):
    soma = 0
    i = 0
    j = 0
    lin = len(matriz)
    col = len(matriz[0])

    while i < lin:
        j = 0
        while j < col:
            soma += matriz[i][j]
            j += 1
        i += 1

    print(soma)

mat = criaMatriz()
somaPos(mat)