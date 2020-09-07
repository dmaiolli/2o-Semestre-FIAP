def soma(matriz):
    somaPos = 0
    somaNeg = 0

    lin = len(matriz)
    col = len(matriz[0])

    for i in range(lin):
        for j in range(col):
            if matriz[i][j] > 0:
                somaPos += matriz[i][j]
            else:
                somaNeg += matriz[i][j]
    
    return(somaPos, somaNeg)