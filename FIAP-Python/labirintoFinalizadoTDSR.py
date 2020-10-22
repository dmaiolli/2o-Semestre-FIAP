import queue

def criaLabirinto(dimLin, dimCol):
    matriz = []
    for i in range(dimLin):
        matriz.append(['-'] * dimCol)

    matriz[0][2] = matriz[0][3] = '#'
    matriz[1][1] = matriz[1][4] = matriz[1][6] = matriz[1][8] = matriz[1][9] = '#'       
    matriz[2][2] = matriz[2][4] = matriz[2][6] = matriz[2][10] = '#'         
    matriz[3][1] = matriz[3][3] = matriz[3][7] = matriz[3][8] = '#'        
    matriz[4][3] = matriz[4][5] = matriz[4][9] = '#'
    matriz[5][1] = matriz[5][8] = '#'

    return matriz

#retorna a lista de vizinhos na matriz tab
#a partir da posicao pos
def encontraVizinhos(tab, pos):
    lista = []
    qtdLin = len(tab)
    qtdCol = len(tab[0])
    #pegando os índices (linha e coluna) de pos
    l = pos[0]
    c = pos[1]
    
    #LESTE
    if c + 1 < qtdCol and tab[l][c+1] == '-':
        lista.append((l, c + 1)) 
    #NORTE
    if l - 1 >= 0 and tab[l-1][c] == '-':
        lista.append((l-1, c))
    #OESTE
    if c - 1 >= 0 and tab[l][c-1] == '-':
        lista.append((l, c - 1))
    #SUL
    if l + 1 < qtdLin and tab[l+1][c] == '-':
        lista.append((l + 1, c)) 

    return lista    

#PROGRAMA PRINCIPAL
mat = criaLabirinto(6, 11)
fila = []

mat[5][10] = (-1, -1)
pos = (5, 10)
queue.put(fila, pos)

while pos != (0,0):
    pos = queue.get(fila)
    vizinhos = encontraVizinhos(mat, pos)
    for viz in vizinhos:
        queue.put(fila, viz)
        l = viz[0]
        c = viz[1]
        mat[l][c] = pos

pos = (0,0)
print(pos)
while pos != (5, 10):
    l = pos[0]
    c = pos[1]
    pos = mat[l][c]
    print(pos)
    