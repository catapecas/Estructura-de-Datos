public class MyArrayList{
    private Object[] myArray;

    public MyArrayList(int size){
        myArray = new Object [size];
    }

    public void add (Object object) {
        if (size ==myArray.length) {
            increaseSize();
            
        }
        myArray[size] = object;
        size ++;
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