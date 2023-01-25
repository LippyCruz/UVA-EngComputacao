 # include <stdio.h>
# include <math.h>

float e;

float porcentual(float b, float n , float v){
int p = int (( b / e) * 100);

printf ("porcentual de votos brancos: %d \n" , p);
p = int (( n / e) * 100);
printf ("porcentual de votos nulos: %d \n" , p);
p = int (( v / e) * 100);
printf ("porcentual de votos validos: %d \n" , p);


}

int main () {
float b,n,v;

printf ("Digite o numero de eleitores: ");
scanf("%f", &e);
printf ("Digite o numero de votos brancos: ");
scanf("%f", &b);
printf ("Digite o numero de votos nulos: ");
scanf("%f", &n);
printf ("Digite o numero de votos validos: ");
scanf("%f", &v);

porcentual(b, n, v);


return 0;
}



