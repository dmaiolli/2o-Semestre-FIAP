#retorna  True se tem  espa ̧co  em  branco  para  jogar  Falsecaso  contr ́ario
def temEspaco(matriz):
    temEspaco = 0
    for i in range(len(matriz)):
        if matriz[i] == '':
            temEspaco = temEspaco + 1

# #retorna  True se  algu ́em  ganhou , False  caso  contr ́ario
# def haGanhador(matriz):
#     if matriz[0,1,2] 

# #retorna  True se a jogada  pode  ser  realizada
# def joga(matriz, lin, col, jogador):


# #imprime a matriz  do jogo
# def imprime(matriz):

def criaTabuleiro():
    tabuleiro = []
    for i in range(3):
        tabuleiro.append([''] * 3)
        i = i + 1

tabuleiro = criaTabuleiro()