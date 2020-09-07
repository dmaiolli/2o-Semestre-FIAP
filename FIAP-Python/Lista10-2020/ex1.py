def tictactoe():
    tabuleiro = []
    for i in range(3):
        tabuleiro.append([''] * 3)
        i += 1

    tabuleiro[0][0] = 'x'
    tabuleiro[0][1] = 'o'
    tabuleiro[0][2] = 'x'

    tabuleiro[1][0] = 'o'
    tabuleiro[1][1] = 'x'
    tabuleiro[1][2] = ' '

    tabuleiro[2][0] = 'o'
    tabuleiro[2][1] = ' '
    tabuleiro[2][2] = 'x'
    for linha in tabuleiro:
        print(linha)

tictactoe()