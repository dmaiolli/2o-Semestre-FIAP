import random, pilha

pilhaPreenche = []

def numAleatorio():
  num = random.randrange(50)
  return num

def empilha():
  while len(pilhaPreenche) != 20:
    num = numAleatorio()
    pilha.put(pilhaPreenche, num)

def desempilha(pilhaPrm):
  while len(pilhaPrm) > 0:
    pilha.pop(pilhaPrm)

empilha()
print(pilhaPreenche)

desempilha(pilhaPreenche)
print(pilhaPreenche)