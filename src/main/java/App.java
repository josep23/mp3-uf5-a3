import model.Sessions;
import model.dataroot;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    static final String pathXML = "http://www.gencat.cat/llengua/cinema/film_sessions.xml";
    private static int Respuesta2;


    public static void main(String[] args) throws IOException, JAXBException {
        Scanner Respuesta = new Scanner(System.in);
        dataroot dataroot = readXML();
        Boolean bucle = true;
        do{
            System.out.println("Que quieres hacer?");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("0  Salir");
            System.out.println("1  Buscar titulo");
            System.out.println("2  Ordenar por id de cine");
            System.out.println("3  Filtra por id");
            System.out.println("4  Filtrar por Localidad");
            System.out.println("5  Ordenar por orden de sesion");
            System.out.println("6  Ordenar por precio");
            System.out.println("7  Ordenar Por fecha");
            System.out.println("-------------------------------------------------------------------------------------------");

            Respuesta2 = Respuesta.nextInt();
            switch (Respuesta2) {
                case 0:
                    System.out.println("Salir");
                    bucle = false;
                    break;
                case 1:
                    System.out.println("1");
                    System.out.println("Que titulo buscas");
                    String titulo = Respuesta.nextLine();

                    Stream<Sessions> Titulo =  dataroot.getLlistaSessions().stream().filter(p -> titulo.equals(p.getTITOL()));
                    Titulo.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("2");
                    dataroot.getLlistaSessions().stream().sorted(Comparator.comparing(Sessions::getCINEID)).forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("3");
                    System.out.println("QUE ID BUSCAS?");
                    String id = Respuesta.nextLine();

                    Stream<Sessions> ID =  dataroot.getLlistaSessions().stream().filter(p -> id.equals(p.getIDFILM()));
                    ID.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("4");
                    System.out.println("Que localidad buscas?");
                    String localidad = Respuesta.nextLine();
                    Stream<Sessions> Localidad = dataroot.getLlistaSessions().stream().filter(p -> localidad.equals(p.getLOCALITAT()));
                    break;
                case 5:
                    System.out.println("5");
                    dataroot.getLlistaSessions().stream().sorted(Comparator.comparing(Sessions::getORDRESESSIO)).forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("6");
                    dataroot.getLlistaSessions().stream().sorted(Comparator.comparing(Sessions::getPreu)).forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("7");
                    dataroot.getLlistaSessions().stream().sorted(Comparator.comparing(Sessions::getSes_data)).forEach(System.out::println);
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }while (bucle);

    }

    private static dataroot readXML() throws MalformedURLException, JAXBException {
        URL url = null;
        url = new URL(pathXML);

        JAXBContext contextObj = JAXBContext.newInstance(dataroot.class);
        Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
        dataroot dataroot = (dataroot) unmarshallerObj.unmarshal(url);

        return dataroot;
    }


}