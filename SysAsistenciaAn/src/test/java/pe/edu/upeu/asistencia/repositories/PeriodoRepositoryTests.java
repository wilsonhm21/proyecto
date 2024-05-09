
package pe.edu.upeu.asistencia.repositories;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import pe.edu.upeu.asistencia.models.Periodo;
import static org.assertj.core.api.Assertions.assertThat;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class PeriodoRepositoryTests {
    @Autowired
    PeriodoRepository repository;
    
    @Autowired
    TestEntityManager TestEntityManager;
    
    @BeforeEach
    public void setUp(){
        //List<Periodo> local=repository.findAll();
        //if(local.isEmpty()){
        Periodo periodo=new Periodo();
        periodo.setNombre("2021-2");
        periodo.setEstado("Inactivo");
        TestEntityManager.persist(periodo);
        //}
    }
    
    @Test
    public void CrearPeriodo(){
        //given
       Periodo periodo=new Periodo();
       periodo.setNombre("2021-2");
       periodo.setEstado("Inactivo");
       //when
       Periodo p=repository.save(periodo);
       //then
       assertThat(p).isNotNull();
       Assertions.assertEquals(p.getNombre(),"2021-2");
    }
    
    
    
    @Test
    public void testListarPeriodo(){
    
     List<Periodo> lista=repository.findAll();
     for(Periodo periodo : lista){
         System.out.println(periodo.getNombre()+""+periodo.getEstado());
     }
     Assertions.assertEquals(lista.size(),2);
           
    }
    @Test
    public void testActualizarPeriodo(){
        Periodo px=repository.findById(34L).get();
        px.setEstado("Inactivo"); 
        //when
        Periodo p=TestEntityManager.persist(px);
        assertThat(p).isNotNull();
       Assertions.assertEquals(p.getEstado(),"Inactivo");
        
       List<Periodo> lista=repository.findAll();
            for(Periodo periodo : lista){
         System.out.println(periodo.getId()+""+periodo.getNombre()+""+periodo.getEstado());
            }
    }
    @Test
    public void testEliminarPeriodo(){
        
    }
    @Test
    public void testBuscarPeriodo(){
        
    }      
    
}
