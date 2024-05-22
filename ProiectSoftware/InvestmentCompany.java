package ProiectSoftware;

import java.util.ArrayList;

public class InvestmentCompany {
    private ArrayList<Project> projects;

    public void addProject(Project p) {
        projects.add(p);
    }

    public Project getBestInvestment() {
        double maxim = Double.MAX_VALUE;
        Project maxProject = projects.get(0);
        for (Project project : projects) {
            double risk = project.getRisk();
            if (risk < maxim) {
                maxim = risk;
                maxProject = project;
            }
        }
        return maxProject;
    }

    public InvestmentCompany(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public static void main(String[] args) {
        Project project = new ProiectOpenSource(null, null, 0, null);
        Project project2 = new ProiectMilitar(null, null, 0, null, null);
        Project project3 = new ProiectComercial(null, null, 0, null);
        Project project4 = ProiectComercial.createProiectComercial(null, null, 0, null, null, 0, 0);
        Project[] projects = new Project[] { project, project2, project3, project4 };
        ArrayList<Project> projects2 = new ArrayList<>();
        for (Project project5 : projects) {
            projects2.add(project5);
        }
        InvestmentCompany investmentCompany = new InvestmentCompany(projects2);
        Project bestInvestment = investmentCompany.getBestInvestment();
        System.out.println(bestInvestment);
    }
}
