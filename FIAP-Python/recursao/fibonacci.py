def fiboRec(n):
    if n == 1 or n == 2:
        return 1
    else:
        return fiboRec(n-1) + fiboRec(n-2)

def fiboInt(n):
    if n == 1 or n == 2:
        return 1

    ant_1 = 1
    ant_2 = 1
    i = 2
    while i < n:
        atual = ant_1 + ant_2
        ant_2 = ant_1
        ant_1 = atual
        i = i + 1

    return atual


print(fiboInt(40))
print(fiboRec(40))