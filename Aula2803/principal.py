from aluno import Aluno

class principal:
    alunos = []
    matricula = 1
    while True:
        nome = str(input('Nome: ')).capitalize()
        tmp = Aluno(matricula, nome)

        if tmp in alunos:
            print('Aluno ja cadastrado')
        else:
            alunos.append(tmp)
            print('Aluno cadastrado com a matricula', matricula , 'e email ', tmp.email)
            matricula += 1
            
        opcao = input('Continuar (1 - Sim, Outra tecla - Nao)')
        if opcao != '1':
            break

    alunos.sort(key=lambda aluno: aluno.nome)
    print('Relacao alunos')
    for aluno in alunos:
        print(aluno)
