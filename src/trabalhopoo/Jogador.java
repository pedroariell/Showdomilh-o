package trabalhopoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pedro Ariel
 */
public class Jogador {

    private String nome;
    private int dificuldade;
    private int pontos;
    private ArrayList<Integer> listaPerguntas = new ArrayList();

    public Jogador(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.pontos = 0;
    }

    public void geraListaPerguntas() {
        int n;
        Random random = new Random();   // random.nextInt((max - min) + 1) + min;
        if (dificuldade == 1) {
            for (int i = 0; i < 15; i++) {
                n = random.nextInt(20) + 0;
                while (listaPerguntas.contains(n)) {
                    n = random.nextInt(20) + 0;
                }
                listaPerguntas.add(n);
            }
        } else if (dificuldade == 2) {
            for (int i = 0; i < 15; i++) {
                if (i < 10) {
                    n = random.nextInt(20) + 0;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 0;
                    }
                    listaPerguntas.add(n);
                } else {
                    n = random.nextInt(20) + 20;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 20;
                    }
                    listaPerguntas.add(n);
                }
            }
        } else if (dificuldade == 3) {
            for (int i = 0; i < 15; i++) {
                if (i < 5) {
                    n = random.nextInt(20) + 0;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 0;
                    }
                    listaPerguntas.add(n);
                } else if (i < 10) {
                    n = random.nextInt(20) + 20;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 20;
                    }
                    listaPerguntas.add(n);
                } else {
                    n = random.nextInt(20) + 40;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 40;
                    }
                    listaPerguntas.add(n);
                }
            }
        } else if (dificuldade == 4) {
            for (int i = 0; i < 15; i++) {
                if (i < 10) {
                    n = random.nextInt(20) + 20;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 20;
                    }
                    listaPerguntas.add(n);
                } else {
                    n = random.nextInt(20) + 40;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 40;
                    }
                    listaPerguntas.add(n);
                }
            }
        } else if (dificuldade == 5) {
            for (int i = 0; i < 15; i++) {
                if (i < 5) {
                    n = random.nextInt(20) + 20;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 20;
                    }
                    listaPerguntas.add(n);
                } else {
                    n = random.nextInt(20) + 40;
                    while (listaPerguntas.contains(n)) {
                        n = random.nextInt(20) + 40;
                    }
                    listaPerguntas.add(n);
                }
            }
        }
    }

    public void limpaListaP() {
        listaPerguntas.clear();
    }

    public String LeArquivo(String nomeArquivo, int pos) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            int i = 0;
            String linha = reader.readLine();
            while (linha != null) {
                if (i == pos) {
                    return linha;
                }
                linha = reader.readLine();
                i++;
            }
        }
        
        return null;
    }

    public void EscreveScore(String score) throws IOException {
        Writer linha;
        linha = new BufferedWriter(new FileWriter("Score.txt", true));
        linha.append(score);
        linha.close();
    }

    public String getNome() {
        return nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getPontos() {
        return pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public ArrayList<Integer> getListaPerguntas() {
        return listaPerguntas;
    } 
}
