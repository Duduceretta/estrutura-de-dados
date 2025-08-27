equipes = {}

while True:
    nome = input('Nome da equipe: ').upper()
    cidade = input('Cidade da equipe: ').upper()

    if nome not in equipes.keys():
        equipes['nome'] = cidade
    else:
        print('Equipe ja cadastrada...')
    opcao = int(input('1 para continuar '))

    if opcao != 1:
        break

for chave, valor in equipes.items():
    print(f'Chave {chave}, Valor: {valor}')
