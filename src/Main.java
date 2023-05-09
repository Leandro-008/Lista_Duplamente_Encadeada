public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        Pessoa h = new Pessoa("Homer", "Masculino");
        Pessoa m = new Pessoa("Marge", "Feminino");
        Pessoa b = new Pessoa("Bart", "Masculino");
        Pessoa mo = new Pessoa("Moll", "Masculino");
        Pessoa l = new Pessoa("Lisa", "Feminino");
        Pessoa ma = new Pessoa("Maggie", "Feminino");
        Pessoa n = new Pessoa("Ned Flanders", "Masculino");
        Pessoa s = new Pessoa("Sr. Burns", "Masculino");
        Pessoa atual;

        System.out.println("----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(m);
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(0, b);
        lista.Adiciona(1, mo);
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(b);
        lista.AdicionaNoComeco(l);
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(ma);
        lista.Adiciona(0,b);
        lista.Adiciona(1,m);
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("Lisa está na lista: " + lista.Contem(l));
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(b);
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("\nMarge está na lista: " + lista.Contem(m));
        System.out.println("Homer está na lista: " + lista.Contem(h));
        System.out.println("Bart está na lista: " + lista.Contem(b));
        System.out.println("Maggie está na lista: " + lista.Contem(ma));
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        System.out.println("Marge está na lista: " + lista.Contem(m));
        System.out.println("Homer está na lista: " + lista.Contem(h));
        System.out.println("Bart está na lista: " + lista.Contem(b));
        System.out.println("Maggie está na lista: " + lista.Contem(ma));
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.AdicionaNoComeco(h);
        lista.AdicionaNoComeco(b);
        lista.Adiciona(m);
        lista.Adiciona(1, ma);
        lista.AdicionaNoComeco(n);
        lista.Adiciona(lista.tamanho(), s);

        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.RemovedoFim();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Remove(1);
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        System.out.println("Marge está na lista: " + lista.Contem(m));
        System.out.println("Homer está na lista: " + lista.Contem(h));
        System.out.println("Bart está na lista: " + lista.Contem(b));
        System.out.println("Maggie está na lista: " + lista.Contem(ma));
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.RemovedoComeco();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        System.out.println("Marge está na lista: " + lista.Contem(m));
        System.out.println("Homer está na lista: " + lista.Contem(h));
        System.out.println("Bart está na lista: " + lista.Contem(b));
        System.out.println("Maggie está na lista: " + lista.Contem(ma));
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");
    }
}
