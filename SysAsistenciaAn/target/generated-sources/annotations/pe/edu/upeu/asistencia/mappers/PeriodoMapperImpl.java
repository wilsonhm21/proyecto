package pe.edu.upeu.asistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.asistencia.dtos.PeriodoDto;
import pe.edu.upeu.asistencia.models.Evento;
import pe.edu.upeu.asistencia.models.Matricula;
import pe.edu.upeu.asistencia.models.Periodo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-25T18:38:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class PeriodoMapperImpl implements PeriodoMapper {

    @Override
    public PeriodoDto toPeriodoDto(Periodo periodo) {
        if ( periodo == null ) {
            return null;
        }

        PeriodoDto.PeriodoDtoBuilder periodoDto = PeriodoDto.builder();

        periodoDto.id( periodo.getId() );
        periodoDto.nombre( periodo.getNombre() );
        periodoDto.estado( periodo.getEstado() );
        List<Matricula> list = periodo.getMatriculas();
        if ( list != null ) {
            periodoDto.matriculas( new ArrayList<Matricula>( list ) );
        }
        List<Evento> list1 = periodo.getEventos();
        if ( list1 != null ) {
            periodoDto.eventos( new ArrayList<Evento>( list1 ) );
        }

        return periodoDto.build();
    }

    @Override
    public Periodo periodoCrearDtoToPeriodo(PeriodoDto.PeriodoCrearDto periodoCrearDto) {
        if ( periodoCrearDto == null ) {
            return null;
        }

        Periodo.PeriodoBuilder periodo = Periodo.builder();

        periodo.nombre( periodoCrearDto.nombre() );
        periodo.estado( periodoCrearDto.estado() );

        return periodo.build();
    }

    @Override
    public List<PeriodoDto> periodoListDtoToPeriodoList(List<Periodo> periodo) {
        if ( periodo == null ) {
            return null;
        }

        List<PeriodoDto> list = new ArrayList<PeriodoDto>( periodo.size() );
        for ( Periodo periodo1 : periodo ) {
            list.add( toPeriodoDto( periodo1 ) );
        }

        return list;
    }
}
