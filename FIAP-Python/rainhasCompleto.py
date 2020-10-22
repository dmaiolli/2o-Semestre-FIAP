import pilha

def criaTabuleiro(dim):
    tab = []
    for i in range(dim):
        tab.append([' '] * dim)
    return tab

#tenta posicionar uma rainha na linha l a partir da coluna c
#caso consiga colocar a rainha, retorna a coluna onde foi ela 
#             foi colocada
#caso não seja possível, retorna -1
def posicionaRainha(tab, l, c):
    while c < len(tab):
        if rainhaNaoSofreAtaque(tab, l, c):
            tab[l][c] = 'Q'
            return c
        c = c + 1    
    return -1

#retorna True se nenhuma outra rainha consegue atacar a rainha
#que vou posicionar na linha lin e coluna col
#retorna False se existe, ao menos, uma rainha que consegue se
#posicionar na linha lin e coluna col
def rainhaNaoSofreAtaque(tab, lin, col):
    #validando linha e colunas da posicao (lin,col)
    x = 0
    while x < len(tab):
        if tab[lin][x] == 'Q' or tab[x][col] == 'Q':
            return False
        x = x + 1    

    linBack = lin
    colBack = col
    #olhando a diagonal NE
    while lin >= 0 and col < len(tab):
        if tab[lin][col] == 'Q':
            return False
        lin = lin - 1
        col = col + 1

    lin = linBack
    col = colBack
    #olhando diagonal SO
    while lin < len(tab) and col >= 0:
        if tab[lin][col] == 'Q':
            return False
        lin = lin + 1
        col = col - 1

    lin = linBack
    col = colBack
    #olhando diagonal SE
    while lin < len(tab) and col < len(tab):
        if tab[lin][col] == 'Q':
            return False
        lin = lin + 1
        col = col + 1

    lin = linBack
    col = colBack
    #olhando diagonal NO
    while lin >= 0 and col >= 0:
        if tab[lin][col] == 'Q':
            return False
        lin = lin - 1
        col = col - 1
    
    return True


matriz = criaTabuleiro(5)
p = []  #criando a pilha
lin = 0
col = 0

while lin < 5:
    colPosicionei = posicionaRainha(matriz, lin, col)
    if colPosicionei != -1:
        #empilha na pilha a posicao (lin, colPosicionei)
        #vou tentar posicionar na proxima linha a rainha
        pilha.put(p, [lin, colPosicionei])
        lin = lin + 1
        col = 0
    else:
        #volto para a linha anterior
        lin = lin - 1
        #desempilho a ultima posicao colocada
        pos = pilha.pop(p)
        #retirar a rainha da linha lin da matriz
        c = pos[1]
        matriz[lin][c] = ' '
        #pego a coluna c dessa posicao e tento 
        # posicionar a rainha a partir de c+1
        col = c + 1
        

for linha in matriz:
    print(linha)
print("Pilha", p)    