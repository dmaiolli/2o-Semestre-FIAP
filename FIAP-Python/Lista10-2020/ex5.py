import criaMatriz

def soma(matriz):
    somaPos = 0
    somaNeg = 0

    lin = len(matriz)
    col = len(matriz[0])

    for i in range(lin):
        for j in range(col):
            if matriz[i][j] > 0:
                somaPos += matriz[i][j]

                for linha in matriz:
                    print(linha)
            else:
                somaNeg += matriz[i][j]
    
    print(somaPos, somaNeg)

mat = criaMatriz.criaMatriz()

soma(mat)