selecoes = ["Alemanha", "Argentina", "Colômbia", "Costa Rica", "Brasil", "França", "Holanda"]

def campeonato(lista):
    i = 0
    while i < len(lista):
        print("Campeão: ", lista[i])
        vice(lista)
        i += 1

def vice(lista):
    j = 0
    while j < len(lista):
        print("Vice: ", lista[j])
        j += 1
campeonato(selecoes)