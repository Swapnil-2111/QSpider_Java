// package Discussion Object Creation;

public class CollegeDriver {  
        public static void main(String[] args) {
        College obj = new College("Deep", "IT");
        obj.DisplayInfo();
    }
}

class College {
    String cname;
    String branch;

    College(String name, String branch) {
        this.cname = name;
        this.branch = branch;
    }

    void DisplayInfo() {
        System.out.println(cname);
        System.out.println(branch);
    }
}