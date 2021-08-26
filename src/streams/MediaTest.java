package streams;

public class MediaTest {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(9).adicionar(9);
        Media m2 = new Media().adicionar(7).adicionar(4);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
