import random
def criaMatriz():
    matriz = []
    i = 0
    while i < 4:
        matriz.append([0] * 5)
        i += 1

def matAleatorio(mat):
    j = 0
    while j < 5:
        num = random.randrange(0, 101)
        mat[0][j] = 1
        j += 1

    for linha in mat:
        print(linha)

mat = criaMatriz()
matAleatorio(mat)