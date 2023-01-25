 # include <stdio.h>
# include <math.h>

/* a altura no caso seria um dos catetos, entao não incluí*/

float calc(int a , int b, float c){


printf ("O dobro da diferenca dos dois ultimos: %f \n ", 2*(b - c) );

printf ("A media entre os tres: %f \n", (a + b + c) /3 );

printf ("A metade da soma entre os dois primeiros: %f \n", (float (a) + float (b) )/ 2);
}


int main () {

int a, b, c;


printf ("Digite o primeiro valor: ");
scanf("%d", &a);

printf ("Digite o segundo valor: ");
scanf("%d", &b);

printf ("Digite o terceiro valor: ");
scanf("%d", &c);

calc(a,b,c);

return 0;
}



