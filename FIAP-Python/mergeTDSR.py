def mergesort(lista, ini, fim):
    if ini < fim:
        meio = int((ini + fim) / 2)
        mergesort(lista, ini, meio)
        mergesort(lista, meio + 1, fim)
        intercala(lista, ini, meio, fim)


def intercala(vetor, ini, meio, fim):
    aux = []
    i = ini
    j = meio + 1
    while i <= meio and j <= fim:
        if vetor[i] < vetor[j]:
            aux.append(vetor[i])
            i = i + 1
        else:
            aux.append(vetor[j])
            j = j + 1

    while i <= meio:
        aux.append(vetor[i])
        i = i + 1

    while j <= fim:
        aux.append(vetor[j])
        j = j + 1                

    for valor in aux:
        vetor[ini] = valor
        ini = ini + 1

conjunto = [4, 6, 19, 0, -4, 3, 10, 7, 8, 5, 4, 21]
mergesort(conjunto, 0, len(conjunto)-1)
print(conjunto)
