import random
def criaMatriz():
    matriz = []
    i = 0
    
    for i in range(5):
        num = random.randrange(0, 101)
        matriz.append([num] * 7)
        i += 1

    for linha in matriz:
        print(linha)


mat = criaMatriz()