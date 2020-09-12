def getDimensao(matriz):
    col = len(matriz)
    lin = len(matriz[0])

    print(col, lin)

def matriz():
    matriz = []
    for i in range(3):
        matriz.append([''] * 3)
        i += 1

    return matriz

mat = matriz()
getDimensao(mat)