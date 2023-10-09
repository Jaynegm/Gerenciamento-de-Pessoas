package newpackage;


public class Principal {
    public static void main(String[] args) {

        //Criando um objeto
        Pessoa conhecido1 = new Pessoa("João", 25, 15112002, 055, "Solteiro", "Vanessa");

        //Exibindo os detalhes da pessoa
        System.out.println ("Nome: " + conhecido1.getNome());
        System.out.println ("Idade: " + conhecido1.getIdade());
        System.out.println ("Data de nascimento: " + conhecido1.getDatanascimento());
        System.out.println ("RG: " + conhecido1.getRG());
        System.out.println ("Estado Civil: " + conhecido1.getEstadocivil());
        System.out.println ("Nome da Mãe: " + conhecido1.getNomedamae());
        
        //Modificando os atributos
        conhecido1.setNome("João");
        conhecido1.setIdade(25);
        conhecido1.setDatanascimento(15112002);
        conhecido1.setRG(055);
        conhecido1.setEstadocivil("Solteiro");
        conhecido1.setNomedamae("Vanessa");
        
        //Exiba os detalhes
        System.out.println ("Alteração de Nome: " + conhecido1.getNome());
        System.out.println ("Alteração de Idade: " + conhecido1.getIdade());
        System.out.println ("Alteração de Data de Nascimento: " + conhecido1.getDatanascimento());
        System.out.println ("Alteração de RG: " + conhecido1.getRG());
        System.out.println ("Alteração de Estado Civil: " + conhecido1.getEstadocivil());
        System.out.println ("Alteração de Nome da mãe: " + conhecido1.getNomedamae());
}
}
