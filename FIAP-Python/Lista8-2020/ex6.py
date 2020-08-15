def insereOrdenado(x, lista):
    lista.append(x)
    lista.sort()

vet = [1, 6, 10, 24, 25, 30, 45]
insereOrdenado(20, vet)
print(vet)