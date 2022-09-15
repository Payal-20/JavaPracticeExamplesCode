public class TryAndCatch {
    public static void main(String[] args) {
        try{
            int myNumbers[]={ 1,57,26};
            System.out.println(myNumbers[20]);
        }catch(Exception e){
            System.out.println("someting went wrong");
        }
    }
}
