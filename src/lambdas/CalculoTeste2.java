package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        // função anônima, LAMBDA, mesmos args do método de Calculo
        // com chaves tem que ter o return
        Calculo calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.executar(2,3));

        // sem as chaves, 1 sentença e será retornada
        calculo = (x, y) -> x * y;
        System.out.println(calculo.executar(2,3));

        System.out.println(calculo.legal());
        System.out.println(Calculo.massa());
    }
}
