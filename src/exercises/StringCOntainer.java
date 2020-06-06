package exercises;

public class StringCOntainer {


    private String[] data;

    public StringCOntainer(String[] initialData) {
        this.data = initialData;

    }

    public void set(String newData, int index) {

        data[index] = newData;
    }

    public void add(String newData) {
        //dodawanie nowej wartości na końcu tablicy


    }

    public void remove(int index) {

        //usuwanie elementu na indexie i przepisanie nowej tablicy

    }

    public void swap(int left, int right) {

        //zamineianie elementów miejscami
    }

    public void bubbleSort() {

    }


//    public String toString() {
//        String result = "";
//        for (int i = 0; i < data.length; i++) {
//
//            result += "[" + data[i] + "\n";
//
//        }
//
//
//    }
}