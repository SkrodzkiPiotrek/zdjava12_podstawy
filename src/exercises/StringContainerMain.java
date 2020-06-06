package exercises;

public class StringContainerMain {

    public static void main(String[] args){
        String[] testData = {"Ala", "ma", "kota" };

        StringCOntainer poem = new StringCOntainer(testData);

        poem.set("nie ma", 3);

        System.out.println(poem);

    }
}
