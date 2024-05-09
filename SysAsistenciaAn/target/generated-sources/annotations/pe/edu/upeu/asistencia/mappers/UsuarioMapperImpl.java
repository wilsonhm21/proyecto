package pe.edu.upeu.asistencia.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.asistencia.dtos.UsuarioCrearDto;
import pe.edu.upeu.asistencia.dtos.UsuarioDto;
import pe.edu.upeu.asistencia.models.Usuario;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-25T18:38:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDto toUserDto(Usuario user) {
        if ( user == null ) {
            return null;
        }

        UsuarioDto.UsuarioDtoBuilder usuarioDto = UsuarioDto.builder();

        usuarioDto.id( user.getId() );
        usuarioDto.nombres( user.getNombres() );
        usuarioDto.apellidos( user.getApellidos() );
        usuarioDto.correo( user.getCorreo() );
        usuarioDto.dni( user.getDni() );
        usuarioDto.perfilPrin( user.getPerfilPrin() );
        usuarioDto.estado( user.getEstado() );
        usuarioDto.offlinex( user.getOfflinex() );

        return usuarioDto.build();
    }

    @Override
    public Usuario usuarioCrearDtoToUser(UsuarioCrearDto usuarioCrearDto) {
        if ( usuarioCrearDto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNombres( usuarioCrearDto.nombres() );
        usuario.setApellidos( usuarioCrearDto.apellidos() );
        usuario.setCorreo( usuarioCrearDto.correo() );
        usuario.setDni( usuarioCrearDto.dni() );
        usuario.setPerfilPrin( usuarioCrearDto.perfilPrin() );
        usuario.setEstado( usuarioCrearDto.estado() );
        usuario.setOfflinex( usuarioCrearDto.offlinex() );

        return usuario;
    }
}
