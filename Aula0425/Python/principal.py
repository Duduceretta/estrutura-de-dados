from processo import Processo
from collections import deque
from random import randrange

class Principal:
    def gerar_processos_em_filas(fila_normal, fila_prioritaria, quantidade_processos):
        for i in range(quantidade_processos):
            numero_processo_gerado = randrange(0, 1001)
            if numero_processo_gerado == 0:
                #Rotina para tirar da fila prioritaria
                print('Atendendo: ' + repr(fila_prioritaria.popleft()))
            elif numero_processo_gerado == 500:
                #Rotina para tirar da fila normal
                print('Atendendo: ' + repr(fila_normal.popleft()))
            else:
                if numero_processo_gerado < 500:
                    processo_tmp = Processo(numero_processo_gerado, 'Processo de alta prioridade')
                    if processo_tmp not in fila_prioritaria:
                        fila_prioritaria.append(processo_tmp)
                        print(processo_tmp)
                else:
                    processo_tmp = Processo(numero_processo_gerado, 'Processo de baixa Prioridade')
                    if processo_tmp not in fila_normal:
                        fila_normal.append(processo_tmp)
                        print(processo_tmp)


    def exibir_processos_nao_atendidos(fila, frase):
        print(frase)
        print(f'Total de processos nao atendidos: {len(fila)}')

        for processo in fila:
            print(processo)

    fila_prioritaria = deque()
    fila_normal = deque()
    quantidade_processos = 500

    gerar_processos_em_filas(fila_normal, fila_prioritaria, quantidade_processos)
    exibir_processos_nao_atendidos(fila_normal, 'fila normal')
    exibir_processos_nao_atendidos(fila_prioritaria, 'fila prioritaria')
