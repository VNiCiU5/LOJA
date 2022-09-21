public class Main {
    
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        func1.setNome("fulano A");
        func1.setCpf("222222222");
        func1.setEmail("fulanoA@gmail.com");

        System.out.println(func1.getNome());
        
    }
}
