 # include <stdio.h>
# include <math.h>

/* a altura no caso seria um dos catetos, entao não incluí*/

int conversao(int c){
float f = 32 + (1.8 * c);

printf ("Temperatura convertida para Fahrenheit: %d", int (f));
}


int main () {
int c;

printf ("Digite a temperatura em Celsius: ");
scanf("%d", &c);

conversao(c);
return 0;
}



