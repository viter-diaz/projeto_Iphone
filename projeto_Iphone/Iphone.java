package projeto_Iphone;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<musica> musicas;
    private List<Contato> contatos;

    public Iphone() {
        this.musicas = new ArrayList<>();
        this.contatos = new ArrayList<>();
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(musica musica) {
        musicas.add(musica);
        System.out.println("Selecionando música: " + musica.getNome());
    }

    @Override
    public boolean redeMovelDisponivel() {
        return true; // Simulação de rede móvel sempre disponível
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public boolean conexaoComInternet() {
        return true; // Simulação de conexão com internet sempre disponível
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void buscar(String termo) {
        System.out.println("Buscando por: " + termo);
    }

    // Métodos específicos do iPhone, como adicionar contatos, podem ser adicionados aqui
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }
}