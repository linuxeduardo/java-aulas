package excecao.personalizadaB;

// verificada
public class StringVaziaEx extends Exception {
    private String nomeDoAtributo;

    public StringVaziaEx(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }
}
