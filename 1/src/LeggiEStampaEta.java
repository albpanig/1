import java.io.*;

public class LeggiEStampaEta
{
    public static void main (String args[])
    {
        // Impostazione per lo standard inputttttttttttttttt
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(input);
        int Eta;
        String TestoLetto;
        
        try {
               System.out.print("Digita la tua eta': ");
               TestoLetto=Tastiera.readLine();
               Eta=Integer.valueOf(TestoLetto).intValue();
        }
        catch (Exception e)
        {
            System.out.println("\nNon hai digitato un numero!");
            return;
        }
        System.out.println("La tua eta' e': " + Eta);
    }
}