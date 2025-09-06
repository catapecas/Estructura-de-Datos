public class MyArrayList{
    private Object[] myArray;
    private int size = 0;

    public MyArrayList(int initialCapacity){
        myArray = new Object [initialCapacity];
    }

    public void add (Object object) {
        if (size == myArray.length) {
            increaseSize();
        }
        myArray[size] = object;
        size++;
    }
    public String toString(){
        String returnString = "";
        for (int i=0; i<myArray.length; i++){
            returnString += myArray[i] +",";

        }
        return returnString;
    }
    private void increaseSize() {
        Object[] newArray = new Object[myArray.length * 2];
        for (int i = 0; i < myArray.length; i++) {
         newArray[i] = myArray[i];
        }

      myArray = newArray;
    }
}