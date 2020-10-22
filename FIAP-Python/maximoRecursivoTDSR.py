def maximo(lista, ultimoIndice):
    if ultimoIndice == 0:
        return lista[0]
    else:
        max = maximo(lista, ultimoIndice - 1)
        if max > lista[ultimoIndice]:
            return max
        else:
            return lista[ultimoIndice]

vet = [4, 7, 10, 17, 1, 3, -5, 16, 15, 20, 3, 6, 9]

print(maximo(vet, 12))                
#print(maximo(vet, len(vet) - 1))                
