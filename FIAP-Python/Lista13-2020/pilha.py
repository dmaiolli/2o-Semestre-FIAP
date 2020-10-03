def isFull(lista):
    return False

def isEmpty(lista):
    if len(lista) == 0:
        return True
    else:
        return False

#empilha
def put(lista, info):
    lista.append(info)

#desempilha
def pop(lista):
    return lista.pop()

def peek(lista):
    last = len(lista) - 1
    return lista[last] 
                       