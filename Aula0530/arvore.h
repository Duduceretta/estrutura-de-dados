typedef struct no{
    int dado;
    struct no *esq;
    struct no *dir;
} Arvore;

Arvore *inserir(int valor, Arvore *raiz){
    if (raiz) //percurso pre-fixado ou RED
    {
        //percorer para a esquerda ou para a direita
        if(valor < raiz->dado){
            //ir para a esq
            raiz->esq = inserir(valor, raiz->esq);
        }else
        {
            //ir para a dir
            raiz->dir = inserir(valor, raiz->dir);
        }
        return raiz;
    } else
    {
        Arvore *novo = (Arvore*)malloc(sizeof(Arvore));
        novo->dado = valor;
        novo->esq = NULL;
        novo->dir = NULL;
        return novo;   
    }
}

void exibirOrdenado(Arvore *raiz){
    if (raiz) { //percurso in-fixado ou ERD
        cout << raiz->dado << "\t";
        exibirOrdenado(raiz->esq);
        exibirOrdenado(raiz->dir);
    }
}

int contar(Arvore *raiz){
    if (raiz)
    {
        return 1 + contar(raiz->esq) + contar(raiz->dir);
    }
    return 0;
}

int somar(Arvore *raiz){
    if (raiz)
    {
        return raiz->dado + somar(raiz->esq) + somar(raiz->dir);
    }
    return 0;
}

int contarPares(Arvore *raiz){
    if (raiz)
    {
        if (raiz->dado % 2 == 0)
        {
            return 1 + contarPares(raiz->esq) + contarPares(raiz->dir);
        }
        return 0 + contarPares(raiz->esq) + contarPares(raiz->dir);
    }
    return 0;
}

int contarFolhas(Arvore *raiz){
    if (raiz)
    {
        if (raiz->esq == NULL && raiz->dir == NULL)
        {
            return 1;
        }
        return contarFolhas(raiz->esq) + contarFolhas(raiz->dir);
    }
    return 0;
}

void exibirFolhas(Arvore *raiz){
    if (raiz)
    {
        if (raiz->esq == NULL && raiz->dir == NULL)
        {
            cout << raiz->dado + " é folha" << endl;
        }
        exibirFolhas(raiz->esq);
        exibirFolhas(raiz->dir);
    }
}

int localizar(int valor, Arvore *raiz){
    if (raiz){
        if (raiz->dado == valor){
            return 1;
        } else if (valor < raiz->dado){
            return localizar(valor, raiz->esq);
        } else {
            return localizar(valor, raiz->dir);
        }
    }
    return 0;
}
