package tipos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é uma obra prima!");
        } else {
            System.out.println(audio.getTitulo() + " é bom!");
        }
    }
}
