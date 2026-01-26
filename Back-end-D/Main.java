import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        // int umur = 20;
        // String nama = "Alice";
        // System.out.println("umur saya adalah " + umur + " tahun");
        // System.out.println("nama saya adalah " + nama);

        // int a = 10;
        // int b = 7;
        // int c = a + b;
        // System.out.println("Hasil dari " + a + " + " + b + " = " + c);

        // c = a - b;
        // System.out.println("Hasil dari " + a + " - " + b + " = " + c);

        // c = a * b;
        // System.out.println("Hasil dari " + a + " * " + b + " = " + c);

        // c = a / b;
        // System.out.println("Hasil dari " + a + " / " + b + " = " + c);

        // c = a % b;
        // System.out.println("Hasil dari " + a + " % " + b + " = " + c);

        String[] arrName = new String[50];

        // List<String> namesBeD = new ArrayList<>();

        // namesBeD.add("Dina");
        // namesBeD.add("Dewi");       
        // namesBeD.add("Dian");

        // Map<String, List<String>> intStr = new HashMap<>();

        // intStr.put("BE-D", namesBeD);

        // System.out.println(intStr.get("BE-D"));


        // List<String> semester1 = new ArrayList<>();
        // semester1.add("Basic Programming");
        // semester1.add("Matematika");
        
        // Map<String, List<String>> inStr = new HashMap<>();;

        // inStr.put("Semester 1", semester1);

        // System.out.println(inStr.get("Semester 1"));





        List<String> semester1 = new ArrayList<>();
        semester1.add("Basic Programming");
        semester1.add("Matematika");
        semester1.add("Bahasa Indonesia");
        semester1.add("English elementary");

        List<String> semester2 = new ArrayList<>();
        semester2.add("Object Oriented Programming");
        semester2.add("Struktur Data");
        semester2.add("Calculus");
        semester2.add("English pre Intermediate");
        semester2.add("Pancasila");

        List<String> semester3 = new ArrayList<>();
        semester3.add("Database Systems");
        semester3.add("Web Design");
        semester3.add("Probability and Statistics");
        semester3.add("English Intermediate");
        semester3.add("Civics");

        List<String> semester4 = new ArrayList<>();
        semester4.add("human Computer Interaction");
        semester4.add("Operating Systems");
        semester4.add("Linear Algebra");

        List<String> semester5 = new ArrayList<>();
        semester5.add("Computer Networks");
        semester5.add("front-end ");
        semester5.add("research Methodology");
        semester5.add("computer Vision");

        List<String> semester6 = new ArrayList<>();
        semester6.add("Artificial Intelligence");
        semester6.add("back-end");
        semester6.add("Software Engineering");
        semester6.add("computer Graphics");

        Map<String, List<String>> inStr = new HashMap<>();

        inStr.put("Semester 1", semester1);
        inStr.put("Semester 2", semester2);
        inStr.put("Semester 3", semester3);
        inStr.put("Semester 4", semester4);
        inStr.put("Semester 5", semester5);
        inStr.put("Semester 6", semester6);

        System.out.println(inStr.get("Semester 1"));
        System.out.println(inStr.get("Semester 2"));
        System.out.println(inStr.get("Semester 3"));
        System.out.println(inStr.get("Semester 4"));
        System.out.println(inStr.get("Semester 5"));
        System.out.println(inStr.get("Semester 6"));
    }
}


        

