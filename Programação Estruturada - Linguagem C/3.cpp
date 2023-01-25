 # include <stdio.h>
# include <math.h>



int reajuste(float s, float r){
r = (r/100);
return (int (s + (s*r)));

}

int main () {
float s, r;

printf ("Digite o salario: ");
scanf("%f", &s);
printf ("Digite o porcentual de reajuste: ");
scanf("%f", &r);


printf ("Valor do novo salario: %d \n" , reajuste(s, r));


return 0;
}



