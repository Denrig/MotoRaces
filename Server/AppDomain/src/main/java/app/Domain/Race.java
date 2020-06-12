package app.Domain;



import java.time.LocalDate;
import java.util.Objects;

public class Race extends Entity<Long>{
    private Engine engine;
    private int noRacers;
    private LocalDate date;


    public Race() {
    }
    public Race(Long id) {
        setId(id);
    }
    public Race(Long id, Engine engine, LocalDate date, int noRacers) {
        setId(id);
        this.engine = engine;
        this.date = date;
        this.noRacers=noRacers;
    }

    public Race(Engine engine, LocalDate date) {
        this.engine = engine;
        this.date = date;
    }
    public Race(Engine engine, LocalDate date,int noRacers) {
        this.engine = engine;
        this.date = date;
        this.noRacers=noRacers;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNoRacers() {
        return noRacers;
    }

    public void setNoRacers(int noRacers) {
        this.noRacers = noRacers;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return noRacers == race.noRacers &&
                engine == race.engine &&
                Objects.equals(date, race.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, noRacers, date);
    }

    @Override
    public String toString() {
        return "Race{" +
                "engine=" + engine +
                ", noRacers=" + noRacers +
                ", date=" + date +
                '}';
    }
}
