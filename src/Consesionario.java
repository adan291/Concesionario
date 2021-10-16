import java.util.*;
public class Consesionario {
    public static void main(String[] args) {
        ArrayList<Coche> listCoches = new ArrayList<>();
        String entradaTeclado ;
        int nCoches;
        boolean numeric;
        Scanner entradaEscaner = new Scanner (System.in);

        System.out.println ("Cuantos coches quieres?: ");

        entradaTeclado = entradaEscaner.nextLine ();
        numeric =  entradaTeclado.matches("[+-]?\\d*(\\.\\d+)?");

        while (!numeric) {
            System.out.println ("No puedes meter letras");
            System.out.println ("Cuantos coches quieres?: ");
            entradaTeclado = entradaEscaner.nextLine ();
            numeric =  entradaTeclado.matches("[+-]?\\d*(\\.\\d+)?");
        }

        nCoches = Integer.parseInt(entradaTeclado);

        for ( int i=0; i<nCoches; i++ ){
             String marca ;
             String modelo ;
            int ano = 1999;
             String anoText;
             String matricula ;

            System.out.println ("Dime la marca para el coche " + (i+1) + ": ");
            marca = entradaEscaner.nextLine ();

            System.out.println ("Dime el modelo para el coche " + (i+1) + ": ");
            modelo = entradaEscaner.nextLine ();

            System.out.println ("Dime el ano para el coche " + (i+1) + ": ");
            anoText = entradaEscaner.nextLine ();
            if(!anoText.equals("")){
                ano = Integer.parseInt(anoText);
            }


            System.out.println ("Dime la matricula para el coche " +(i+1) + ": ");
            matricula = entradaEscaner.nextLine ();

            if(comprobarValores(marca, modelo, ano, matricula)){
                Coche coche = new Coche(marca, modelo, ano, matricula);
                listCoches.add(coche);
            } else {
                Coche coche = new Coche();
                listCoches.add(coche);
            }

        }

       for(Coche coche : listCoches){
            System.out.println (" ");
            System.out.println (coche.toString());
            System.out.println ("------------------------------");
        }
    }

    public static boolean comprobarValores(String marca, String modelo, int ano, String matricula){

        if(marca.length() == 0){
            return false;
        }

        if(modelo.length() == 0){
            return false;
        }

        if(matricula.length() == 0){
            return false;
        }

        if(ano < 1990){
            return false;
        }

        return true;
    }
}
