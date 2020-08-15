def interseccao(listaA, listaB):
    resp = []
    for elem in listaA:
        if elem in listaB:
            resp.append(elem)
    return resp
    
listA = [2,5,7,10,8,-1]
listB = [0,3,5,9,7]

print(interseccao(listA, listB))