public class ArrayContainsElement {
    int [] array = {1,2,3,4,5,3,8,3};

    int numberToFind = 3;

    boolean found = false;

    public void elementFoundOrNot(){
        // using for loop
//        for(int i=0; i< array.length; i++){
//            if(array[i]==numberToFind){
//                found=true;
//                break; // break is used for not to print wording when same element present again and again
//            }
//        }

        // using for each loop
        for (int element: array){
            if(element==numberToFind){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }
    }

    public static void main(String[] args){
        ArrayContainsElement arr = new ArrayContainsElement();
        arr.elementFoundOrNot();
    }
}
