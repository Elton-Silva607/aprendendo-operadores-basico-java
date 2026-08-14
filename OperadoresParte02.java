package flamingo.aprendendo.basico;

public class OperadoresParte02 {
    /*
    * < menor que
    * > maior que
    * <= menor ou igual
    * >= maior ou igual
    * == igual a
    * != diferente de
    * */
    public static void main(String [] args) {
        byte idadeMae = 60;
        byte idadePai = 75;
        byte idadeTia = 61;
        System.out.println(idadeMae < idadePai);
        System.out.println(idadeMae > idadePai);
        System.out.println(idadeMae == idadeTia);
        System.out.println(idadeMae <= idadeTia);
        System.out.println(idadeMae >= idadeTia);
        System.out.println(idadeMae != idadeTia);
    }
}
