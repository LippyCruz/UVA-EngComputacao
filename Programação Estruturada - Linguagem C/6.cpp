 # include <stdio.h>
# include <math.h>

/* a altura no caso seria um dos catetos, entao não incluí*/

int delta(int a, int b, int c){
int d = pow(b ,2) - (4*a*c);

printf ("Valor de delta: %d", d);
}


int main () {
int a, b, c;

printf ("Digite o valor de a: ");
scanf("%d", &a);

printf ("Digite o valor de b: ");
scanf("%d", &b);

printf ("Digite o valor de c: \n ");
scanf("%d", &c);

delta(a, b, c);

return 0;
}



