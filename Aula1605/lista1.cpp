#include <iostream>
using namespace std;

#include "lista.h"

int main() {
    Celula *lista = NULL;

    lista = inserir(7, lista);
    lista = inserir(10, lista);
    lista = inserir(5, lista);
    lista = inserir(12, lista);
    lista = inserir(5, lista);
    lista = inserir(10, lista);
    lista = inserir(999, lista);
    lista = inserir(10, lista);
    lista = inserir(10, lista);
    lista = inserir(25, lista);

    int tamanho = contarLista(lista);

    cout << "lista contem: " << contarLista(lista) << endl;
    exibir(lista);

    int numero = 10;
    //cout << "Digite numero para pesquisa: " << endl;
    //cin >> numero;

    cout << numero << " esta na lista?: " << estaNaLista(numero, lista) << endl;
    
    cout << numero << " ocorrencias na lista?: " << contarOcorrencia(numero, lista) << endl;
    
    cout << "Media da lista?: " << mediaLista(tamanho, lista) << endl;


    return 1;
}