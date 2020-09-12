import criaMatriz

def substitui():
    mat = criaMatriz.criaMatriz()
    col = len(mat[0])
    lin = len(mat)
    for i in range(lin):
        for j in range(col):
            if mat[i][j] <= 127:
                mat[i][j] = 0
            else:
                mat[i][j] = 255

    for linha in mat:
        print(linha)

substitui()