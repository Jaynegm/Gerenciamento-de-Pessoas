package newpackage;


public class Pessoa {
    private String nome;
    private int idade;
    private int datanascimento;
    private int RG;
    private String estadocivil;
    private String nomedamae;

    // Construtor sem argumentos
    public Pessoa() {
    }

    // Construtor com argumentos
    public Pessoa(String nome, int idade, int datanascimento, int RG, String estadocivil, String nomedamae) {
        this.nome = nome;
        this.idade = idade;
        this.datanascimento = datanascimento;
        this.RG = RG;
        this.estadocivil = estadocivil;
        this.nomedamae = nomedamae;
    }

        
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(int datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getNomedamae() {
        return nomedamae;
    }

    public void setNomedamae(String nomedamae) {
        this.nomedamae = nomedamae;
    }
    
   
}
