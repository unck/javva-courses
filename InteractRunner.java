import java.util.Scanner;;
public class InteractRunner{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            Calculating calc = new Calculating();
            String exit = "no";
            while(!exit.equals("yes")){
                System.out.println("enter first arg");
                String first = input.next();
                System.out.println("enter second arg");
                String second = input.next();

                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result: " + calc.getResult() );
                calc.reset();
                System.out.println("Exit? yes/no");
                exit = input.next();
            }
        }
        finally{
            input.close();
        }


    }
}