
import java.util.concurrent.TimeUnit;

public class tryCatch3 {

    public static void verificarTempo(short TEMPO) {
        if (TEMPO < 4) {
            System.out.println("\n\nFilme Interrompido!, Aguarde o fim da propaganda!\n\n");
        } else {
            throw new ArithmeticException(
                    "Não há mais propagandas! \n\nO filme foi finalizado com sucesso! Agradecemos a preferencia!");
        }
    }

    public static void main(String[] args) {
        int tempoTotal = 4; // Tempo em minutos
        short minutoContado = 0;
        int segundoContado = 0;

        while (minutoContado < tempoTotal) {
            try {
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " Minuto(s) e " + segundoContado
                        + " Segundo(s)");
                Thread.sleep(50); // contador de tempo a cada 1 segundo (1000 milissegundos)
                segundoContado++;
                if (segundoContado == 60) {
                    minutoContado++;
                    segundoContado = 1;
                    verificarTempo(minutoContado);
                    TimeUnit.SECONDS.sleep(5);
                }
                ;
            } catch (Exception e) {
                System.out.println("Ops! Ocorreu o erro " + e);
            }
        }
    }
}