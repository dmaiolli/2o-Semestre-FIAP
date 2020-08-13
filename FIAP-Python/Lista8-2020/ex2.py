import random

tamLista = int(input("Digite o tamanho da lista: "))

def ListaAleatoria(numero):
    lista = []
    i = 0
    while i < tamLista:
        numeroAleatorio = random.randint(1,1001)
        lista.append(numeroAleatorio)
        i += 1

    return lista

print(ListaAleatoria(tamLista))