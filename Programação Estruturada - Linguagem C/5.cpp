 # include <stdio.h>
# include <math.h>

/* a altura no caso seria um dos catetos, entao não incluí*/

int dados(int c, int ct){
int h = (pow (c, 2) + pow (ct , 2));
h = sqrt(h);

int a = (ct * ct) /2;



printf ("Valor da hipotenusa: %d \n", h );

printf ("Valor da area: %d \n", a);

printf ("Valor do perimetro: %d \n" , (ct + c + h));
}


int main () {
int c1, c2;

printf ("Digite o valor do primeiro cateto: ");
scanf("%d", &c1);

printf ("Digite o valor do segundo cateto: ");
scanf("%d", &c2);
dados(c1 , c2);
return 0;
}



