import random

def criaMatriz():
    matriz = []
    i = 0

    for i in range(5):
        num = random.randrange(0, 256)
        matriz.append([num] * 7)
        i += 1

    return matriz