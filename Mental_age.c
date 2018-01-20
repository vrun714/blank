#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<ctype.h>
#include<dos.h>
#include<windows.h>
struct pl
{ char name[50];
 int score;
 char comment[1000];
};
FILE *fp;
void start();
void records();
void help();
void result(int );
int main()
{
 while(1)
  {   system("cls");
      system("color 1f");
  printf("\t\tGame to calculate your mental age");
  printf("\n\t>>Press S to start the game.\n\t>>Press R to check the records.\n\t>>Press H for Help menu.\n\t>>Press E to exit.\nEnter your Response : ");
  switch(toupper(getch())) //from ctype.h to convert 'q' to'Q'
  {
    case 'S':
     start();
     break;
    case 'R':
     records();
     break;
    case 'H':
     help();
     break;
    case 'E':
     fclose(fp);
      exit(1);
      break;
    default:
     puts("Please Enter a valid response.");
     break;
  }
  }
  return 0;
}
void help()
{ system("cls");
     system("color 3f");
  printf("\t\t>>~~HELP MENU~~");
  printf("\n=>>You must be aware of your age.\n=>>But that's the age of your body ,a physical entity.\n=>>This is a game to calculate your mental age.");
  printf("\n=>>You'll be facing 10 Questions.Each of them is assigned a certain amount.");
  printf("\n=>>At the end of the game,your score will be added & your mental age with a comment will be displayed.");

  printf("**Enter  any key to go back to the main Menu.");
  getch();
}
void start()
{ int ans=0,score=0;
system("cls");
system("color 4f");
printf("\t\t\tLet's begin\n\tEnter 1 for option 1,,2 for option 2 & so on..& Press Enter Key\n\tAlso know that the default choice is 4\nIf you didn't select from 1,2 or 3\nIt'll be automatically choosen as option 4\n\t\t Now then Here you go :-");

printf("\n\nQuestion : 1\n\tChoose your favorite set of Colours >>\n1.Black,Grey,Brown\t\t2.Royal blue,Neon,Yellow\n3.Mix,Sky blue,Pinkish red\t4.Light yellow,Light brown,Light grey");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=20;
  else if(ans==2)
    score+=30;
  else if(ans==3)
    score+=40;
  else
    score+=10;


    system("cls");
    printf("\n\nQuestion : 2\n\tChoose a meal >>\n1.Seafood\t\t2.Takeaway food\n3.Fast food\t\t4.Soup");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=10;
  else if(ans==2)
    score+=30;
  else if(ans==3)
    score+=40;
  else
    score+=20;


    system("cls");
    printf("\n\nQuestion : 3\n\tChoose your drink to go with the meal>>\n1.Softdrink,lemonade\t\t2.Beer\n3.Redwine\t\t\t4.Fruit juice");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=40;
  else if(ans==2)
    score+=20;
  else if(ans==3)
    score+=10;
  else
    score+=30;


    system("cls");
    printf("\n\nQuestion : 4\n\tWhat would you like to watch now>>\n1.Documentary\t\t2.Cartoons\n3.Action/Comedy\t\t4.Drama/Thriller");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=10;
  else if(ans==2)
    score+=40;
  else if(ans==3)
    score+=30;
  else
    score+=20;



    system("cls");
    printf("\n\nQuestion : 5\nWhat's your opinion on candy>>\n1.Love it\t\t2.It's ok \n3.It's for kids\t\t4.it's unhealthy/avoid");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=40;
  else if(ans==2)
    score+=30;
  else if(ans==3)
    score+=20;
  else
    score+=10;



    system("cls");
    printf("\n\nQuestion : 6\n\tWhat's your opinion on social media like twitter or facebook >>\n1.Useful\t\t2.Waste of time\n3.Essential\t\t4.Confused");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=30;
  else if(ans==2)
    score+=20;
  else if(ans==3)
    score+=40;
  else
    score+=10;



    system("cls");
    printf("\n\nQuestion : 7\n\tWhat'll be your opinion on Smart phones>>\n1.Useful\t\t2.Necessary\n3.Confusing\t\t4.Expensive");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=30;
  else if(ans==2)
    score+=40;
  else if(ans==3)
    score+=10;
  else
    score+=20;


    system("cls");
    printf("\n\nQuestion : 8\n\tHow would you like to celebrate your Birthday>>\n1.It's for kids\t\t2.Meal with family\n3.Partying & Drinking\t4.Birthday games & cakes");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=10;
  else if(ans==2)
    score+=20;
  else if(ans==3)
    score+=30;
  else
    score+=40;



    system("cls");
    printf("\n\nQuestion : 9\n\tWhat's your opinion on classical music>>\n1.Relaxing\t\t2.Hate it\n3.Love it\t\t4.It's okay'");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=20;
  else if(ans==2)
    score+=40;
  else if(ans==3)
    score+=10;
  else
    score+=30;



    system("cls");
    printf("\n\nQuestion : 10\n\tWhat would your ideal vacation consist of>>\n1.Going to theme park like Disneyland\t\t2.Beach/Hawaii/Spain\n3.Touring :Italy/New York\t\t4.Experiencing new cultures");
printf("\nEnter your choice :");
scanf("%d",&ans);
  if(ans==1)
    score+=40;
  else if(ans==2)
    score+=30;
  else if(ans==3)
    score+=20;
  else
    score+=10;


    system("cls");
    printf("\nOk.You're done.Press any key to check your score ! ",score);
    getch(); fflush(stdin);
    result(score);
}
void result(int score)
{   char nm[50]; struct pl p;
fp=fopen("scorecard.txt","rb+");
 if(fp==NULL)
    { fp=fopen("scorecard.txt","wb+");
       if(fp==NULL)
        {printf("Can't open the file");
            exit(1);}
    }

system("cls");
fseek(fp,0,SEEK_END);
system("color 2f");
printf("Enter your name : ");
scanf("%s",&nm);
strcpy(p.name,nm);
 p.score=score;
    if(score>=350&&score<=400)
      { printf("%s your mental age is between 4 to 9 years with a childish nature,you can find joy & amusement from simplest of things.",nm);

      strcpy(p.comment,"Your mental age is between 4 to 9 years with a childish nature,you can find joy & amusement from simplest of things.");
      fwrite(&p,sizeof(p),1,fp);
      }
    else if(score>=300&&score<=340)
       { printf("%s you have a teenager's mind,fairly immature & can sometimes rebel against the normal one's.you're a quirky character",nm);
      strcpy(p.comment,"You have a teenager's mind,fairly immature & can sometimes rebel against the normal one's.you're a quirky character");
       fwrite(&p,sizeof(p),1,fp);
       }
    else if(score>=250&&score<=290)
      {  printf("%s your mental age is between 16 to 21 years.U know when to act maturely but also knows how to have fun.You can act immature & seriously whenever you see fit",nm);
     strcpy(p.comment,"Your mental age is between 16 to 21 years.U know when to act maturely but also knows how to have fun.You can act immature & seriously whenever you see fit");
       fwrite(&p,sizeof(p),1,fp);
      }
    else if(score>=200&&score<=240)
       { printf("%s your mental age is between 21 to 29 years.You've a young adult's mind acting mature most of the time & know when to be serious,Intelligent & self aware.",nm);
      strcpy(p.comment,"Your mental age is between 21 to 29 years.You've a young adult's mind acting mature most of the time & know when to be serious,Intelligent & self aware.");
       fwrite(&p,sizeof(p),1,fp);
        }
    else if(score>=150&&score<=190)
       { printf("%s your mental age is between 29 to 55 years.You are a mature adult.Modest & noble with good manners & equally good etiquette.You have all the properties to become a Connoisseur",nm);
      strcpy(p.comment,"Your mental age is between 29 to 55 years.You are a mature adult.Modest & noble with good manners & equally good etiquette.You have all the properties to become a Connoisseur");
       fwrite(&p,sizeof(p),1,fp);
       }
    else if(score>=100&&score<=140)
       { printf("%s your mental age is above 55,Man that's old .You appreciate simple things & are not bothered with your environment being modern. ",nm);
     strcpy(p.comment,"your mental age is above 55,Man that's old .You appreciate simple things & are not bothered with your environment being modern. ");
     fwrite(&p,sizeof(p),1,fp);
        }
    else
       { printf("\nThere was some problem.Please restart the game.Thankx");
         exit(0);
       }

    fflush(stdin);
    fclose(fp);
    printf("\nThank you for participating!\nPress Any key to exit!");
    getch();
}
void records()
{  system("color cf");
      int i=1;
   struct pl p;
      fp=fopen("scorecard.txt","rb+");
    if(fp==NULL)
    {
        fp=fopen("scorecard.txt","wb+");
        if(fp==NULL)
       {
         printf("Can't open the file");
            exit(1);
       }
    }
    rewind(fp);
while(fread(&p,sizeof(p),1,fp)==1)
{
     printf("\n\tRECORD NO %d : ",i);
       printf("\nName=%s \tScore=%d\nComment : %s",p.name,p.score,p.comment);
    i++;

}
fclose(fp);
 printf("\nAt the end Enter any key");
 getch();
    system("cls");
}
