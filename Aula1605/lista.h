#include <cstdlib>

typedef struct no {
    int dado;
    struct no *prox;
} Celula;

int estaNaLista(int numero, Celula *lista) {
    for (Celula *p = lista; p != NULL; p = p->prox) {
        if (numero == p->dado){
            return true;
        }
    }
    return false;
}

Celula *inserir(int dado, Celula *lista) {
    //alocar memória
    Celula *novo = (Celula *)malloc(sizeof(Celula));

    //depositar valores que vem do parâmetro
    novo->dado = dado;
    novo->prox = NULL;

    //testar se é o primeiro elemento a ser inserido
    if (!lista) { //if (lista == NULL)
        return novo;
    }

    // alterar ou inserir para que controle duplicados - proiba os duplicados
    cout << dado << endl;
    if (estaNaLista(dado, lista))
    {
        cout << "Dado ja existente" << endl;
    } else{
        // percorrer a estrutura até o final
        Celula *p;
        for (p = lista; p->prox != NULL; p = p->prox)

        //encadear e retornar
        p->prox = novo;
        cout << "Dado inserido" << endl;

    }

    return lista;
}

void exibir(Celula *lista) {
    for (Celula *p = lista; p != NULL; p = p->prox) {
        cout << p->dado << "\t";
    }
    cout << endl;
}

int contarLista(Celula *lista) {
    int total = 0;
    for (Celula *p = lista; p != NULL; p = p->prox) {
        total++;
    }
    return total;
}

//contar ocorrencias
int contarOcorrencia(int numero, Celula *lista) {
    int ocorrencias = 0;
    for (Celula *p = lista; p != NULL; p = p->prox) {
        if (numero == p->dado){
            ocorrencias++;
        }
    }
    return ocorrencias;
}

//verificar se a lista esta ou nao ordenada

//media dos elementos
float mediaLista(int tamanho, Celula *lista) {
    float media = 0;
    for (Celula *p = lista; p != NULL; p = p->prox) {
        media = media + p->dado;
    }
    return media / tamanho; 
}

