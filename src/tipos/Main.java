package tipos;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        MinhasPreferidas preferidas = new MinhasPreferidas();

        musica1.setAlbum("euphoria");
        musica1.setArtista("Kendrick Lamar");
        musica1.setTitulo("euphoria");
        musica1.setTotalCurtidas(99999);
        musica1.setTotalReproducoes(99999);
        musica1.setGenero("Rap");

        preferidas.inclui(musica1);

    }
}
