package rica_api;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "publicaciones")
public class Publicacion {

    @Id
    private String id;
    private String investigadorCorreo;
    private String titulo;
    private String tipo;
    private Integer anio;
    private Map<String, String> detalles;

    public Publicacion() {
    }

// getters y setters de cada atributo

}