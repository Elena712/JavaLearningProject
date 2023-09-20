package md.tekwillacademy.gitworkflow;

public class GitWorkFlow {

    public static void main(String[] args) {
        String step1 = "Execute git stash in the console";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Execute git fetch comment - to see if there any changes on remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin master to local master";
        String step5 = "Execute git branch New_Branch_Name command to create a new branch that is same as local master";
        String step6 = "Execute git checkout New_Branch_Name to swith to the newly created branch ";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command from IntelliJ Idea to store the changes at local level, on the current branch";
        String step9 = "Execute git puch from IntelliJ Idea panel - as result, a new remotr branch is created within origin/New_Branch_Name";
        String step10 = "Create a pull request from origin/New_Branch_Name into master";
        String step11 = "Add the pull request details like name, descriptions and reviewers";
        String step12 = "If we callect at least one approval then we can merge the changes and continue with another task";
        String step17 = "Do not forget that locally I am still on the New_Branch_Name";
        String step13 = "if someone asks for changes, then we have to open the project and make sure that we are on the same New_Branch_Name";
        String step14 = "Change the requested lines of code";
        String step15 = "Perfome a Git commit amend to change the latest executed commit by adding your re quested changes";
        String step16 = "Performe a git force push to update the status of the pull request";
        System.out.println(step1);
           System.out.println(step2);
           System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);


    }
}
