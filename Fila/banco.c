#include <stdio.h>
#include "fila.h"

int main(int argc, char *argv[])
{

    struct Fila f;
    int elemento;

    create(&f); // criei a fila para ser vazia

    // algumas insercoes
    inserir(&f, 345);
    inserir(&f, 917);
    inserir(&f, 14);
    inserir(&f, 872);
    inserir(&f, 5763);
    inserir(&f, 2);

    printf("Bem vindos ao IsiBank - aqui seu $$ rende mais\n");
    printf("-------- ATENDIMENTO -------------------------\n");

    while (!isEmpty(f))
    {
        elemento = retirar(&f);
        printf("Numero da senha a ser atendida %d\n", elemento);
    }

    return 0;
}