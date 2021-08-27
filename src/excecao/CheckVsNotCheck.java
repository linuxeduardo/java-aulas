package excecao;

public class CheckVsNotCheck {
    public static void main(String[] args) {

        try {

            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {

            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }

    // exceção não checada
    static void geraErro1() {
        throw new RuntimeException("Erro No 1");
    }

    // exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Erro No 2");
    }
}
