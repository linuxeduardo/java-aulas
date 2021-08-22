package lambdas;

@FunctionalInterface
public interface Calculo {
    // FunctionalInterface somente 1 método ABSTRATO
    // java.util.function
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

    // lambda 1 dentro de interface
    public abstract double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    // static sem acesso ao this
    static String massa() {
        return "mass";
    }
}
