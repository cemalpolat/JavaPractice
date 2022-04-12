package day36_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public ScrumMaster SM;
    public BussinessAnalyst BA;

    ArrayList<Tester>testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(ProductOwner PO, ScrumMaster SM, BussinessAnalyst BA, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        this.PO = PO;
        this.SM = SM;
        this.BA = BA;
        this.testers = testers;
        this.developers = developers;
    }

    public void addTester(Tester tester) {

        testers.add(tester);
    }

    public void addTesterS(Tester[] testers) {

        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(String iD) {

        testers.remove(iD);

    }

    public void addDeveloper(Developer developer) {

        developers.add(developer);
    }

    public void addDeveloperS(Developer[] developers) {

        this.developers.addAll(Arrays.asList(developers));


    }

    public void removeDeveloper(String iD) {

        developers.remove(iD);
    }

    public int numOfTesters() {
        return testers.size();
    }

    public int numOfDevelopers() {
        return developers.size();
    }


    public String nameOfTesters(){
        String str = "";
        for (Tester tester : testers) {
            str += tester.name + ", ";
        }
        return str;
    }


    public String nameOfDevelopers(){
        String str1 = "";
        for (Developer developer : developers) {
            str1 += developer.name + ", ";
        }
        return str1;
    }

    public String toString () {
            return "ScrumTeam{" +
                    ", PO=" + PO.name +
                    ", SM=" + SM.name +
                    ", BA=" + BA.name +
                    ", number of testers=" + numOfTesters() +
                    ", number of developers=" + numOfDevelopers() +
                    ", testers= " + nameOfTesters() +
                    ", developers= " + nameOfDevelopers() +

                    '}';
        }
}
