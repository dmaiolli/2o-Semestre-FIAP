def extraiPares(lista):
    resp = []
    for elem in lista:
        if elem % 2 == 0:
            resp.append(elem)

    return resp

conjunto = [2,5,6,1,4,8]
retorno = extraiPares(conjunto)
print(retorno)