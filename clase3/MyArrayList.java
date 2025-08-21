public class MyArrayList{
    private Object[] myArray;

    public MyArrayList(int size){
        myArray = new Object [size];
    }

    public void add (Object object) {
        boolean addes = false;
        for ( int i= 0; i<myArray.length; i++){
            if(myArray[i]==null){
                myArray[i]= object;
              break;  
            }
        }

        if(!addes) {
            increaseSize();
            myArray[myArray.length / 2] = object; // Add to the new half of the array
        }
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