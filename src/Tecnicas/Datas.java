package Tecnicas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Datas
{
    public static void main(String[] args)
    {
        System.out.println(idadeEmSegundos(LocalDateTime.of(1988, 12, 18, 00, 00, 00)));

        System.out.println(dataNesteInstanteEmPortugal());

        System.out.println(dataAgoraEmMenosDois());

        System.out.println(formataData(OffsetDateTime.now()));
    }

    private static String formataData(OffsetDateTime now)
    {
        return now.format(DateTimeFormatter.ofPattern("HH:mm:ss dd 'de ' MMMM 'de 'YYYY 'Fuso: 'Z"));
    }

    public static int idadeEmSegundos(LocalDateTime dataNascimento)
    {
        LocalDateTime dataAtual = LocalDateTime.now();
        return (int) dataNascimento.until(dataAtual, ChronoUnit.SECONDS);
    }

    public static ZonedDateTime dataNesteInstanteEmPortugal()
    {

        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Portugal"));
    }

    public static OffsetDateTime dataAgoraEmMenosDois()
    {
        return OffsetDateTime.now().withOffsetSameInstant(ZoneOffset.ofHours(-2));
    }
}
