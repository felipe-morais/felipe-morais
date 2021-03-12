#include <stdio.h>
#include "listadupla.h"
int main(int argc, char *argv[]){
   struct ListaDupla lista;
   
   create(&lista);
   
   inserir(&lista, 83);
   inserir(&lista, 67);
   inserir(&lista, 14);
   inserir(&lista, 99);
   
   exibirNaOrdem(&lista);
   return 0;
}