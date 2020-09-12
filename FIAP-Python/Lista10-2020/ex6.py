import criaMatriz

def busca(matriz, x):
    col = len(matriz)
    lin = len(matriz[0])

    for i in range(lin):
        j = 0
        for j in range(col):
            if matriz[i][j] == x:
                return i,j
            else:
                return False
            j += 1
        i+= 1
mat = criaMatriz.criaMatriz()
print(busca(mat, 4))