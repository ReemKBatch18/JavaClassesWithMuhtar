package day50_Polymorphism.Task2_ScrumTeam;
/*
 2. create an interface named ScrumTeam
            variable: has_ScrumMaster
            abstract methods: dailyStandUp()
3. create an interface named WorkRemotely
            abstract method: workFromHome();
 */
public interface ScrumTeam {
    boolean has_ScrumMaster=true;

    void dailyStandUp();

}

interface WorkRemotely{
    void workFromHome();

}
