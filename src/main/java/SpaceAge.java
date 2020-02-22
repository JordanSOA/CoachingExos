public class SpaceAge {
    private Integer ageSecs;
    private Long ageSec;

    public SpaceAge(int ageSecs) {
        this.ageSecs = ageSecs;
    }
    public SpaceAge(Long ageSec) {
        this.ageSec = ageSec;
    }
    public double onEarth() {
        return (((this.ageSecs / 60) /60) / 24)/365.25;
    }

    public double onMercury() {
        return (((this.ageSecs / 60) /60) / 24)/365.25/0.2408467;
    }

    public double onVenus() {
        return ((((this.ageSecs / 60) /60) / 24)/365.25)/0.61519726;
    }

    public double onMars() {
        return ((((this.ageSec / 60) /60) / 24)/365.25)/1.8808158;
    }

    public double onJupiter() {
        return ((((this.ageSecs / 60) /60) / 24)/365.25)/11.862615;
    }

    public double onSaturn() {
        return ((((this.ageSec / 60) /60) / 24)/365.25)/29.447498;
    }

    public double onUranus() {
        return ((((this.ageSec / 60) /60) / 24)/365.25)/84.016846;
    }

    public double onNeptune() {
        return ((((this.ageSec / 60) /60) / 24)/365.25)/164.79132;
    }
}
