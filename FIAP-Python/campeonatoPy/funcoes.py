import random

def gols():
    gols = random.randrange(0, 6)
    return gols

def jogo(time1, time2):
    time1[4] = 0
    time2[4] = 0
    time1[4] += gols()
    time2[4] += gols()

    vencedor(time1, time2)
    jogo = 1

    time1[1] += jogo
    time2[1] += jogo


def vencedor(time1, time2):
    vitoria = 1
    pontos = 3
    if time1[4] > time2[4]:
        time1[3] += vitoria
        time1[2] += pontos
        print('O {} ganhou do {}'.format(time1[0], time2[0]))
    elif time1[4] < time2[4]:
        time2[3] += vitoria
        time2[2] += pontos
        print('O {} ganhou do {}'.format(time2[0], time1[0]))
    else: 
        pontos = 1
        time1[2] += pontos
        time2[2] += pontos 
        print('Empate do {} e {}'.format(time1[0], time2[0]))

    return time1, time2

def imprime(listaTimes):
    print('Tabela: ')
    for times in listaTimes:
        print(times)

def tabela(listaTimes):
    print('Tabela = J / P / V')
    i = 0
    while i < len(listaTimes):
        print('{} = {} / {} / {}'.format(listaTimes[i][0], listaTimes[i][1], listaTimes[i][2], listaTimes[i][3]))
        i += 1

def campeao(listaTimes):
    maior = 0
    campeao = listaTimes[1]
    for time in listaTimes:
        if time[2] > maior:
            maior = time[2]
            campeao = time
        elif maior == time[2]:
            if time[3] > campeao[3]:
                maior = time[3]
                campeao = time
            
            if maior == time[3]:
                if time[4] > campeao[4]:
                    maior = time[4]
                    campeao = time
    print('O campeão foi o {} com {} pontos e {} vitórias'.format(campeao[0], campeao[2], campeao[3]))

def adicionaCampeonato(time, lista):
    lista.append(time)

def campeonato(listaTimes):
    i = 0
    while i < len(listaTimes): 
        j = i + 1
        while j < len(listaTimes):
            jogo(listaTimes[i], listaTimes[j])
            jogo(listaTimes[i], listaTimes[j])
            j += 1
        i += 1
    imprime(listaTimes)
    tabela(listaTimes)
    print(campeao(listaTimes))
