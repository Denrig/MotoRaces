package app.Domain;

import java.util.Objects;

public class Racer extends Entity<Long> {
    private Team team;
    private Engine engine;
    private String name;

    public Racer() {
    }

    public Racer(Team team, Engine engine, String name) {
        this.team = team;
        this.engine = engine;
        this.name = name;
    }

    public Racer(Long id, Team team, Engine engine, String name) {
        this.setId(id);
        this.team = team;
        this.engine = engine;
        this.name = name;
    }





    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Racer)) return false;
        Racer that = (Racer) o;
        return team == that.team &&
                engine == that.engine &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, engine, name);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "team=" + team +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                '}';
    }
}
