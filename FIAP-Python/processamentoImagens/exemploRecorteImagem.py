import Imagem

tupla_matriz = Imagem.getMatrizImagemColorida("lago_canada.jpg")

matR = tupla_matriz[0]
matG = tupla_matriz[1]
matB = tupla_matriz[2]

print("Linhas ", len(matR))
print("Colunas ", len(matR[0]))

# posição inicial da imagem recortada
i = 50 
j = 100

largura = 700
altura = 500


red = []
green = []
blue = []

lin = i

while len(red) < altura: 
    linhaR = [] 
    linhaG = []
    linhaB = []
    col = j
    while len(linhaR) < largura:
        linhaR.append(matR[lin][col])
        linhaG.append(matG[lin][col])
        linhaB.append(matB[lin][col])
        col = col + 1
    red.append(linhaR)
    green.append(linhaG)
    blue.append(linhaB)
    lin = lin + 1 

Imagem.salvaImagemColorida("lago_canada_cropped.jpg", red, green, blue)