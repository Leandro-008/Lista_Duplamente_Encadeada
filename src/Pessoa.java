public class Pessoa {
    String nome;
    String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    String getNome(){
        return nome;
    }

    String getSexo(){
        return sexo;
    }
}
