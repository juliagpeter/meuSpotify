package tipos;

public class Audio {
    private String titulo;
    private int totalCurtidas;
    private int totalReproducoes;
    private int classificacao;

    void curtir (Audio audio) {
        audio.totalCurtidas++;
        System.out.println("Curtido com sucesso!");
    }
    void reproduzir (Audio audio) {
        System.out.println("Reproduzindo agora: " + audio.titulo);
        audio.totalReproducoes++;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }
}