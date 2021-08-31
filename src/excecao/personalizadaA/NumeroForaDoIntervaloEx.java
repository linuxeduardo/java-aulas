package excecao.personalizadaA;

public class NumeroForaDoIntervaloEx extends RuntimeException {
    private String nomeDoAtributo;

    public NumeroForaDoIntervaloEx(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }
}
