def contagem(lista):
    contabilizado = []
    for i in range(len(lista)):
        if not lista[i] in contabilizado:
            qtd = lista.count(lista[i])
            print(lista[i], "aparece: ", qtd, " vezes")
            contabilizado.append(lista[i])

lista = ['a','b','c','a','d','a','a']

contagem(lista)