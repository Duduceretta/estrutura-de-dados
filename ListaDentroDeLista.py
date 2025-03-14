class Listas:
    def __init__(self, alunos):
        self.alunos = alunos

class ListaPrincipal:
    def __init__(self, listas):
        self.listas = listas

redes = Listas(['Jose', 'Bruno', 'Dudu', 'Yuri'])
iA = Listas(['Pedro', 'Jose', 'Miguel', 'Carlos'])
contador = 0

listaPrincipal = ListaPrincipal([redes, iA])
for lista in listaPrincipal.listas:
    for aluno in lista.alunos:
        if 'Jose' == aluno:
            contador = contador + 1
            print(f'O aluno Jose participa de {contador} materias')

