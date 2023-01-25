 # include <stdio.h>
# include <math.h>



int conversao(int m){
printf ("Valor do em decimetros: %d \n" , m * 10);

printf ("Valor em centimetros: %d \n" , m * 100);

printf ("Valor em milimetros: %d \n" , m * 1000);
}

int main () {
int m;

printf ("Digite a medida em metros: ");
scanf("%d", &m);

conversao(m);
return 0;
}



