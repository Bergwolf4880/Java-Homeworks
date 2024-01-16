import java.util.ArrayList;
import java.util.List;

public class Team <T extends Employee>{
    private Manager manager;
    List<T> team = new ArrayList<>();

    public Team(Manager manager){
        this.manager=manager;
        this.team = new ArrayList<>();
    }

    public void addEmployee(T employee) {
        team.add(employee);
    }

    @Override
    public String toString() {
        return "Team: " + manager + team;
    }
}
