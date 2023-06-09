import java.util.Scanner;

public class Main{
    private static card Kart[][]=new card[4][4];

    public static boolean IsGameOver(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                if(Kart[i][j].CardStatusInfo()==false){
                    return false;
                }
              
            }
        }
        return true;
    }
    public static void guess(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.guessini gir:");
        int i1=scanner.nextInt();
        int j1=scanner.nextInt();
        Kart[i1][j1].setCardStatus(true);
        print();
        
        System.out.println("2.guessi gir:");
        int i2=scanner.nextInt();
        int j2=scanner.nextInt();
        Kart[i2][j2].setCardStatus(true);
        print();

        if(Kart[i1][j1].getValue()==Kart[i2][j2].getValue()){
            Kart[i2][j2].setCardStatus(true);
            
        }
        else{
            Kart[i1][j1].setCardStatus(false);
            Kart[i2][j2].setCardStatus(false);
        }
    
        print();

        


    }

    public static void print(){
        
        System.out.println("***************");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(Kart[i][j].CardStatusInfo())
                {
                System.out.print(" |"+Kart[i][j].getValue()+"| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
            
        }
        System.out.println("***************");

    }
    public static void main(String[] args){
        Kart[0][0]=new card(1);
        Kart[0][1]=new card(2);
        Kart[0][2]=new card(3);
        Kart[0][3]=new card(4);
        Kart[1][0]=new card(2);
        Kart[1][1]=new card(3);
        Kart[1][2]=new card(1);
        Kart[1][3]=new card(4);
        Kart[2][0]=new card(5);
        Kart[2][1]=new card(6);
        Kart[2][2]=new card(8);
        Kart[2][3]=new card(7);
        Kart[3][0]=new card(8);
        Kart[3][1]=new card(5);
        Kart[3][2]=new card(6);
        Kart[3][3]=new card(7);
        
        while(IsGameOver()==false)
        {
            guess();
        }
        

        
        
    }


}