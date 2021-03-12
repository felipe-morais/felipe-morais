#include <stdio.h>
#include <stdlib.h>
#include "Pilha.h"

int main()
{
    int valor, resto;
    struct Pilha p;
    create(&p);

    printf("Digite um valor ai velhinho...");
    scanf("%d", &valor);

    while (valor != 0)
    {
        resto = valor % 2;
        push(&p, resto);
        valor = valor / 2;
    }

    while (!isEmpty(p))
    {
        resto = pop(&p);
        printf("%d ",resto);
    }
    printf("\n\nFim do Programa!\n\n");
    return 0;
}
