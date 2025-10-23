package ec.edu.espe.publicaciones.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private String mensaje;
    public Object data;
}
