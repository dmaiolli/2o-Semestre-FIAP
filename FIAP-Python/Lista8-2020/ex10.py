def intercala(lA, lB):
    resp = []
    i = 0
    j = 0

    while i < len(lA) and j < len(lB):
        if lA[i] < lB[j]:
            resp.append(lA[i])
            i += 1
        else:
            resp.append(lB[j])
            j += 1

    while i < len(lA):
        resp.append(lA[i])
        i+= 1

    while j < len(lB):
        resp.append[lB[j]]
        j += 1

    return resp

x = [2,6,8,9,13,15,23]
y = [0,1,10,12,14,15,16,17]

resultado = intercala(x, y)
print(resultado)