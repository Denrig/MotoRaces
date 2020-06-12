package app.Domain;

import java.io.Serializable;

public class Pair implements Serializable {
    private Racer racer;
    private Race race;

    public Pair(Racer racer, Race race) {
        this.racer = racer;
        this.race = race;
    }

    public Racer getRacer() {
        return racer;
    }

    public void setRacer(Racer racer) {
        this.racer = racer;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
