#include <iostream>
#include <stdlib.h>

using namespace std;

#include "arvore.h"

int main(){
    Arvore *arvore = NULL;

    arvore = inserir(50, arvore);
    arvore = inserir(35, arvore);
    arvore = inserir(40, arvore);
    arvore = inserir(60, arvore);

    cout << "Total de elementos " << contar(arvore) << endl;
    cout << "Total de Pares " << contarPares(arvore) << endl;
    cout << "Total de Folhas " << contarFolhas(arvore) << endl;
    exibirFolhas(arvore);
    cout << "Localizado " << localizar(36, arvore) << endl;

    exibirOrdenado(arvore);

    return 1;
}




