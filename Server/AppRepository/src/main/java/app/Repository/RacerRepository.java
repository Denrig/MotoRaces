package app.Repository;


import app.Domain.Racer;
import app.Domain.Team;

public interface RacerRepository extends CrudRepository<Long, Racer> {

    Iterable<Racer> findByTeam(Team team);

    Iterable<Racer> findByRace(Long id);

}
