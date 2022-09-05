public static void printSleep(Sleep[] array) {
    for(int i = 0; i<array.length; i++) {
        if(array[i] instanceof Cat) {
            System.out.println("Cats sleep 16 hours");
        } else if(array[i] instanceof Dog) {
            System.out.println("Dogs sleep 14 hours");
        } else if(array[i] instanceof Human) {
            System.out.println("Humans sleep 8 hours");
        }
    }
}
