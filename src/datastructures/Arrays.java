package datastructures;

public class Arrays {
    public static void main (String[] args){
        String [] alphabet = {"a","b","c","d","e"};
        for (int i=0;i<5;i++){
            System.out.print(alphabet[i]+" ");
        }

        System.out.println("\nUsing length variable");
        int size = alphabet.length;
        for (int j=0;j<size;j++){
            System.out.print(alphabet[j]+" ");
        }

        System.out.println("\nUsing for each");
        for(String letter : alphabet){
            System.out.print(letter+" ");
        }
        System.out.println("\n\nDouble Arrrays");
        String[][] users = {
                {"Anand","v","av@testemail.com","1895"},
                {"John","m","jm@testemail.com","1905"},
                {"Shayam","g","sg@testemail.com","1965"}
                            };

//        Get the size of array

        int numOfUsers = users.length;
        int numOfFields = users[1].length;
        System.out.println("Number of Users: "+numOfUsers);
        System.out.println("Number of Fields: "+numOfFields);

//        looping through double array and printing
        System.out.println("Printing double arrray by looping using for ");
        for(int i=0;i<numOfUsers;i++){
            for(int j=0; j<numOfFields;j++){
                System.out.print(users[i][j]+" ");
            }
        }
        System.out.println("trying with for each.....");
        for(String [] usersno: users){
            System.out.print("[");
            for(String  userFields: usersno){
                System.out.print(userFields);
//            for(int i=0;i<usersno.length;i++){
//            System.out.print(usersno[i]+" ");
            }
//        }

            System.out.println("]");
        }
        System.out.println("looping through double array using for again");
        int  usercnt = users.length;
        int userfldcnt = users[1].length;
        for (int i=0; i<usercnt;i++){
            for (int j=0;j<userfldcnt;j++){
                System.out.print(users[i][j]+" ");
            }
        }
//        Traversing through double array
        for(int i=0;i<numOfUsers;i++){
            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String dob = users[i][3];
            System.out.println(firstName+" "+lastName+" "+email+" "+dob);
            for(int j=0;j<numOfFields;j++){

            }
        }

//        using for each
        System.out.println("\n\nUsing for each");
        for(String[] user: users){
            System.out.print("[ ");
            for(String field: user){
                System.out.print(field+" ");
            }
            System.out.println(" ]");
        }
//        quiz question
        System.out.println("Quick check");
        String[][] matrix = { {"a","b","c"},
                {"e","f","g"},
                {"h","i","j"} };

        for (String[] list : matrix) {

            for (int i=list.length-1;i>=0;i--) {
                System.out.print(list[i]);
            }
        }
    }
}
