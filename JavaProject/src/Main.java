import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        //System.out.println(Math.asin());

//        if (true) {
//            System.out.println("par");
//        }
//        else if (preco % 3 == 0)
//            System.out.println("mutiplo de 3");
//        else
//            System.out.println("impar");
//

//        switch(preco) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            default:
//                System.out.println("Valor não encontrado");
//        }





        //i < 10 // 0 a 9
        //i <= 10 // 0 a 10
        //i++ == i = i + 1
        //i-- == i = i - 1
        int preco = 6;
        int preco2 = 7;

//        while(preco2 > 0){
//            preco2--;
//            System.out.println("preco2 " + preco2);
//
//            if(preco2 == 2){
//                System.out.println("Saiu do ciclo 1");
//                break;
//            }
//
//            while(preco > 0){
//                preco--;
//                System.out.println("preco1 " + preco);
//
//                if(preco == 2){
//                    System.out.println("Saiu do ciclo 2");
//                    break;
//                }
//            }
//        }

//        preco = 6;
//        do{
//            preco--;
//            System.out.println(preco);
//        }while(false);


        int[] intArray = new int[5]; //0 1 2 3 4
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        int[] intArray2 = new int[] {1,2,3,4,5};

        int[] intArray3 = {1,2,3,4,5};

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//
//        arrayList.remove(1);
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.remove(1);


        //0 -> 1
        //1 -> 2


        // i <= 5 --- 0 a 5 --- 0 1 2 3 4 5 --- 6

        for(int i = 0; i <= intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
}