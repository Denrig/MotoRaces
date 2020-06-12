import app.Domain.*;
import app.Repository.RaceDBRepository;
import app.Repository.RacerDBRepository;
import app.Repository.UserRepository;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class RaceRepoTest {
    @Test
    @SuppressWarnings("unchecked")
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Test.xml");
        RaceDBRepository repository=context.getBean(RaceDBRepository.class);
        Race race=repository.findOne(1l);
        assertTrue(race!=null);
        race.setId(repository.getLastID());
        race.setDate(LocalDate.parse("2019-04-03"));
        assertTrue(repository.save(race)==null);
        race.setEngine(Engine.m125cm);
        assertTrue(repository.update(race)==null);
        assertTrue(repository.delete(race.getId())==null);
    }
    @Test

    public void testRacer(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Test.xml");
        RacerDBRepository repository=context.getBean(RacerDBRepository.class);
        Racer racer=repository.findOne(1l);
        assertTrue(racer!=null);
        racer.setName("SLUSAFASFAS");
        assertTrue(repository.save(racer)==null);
        racer.setEngine(Engine.m125cm);
        assertTrue(repository.update(racer)==null);
        assertTrue(repository.delete(racer.getId())!=null);

    }
    @Test
    public void loginTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Test.xml");
        UserRepository repository =context.getBean(UserRepository.class);
        assertTrue(repository.login(new User("ana","ana"))!=null);
        System.out.println("ana".hashCode());
    }
}
