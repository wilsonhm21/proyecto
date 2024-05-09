package pe.edu.upeu.asistencia.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.asistencia.dtos.AsistenciaxDto;
import pe.edu.upeu.asistencia.models.Asistenciax;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-25T18:38:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class AsistenciaxMapperImpl implements AsistenciaxMapper {

    @Override
    public AsistenciaxDto toAsistenciaxDto(Asistenciax endtidad) {
        if ( endtidad == null ) {
            return null;
        }

        AsistenciaxDto.AsistenciaxDtoBuilder asistenciaxDto = AsistenciaxDto.builder();

        asistenciaxDto.id( endtidad.getId() );
        asistenciaxDto.fecha( endtidad.getFecha() );
        asistenciaxDto.horaReg( endtidad.getHoraReg() );
        asistenciaxDto.latituda( endtidad.getLatituda() );
        asistenciaxDto.longituda( endtidad.getLongituda() );
        asistenciaxDto.tipo( endtidad.getTipo() );
        asistenciaxDto.calificacion( endtidad.getCalificacion() );
        asistenciaxDto.cui( endtidad.getCui() );
        asistenciaxDto.tipoCui( endtidad.getTipoCui() );
        asistenciaxDto.entsal( endtidad.getEntsal() );
        asistenciaxDto.subactasisId( endtidad.getSubactasisId() );
        asistenciaxDto.offlinex( endtidad.getOfflinex() );
        asistenciaxDto.actividadId( endtidad.getActividadId() );

        return asistenciaxDto.build();
    }

    @Override
    public Asistenciax asistenciaxCrearDtoToAsistenciax(AsistenciaxDto.AsistenciaxCrearDto entidadCrearDto) {
        if ( entidadCrearDto == null ) {
            return null;
        }

        Asistenciax asistenciax = new Asistenciax();

        asistenciax.setId( entidadCrearDto.id() );
        asistenciax.setFecha( entidadCrearDto.fecha() );
        asistenciax.setHoraReg( entidadCrearDto.horaReg() );
        asistenciax.setLatituda( entidadCrearDto.latituda() );
        asistenciax.setLongituda( entidadCrearDto.longituda() );
        asistenciax.setTipo( entidadCrearDto.tipo() );
        asistenciax.setCalificacion( entidadCrearDto.calificacion() );
        asistenciax.setCui( entidadCrearDto.cui() );
        asistenciax.setTipoCui( entidadCrearDto.tipoCui() );
        asistenciax.setEntsal( entidadCrearDto.entsal() );
        asistenciax.setSubactasisId( entidadCrearDto.subactasisId() );
        asistenciax.setOfflinex( entidadCrearDto.offlinex() );

        return asistenciax;
    }
}
