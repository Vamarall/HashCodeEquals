public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Victor", "amaralvitor580@gmail.com");
        Cliente c2 = new Cliente("Matheus Pereira", "matpereira61@gmail.com");
        Cliente c3 = new Cliente("Matheus Pereira", "matpereira61@gmail.com");

        // Obtendo hashCode de cada obj
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        // False
        System.out.println(c1.equals(c2));

        // True
        System.out.println(c2.equals(c3));

        // False, pois "==" não vai comparar o conteudo e sim as referencias de memoria
        System.out.println(c2 == c3);
    }
}
