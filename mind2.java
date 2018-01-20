import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;
import java.lang.*;

public class mind2
{ int sum=0,count=0,j;
 private Scanner x1;
 private Formatter x;
  String name,comment;
  JFrame jf;
  JPanel jp,jp1;
  JTextArea jta;
   JTextArea ja=new JTextArea();
  JLabel jn=new JLabel("Enter your name >>");
  JScrollPane jsp,jsp1,jsp2;
  JButton[] jb=new JButton[4];
  JButton next,submit,done;
  JRadioButton[] jrb=new JRadioButton[4];
   ButtonGroup bg=new ButtonGroup();
  JDesktopPane dsp=new JDesktopPane();
  JInternalFrame jif;
RandomAccessFile file=null;
   public void external()
     {   count=0; sum=0;
         jf=new JFrame("Mental_age");
         jp=new JPanel(new GridLayout(3,4,100,100));

         jta=new JTextArea();  jta.setEditable(false);
         jsp=new JScrollPane(jta);
         jsp.setBounds(220,100,300,80);

         jta.setBounds(220,100,300,80);
         jta.setFont(new Font("serif",Font.ITALIC,18));
         jta.setText("Welcome to the game\nPlease Choose an option\nGame will include 10 questions\nEach of them with 4 choices.\nPlease Select any one of them.\n");
         //jf.add(jta);
   jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  // jf.setResizable(true);
   jf.setLayout(new BorderLayout());

jb[0]=new JButton("START");
jb[1]=new JButton("LAST PLAYER'S RESULT");
jb[2]=new JButton("HELP");
jb[3]=new JButton("EXIT");

    jb[0].setBounds(100,100,50,30);   jb[0].setToolTipText("Start the game");
    jb[1].setBounds(300,100,50,30);   jb[1].setToolTipText("Check Preious player's Record");
    jb[2].setBounds(100,280,50,30);   jb[2].setToolTipText("Need Some help");
    jb[3].setBounds(300,280,50,30);   jb[3].setToolTipText("You sure You wanna exit??");

 jb[0].addActionListener(new ActionListener()
     {  public void actionPerformed(ActionEvent e)
       {    jf.setSize(1100,900);
          start();
       }
     }
     );

jb[1].addActionListener(new ActionListener()
                           {  public void actionPerformed(ActionEvent e)
                                {  jf.setSize(1100,900);
                                   records();
                                  }
                            }
                        );
jb[2].addActionListener(new ActionListener()
                           {  public void actionPerformed(ActionEvent e)
                                { help(); }
                            }
                        );
jb[3].addActionListener(new ActionListener()
                           {  public void actionPerformed(ActionEvent e)
                                { exit();  }
                            }
                        );

 for(int i=0;i<5;i++)
 {   if(i==4)
      continue;
   jb[i].setFont(new Font("Serif",Font.PLAIN,18));
   jp.add(jb[i]);
 }
jf.add(jsp);
jf.add(jp);

jf.pack();
jf.setSize(700,520);
   jf.setVisible(true);

 }
public void start()
{
  count=count+1;  ja.setText("");   ja.setEditable(false);
  next=new JButton("Next>>");  
  jp1=new JPanel(new GridLayout(6,1,1,1));   
  jsp1=new JScrollPane(ja);
  jsp1.setBounds(0,200,510,300);
   jp1.setBounds(0,0,100,25);
         ja.setBounds(0,200,510,300);
         ja.setFont(new Font("serif",Font.PLAIN,30));


          switch(count)
       {
          case 1:

            ja.setText("\tQuestion 1 :\nChoose your favorite set of colors >>");
jrb[1]=new JRadioButton("Black,Grey,Brown");         
jrb[2]=new JRadioButton("Royal blue,Neon,Yellow");
jrb[0]=new JRadioButton("Mix,Skyblue,Pinkish red");         
jrb[3]=new JRadioButton("Light yellow,Light brown,Light grey");

           break;

          case 2:

             ja.setText("\tQuestion : 2\nChoose a meal >>");
 jrb[3]=new JRadioButton("Seafood");         
 jrb[2]=new JRadioButton("Takeaway food");
 jrb[0]=new JRadioButton("Fast food");         
 jrb[1]=new JRadioButton("Soup"); 
        break;

	  case 3:
             ja.setText("\tQuestion : 3\nChoose your drink to go with the meal>>");
 jrb[0]=new JRadioButton("Softdrink,Lemonade");         
 jrb[1]=new JRadioButton("Beer");
 jrb[3]=new JRadioButton("Redwine");         
 jrb[2]=new JRadioButton("Fruit Juice"); 
          break;

          case 4:
 ja.setText("\tQuestion : 4\n\tWhat would you like to watch now>>");
 jrb[3]=new JRadioButton("Documentary");         
 jrb[0]=new JRadioButton("Cartoons");
 jrb[2]=new JRadioButton("Action/Comedy");         
 jrb[1]=new JRadioButton("Drama/Thriller");  
          break;

	case 5:
             ja.setText("\tQuestion : 5\nWhat's your opinion on candy>>");
 jrb[0]=new JRadioButton("Love it");         
 jrb[2]=new JRadioButton("It's ok");
 jrb[1]=new JRadioButton("It's for kids");         
 jrb[3]=new JRadioButton("It's Unhealthy/ Avoid it"); 
          break;

         case 6:
             ja.setText("\tQuestion : 6\nWhat's your opinion on social media like twitter or facebook >>");
 jrb[2]=new JRadioButton("Useful");         
 jrb[1]=new JRadioButton("Waste of time");
 jrb[0]=new JRadioButton("Essential");         
 jrb[3]=new JRadioButton("Confused"); 	
  break;

        case 7:
             ja.setText("\tQuestion : 7\nWhat'll be your opinion on Smart phones>>");
 jrb[2]=new JRadioButton("Useful");         
 jrb[0]=new JRadioButton("Necessary");
 jrb[3]=new JRadioButton("Confusing");         
 jrb[1]=new JRadioButton("Expensive");          
   break;

        case 8:
             ja.setText("\tQuestion : 8\nHow would you like to celebrate your Birthday>>");
 jrb[3]=new JRadioButton("It's for kids");         
 jrb[1]=new JRadioButton("Meal with family");
 jrb[2]=new JRadioButton("Partying & Drinking");         
 jrb[0]=new JRadioButton("Birthday games & cakes");        
 break;

          case 9:
             ja.setText("\tQuestion : 9\nWhat's your opinion on classical music>>");
 jrb[1]=new JRadioButton("Relaxing");         
 jrb[0]=new JRadioButton("Hate it");
 jrb[3]=new JRadioButton("Love it");         
 jrb[2]=new JRadioButton("It's okay");        
 break;

         case 10:
             ja.setText("\tQuestion : 10\nWhat would your ideal vacation consist of>>");
 jrb[0]=new JRadioButton("Going to theme Park like DisneyLand");         
 jrb[1]=new JRadioButton("Beach /Hawaii/Spain");
 jrb[2]=new JRadioButton("Touring : Italy/New York");         
 jrb[3]=new JRadioButton("Experiencing new cultures");        
  break;
       }

jrb[0].addActionListener(new ActionListener()
            {  public void actionPerformed(ActionEvent be)
                {   
                   sum=sum+40;
                  
                 }
            });
jrb[1].addActionListener(new ActionListener()
            {  public void actionPerformed(ActionEvent be)
                {   
                   sum=sum+20;
   
                 }
            });
jrb[2].addActionListener(new ActionListener()
            {  public void actionPerformed(ActionEvent be)
                {   
                   sum=sum+30;
  
                 }
            });
jrb[3].addActionListener(new ActionListener()
            {  public void actionPerformed(ActionEvent be)
                {   
                   sum=sum+10;
   
                 }
            });

  
 next.setBounds(400,50,100,20);    next.setToolTipText("Next Question");    next.setFont(new Font("Serif",Font.ITALIC,40));
 next.addActionListener(new ActionListener()   
       { public void actionPerformed(ActionEvent e)
          {jif.dispose();
              if(count==10)
               { 
                  System.out.println("sum = "+sum+" count = "+count);
                addcomment(sum);
                }
               
             
            start();
           }
        });
 

 jp1.add(jsp1);  

         
 for(int i=0;i<4;i++)
  { bg.add(jrb[i]);
     jp1.add(jrb[i]);
   }
jp1.add(next);

  jif=new JInternalFrame("Here's the game!!");
  jif.setBounds(100,40,320,260);
  jif.setIconifiable(true);
  jif.setSize(800,600);
  jif.setClosable(true);
  //jif.setMaximizable(true);
  jif.setResizable(true);
  jif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  jif.setVisible(true);
   //jif.pack();

  //  jif.add(ja);  
  // jif.add(next);

  //jif.add(prev);
             //jif.add(jsp1);
  jif.add(jp1);    
  dsp.add(jif);
  jf.add(dsp);
   jf.setContentPane(dsp);
   dsp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
   //jif.add(jrb[0]);   jif.add(jrb[1]);   jif.add(jrb[2]);   jif.add(jrb[3]);

}
public void addcomment(int score)
{
     if(score>=350&&score<=400)
      comment="your mental age is between 4 to 9 years.\nWith a childish nature,you can find joy,\namusement from simplest of things.";
      
    else if(score>=300&&score<=340)
      comment="you have a teenager's mind.\nFairly immature & can sometimes rebel against the normal one's.\nYou're a quirky character";
      
    else if(score>=250&&score<=290)
       comment="your mental age is between 16 to 21 years.\nYou know when to act maturely but also knows how to have fun.\nYou can act immature & seriously whenever you see fit";
     
    else if(score>=200&&score<=240)
      comment="your mental age is between 21 to 29 years.\nYou've a young adult's mind acting mature most of the time & knows \nwhen to be serious.Intelligent & self aware.";
    else if(score>=150&&score<=190)
       comment="your mental age is between 29 to 55 years.\nYou are a mature adult.Modest & noble with good manners.\nEqually good etiquette.You have all the properties to become a Connoisseur";
       
    else if(score>=100&&score<=140)
       comment="your mental age is above 55,man that's old .\nYou appreciate simple things & \nare not bothered with your environment being modern. ";
    
    else
     { comment="Maybe next time";
         exit();
       }
   JTextArea jj=new JTextArea(); 
  done=new JButton("Done ");
  submit=new JButton("SUBMIT"); 
      jp1=new JPanel(new GridLayout(4,1,1,1));
  jsp1=new JScrollPane(jj);
  jsp1.setBounds(100,400,300,80);
   
         jj.setBounds(100,400,300,80);      
         jj.setFont(new Font("serif",Font.ITALIC,40));  jn.setFont(new Font("serif",Font.BOLD+Font.ITALIC,30));
         submit.setFont(new Font("vandana",Font.ITALIC+Font.BOLD,28));
          
        submit.addActionListener(new ActionListener()   
       { public void actionPerformed(ActionEvent e)
          {    name=jj.getText();
                jif.dispose();     
            System.out.println(name);
               
              show();  return;
            }
        });
   jp1.add(jn);
  jp1.add(jsp1);
   jp1.add(submit);

  jif=new JInternalFrame("Enter your name >>");
  jif.setBounds(100,40,320,260);
  jif.setIconifiable(true);
  jif.setSize(800,600);
  jif.setClosable(true);
  
  //jif.setResizable(true);
  jif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  jif.setVisible(true);
     
     jif.add(jp1);
  dsp.add(jif);
  jf.add(dsp);
   jf.setContentPane(dsp);
   dsp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
  
    
}
public void show()
{  JTextArea jj=new JTextArea(); 
  done=new JButton("Done ");
   
  jp1=new JPanel(new GridLayout(4,1,1,1));
  jsp1=new JScrollPane(jj);
  jsp1.setBounds(100,400,300,80);
   
         jj.setBounds(100,400,300,80);      
         jj.setFont(new Font("serif",Font.ITALIC,20));  jn.setFont(new Font("serif",Font.BOLD+Font.ITALIC,30));
         jn.setText("Result >>");
         jj.setText("  "+name+"  ,"+comment);
       
         jj.setEditable(false);
         
          
        done.addActionListener(new ActionListener()   
       { public void actionPerformed(ActionEvent e)
          {  jif.dispose();
             jf.dispose();
             addrecord();
             external();            }
        });
   jp1.add(jn);
   jp1.add(jsp1);
   jp1.add(done);

  jif=new JInternalFrame("Done !!");
  jif.setBounds(100,40,320,260);
  jif.setIconifiable(true);
  jif.setSize(800,600);
  jif.setClosable(true);
  
  //jif.setResizable(true);
  jif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  jif.setVisible(true);
     
     jif.add(jp1);
  dsp.add(jif);
  jf.add(dsp);
   jf.setContentPane(dsp);
   dsp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
 
}
public void addrecord()
 { open(); 
  try
   { 
    x.format("%s %d %s\n",name,sum,comment);
    
    }catch(Exception e){System.out.println(e);}
   close();
}
 public void open()
 { try
   {x=new Formatter("records.txt"); 
    }catch(Exception e){System.out.println(e);}
}
 public void close()
 { try
   {x.close();
      }catch(Exception e){System.out.println(e);}
 }
public void records()
{ JTextArea jj=new JTextArea("");  
    jsp2=new JScrollPane(jj);     
    jp1=new JPanel(new GridLayout(2,1,1,1)); jp1.setBounds(100,400,100,50); 
      JButton bm=new JButton("<< Back to Menu");
     bm.setBounds(100,400,100,50);  
   bm.setToolTipText("Back to Main Menu");   bm.setFont(new Font("Serif",Font.ITALIC,30));
 bm.addActionListener(new ActionListener()   
       { public void actionPerformed(ActionEvent e)
          { jif.dispose();
            jf.dispose();
              external();
           }
        });
 

    try
{ x1=new Scanner(new File("records.txt"));
      while(x1.hasNextLine())
         { String Line=x1.nextLine();
           jj.append(Line);
                     }
  }
catch(Exception e){System.out.println(e);}
 jsp2.setBounds(0,0,100,150);
  
         jj.setEditable(false);
         jj.setBounds(0,0,800,300);
         jj.setFont(new Font("serif",Font.BOLD,30));
         jj.setEditable(true);
  jif=new JInternalFrame("Here's the game!!");
  jif.setBounds(50,40,400,300);
  jif.setIconifiable(true);
  jif.setSize(800,600);
  jif.setClosable(true);
  
  jif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  jif.setVisible(true);

  jp1.add(jsp2);
   
    jp1.add(bm);
   // jif.add(jj);
   jif.add(jp1);
  dsp.add(jif);
  jf.add(dsp);
   jf.setContentPane(dsp);
  dsp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
}
  public void help()
  { JTextArea jj=new JTextArea();  
    jsp2=new JScrollPane(jj);     
    jp1=new JPanel(new GridLayout(2,1,1,1));
      JButton bm=new JButton("<< Back to Menu");
     bm.setBounds(100,100,10,10);  
   bm.setToolTipText("Back to Main Menu");   bm.setFont(new Font("Serif",Font.ITALIC,30));
 bm.addActionListener(new ActionListener()   
       { public void actionPerformed(ActionEvent e)
          { jif.dispose();
            jf.dispose();
              external();
           }
        });
      
  jsp2.setBounds(0,0,600,150);
  
         jj.setEditable(false);
         jj.setBounds(0,0,400,150);
         jj.setFont(new Font("serif",Font.PLAIN,18));
         jj.setText("\t>>~~HELP MENU~~\n=>>You must be aware of your age.\n=>>But that's the age of your body ,a physical entity.\n=>>This is a game to calculate your mental age.\n=>>Here you'll be facing 10 Questions.Each of them is assigned a certain amount.\n=>>At the end of the game: \nYour mental age with a comment will be displayed.");

  jif=new JInternalFrame("Here's the game!!");
  jif.setBounds(50,40,400,300);
  jif.setIconifiable(true);
  jif.setSize(550,440);
  jif.setClosable(true);
  //jif.setMaximizable(true);
  //jif.setResizable(true);
  jif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  jif.setVisible(true);

   jp1.add(jsp2);
   jp1.add(bm);
   jif.add(jp1);
  dsp.add(jif);
  jf.add(dsp);
   jf.setContentPane(dsp);
  dsp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

}
  public void exit()
  {  jf.dispose();
     return ;
   }


 public static void main(String args[])
   {  mind2 m=new mind2();
                m.external();

   }
}
