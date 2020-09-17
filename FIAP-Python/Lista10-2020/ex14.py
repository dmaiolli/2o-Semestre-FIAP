# import Imagem

# matriz = Imagem.getMatrizImagemCinza("yao-ming.png")
# lin = len(matriz)
# col = len(matriz[0])

# matrizRot = []
# for i in range(lin):
#     matrizRot.append([0] * col)

# #Indices da matriz original
# i = 0
# j = 0

# #Indices da matriz rotacionada
# x = lin - 1
# y = col - 1

vetor = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

def buscaBinaria(vet , x):
    inicio = 0
    fim = len(vet) - 1

    while inicio <= fim:
        meio = (inicio + fim) // 2
        if vet[meio] > x:
            fim = meio - 1
        elif vet[meio] < x:
            inicio = meio + 1
        else:
            return print("posição: ", meio)

    return -1 

buscaBinaria(vetor, 15)