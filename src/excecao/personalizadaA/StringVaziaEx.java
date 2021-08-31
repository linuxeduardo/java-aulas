package excecao.personalizadaA;

public class StringVaziaEx extends RuntimeException {
    private String nomeDoAtributo;

    public StringVaziaEx(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }
}
