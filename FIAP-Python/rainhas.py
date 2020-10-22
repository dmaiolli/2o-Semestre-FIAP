import pilha

matriz = criaTabuleiro(8)

p = []
lin = 0
col = 0
colPosicionei = posicionaRainha(lin, col)
if eu consegui colocar a rainha na linha lin:
    empilha na pilha a posicao (lin, colPosicionei)
    vou tentar posicionar na proxima linha a rainha
else:
    desempilho a ultima posicao colocada
    pego a coluna c dessa posicao e tenho posicionar a rainha
    a partir de c+1
    colPosicionei = posicionaRainha(lin, c+1)
    if nao tem jeito de posicionar, aplico o retrocesso