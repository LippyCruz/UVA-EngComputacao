 # include <stdio.h>
# include <math.h>

/* a altura no caso seria um dos catetos, entao não incluí*/

int dif(int h1, int m1, int s1, int h2, int m2, int s2){
h1 = h1 * 3600;
h2 = h2 * 3600;
m1 = m1 * 60;
m2 = m2 * 60;
int hf = abs (h1 - h2);
int mf = abs (m1 - m2);
int sf = abs(s1 - s2);

printf ("Tempo de diferença: %d:%d:%d", hf/3600,mf/60,sf);
}


int main () {
int h1, m1, s1, h2, m2, s2;

printf("Horario 1: \n");
printf ("Digite a hora: ");
scanf("%d", &h1);

printf ("Digite os minutos: ");
scanf("%d", &m1);

printf ("Digite os segundos: ");
scanf("%d", &s1);

printf("Horario 2: \n");

printf ("Digite a hora: ");
scanf("%d", &h2);

printf ("Digite os minutos: ");
scanf("%d", &m2);

printf ("Digite os segundos: ");
scanf("%d", &s2);

dif(h1, m1, s1, h2, m2, s2);

return 0;
}



