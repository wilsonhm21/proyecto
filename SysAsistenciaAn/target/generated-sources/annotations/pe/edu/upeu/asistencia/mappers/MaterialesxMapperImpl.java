package pe.edu.upeu.asistencia.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.asistencia.dtos.MaterialesxDto;
import pe.edu.upeu.asistencia.models.Materialesx;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-25T18:38:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class MaterialesxMapperImpl implements MaterialesxMapper {

    @Override
    public MaterialesxDto toMaterialesxDto(Materialesx entidad) {
        if ( entidad == null ) {
            return null;
        }

        MaterialesxDto.MaterialesxDtoBuilder materialesxDto = MaterialesxDto.builder();

        materialesxDto.id( entidad.getId() );
        materialesxDto.cui( entidad.getCui() );
        materialesxDto.tipoCui( entidad.getTipoCui() );
        materialesxDto.materEntre( entidad.getMaterEntre() );
        materialesxDto.fecha( entidad.getFecha() );
        materialesxDto.horaReg( entidad.getHoraReg() );
        materialesxDto.latituda( entidad.getLatituda() );
        materialesxDto.longituda( entidad.getLongituda() );
        materialesxDto.modFh( entidad.getModFh() );
        materialesxDto.offlinex( entidad.getOfflinex() );
        materialesxDto.actividadId( entidad.getActividadId() );

        return materialesxDto.build();
    }

    @Override
    public Materialesx materialesxCrearDtoToMaterialesx(MaterialesxDto.MaterialesxCrearDto entidadCrearDto) {
        if ( entidadCrearDto == null ) {
            return null;
        }

        Materialesx materialesx = new Materialesx();

        materialesx.setId( entidadCrearDto.id() );
        materialesx.setCui( entidadCrearDto.cui() );
        materialesx.setTipoCui( entidadCrearDto.tipoCui() );
        materialesx.setMaterEntre( entidadCrearDto.materEntre() );
        materialesx.setFecha( entidadCrearDto.fecha() );
        materialesx.setHoraReg( entidadCrearDto.horaReg() );
        materialesx.setLatituda( entidadCrearDto.latituda() );
        materialesx.setLongituda( entidadCrearDto.longituda() );
        materialesx.setModFh( entidadCrearDto.modFh() );
        materialesx.setOfflinex( entidadCrearDto.offlinex() );

        return materialesx;
    }
}
