public class Driver{
    public static void main(String[] args) {
      OrderedArrayList OA1 = new OrderedArrayList<String>();
      try {
        NoNullArrayList<String> NN1 = new NoNullArrayList<>();
        System.out.println("initialized NN1, currently looks like: " + NN1);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i<10; i++) {
            NN1.add(letters[i]);
        }
        System.out.println("Added letters to NN1, looks like: " + NN1);
        System.out.println("Now let's try adding Null values, giving index or just appending to end:");
        //NN1.add(null);
        //NN1.add(2, null);
        //NN1.set(2, null);
        //works!
        System.out.println("*---*---*");
        //System.out.println("testing findIndex");


        System.out.println("Now testing OrderedArrayList");
        //OrderedArrayList OA1 = new OrderedArrayList<String>();
        System.out.println("initialized OA1, currently looks like: " + OA1 + "\nnow let's see how we add: ");
        OA1.add("b");
        OA1.add("a");
        System.out.println("Added \"a\" and \"b\" (should return [a, b]): " + OA1);
        OA1.add("c");
        OA1.add("z");
        OA1.add("m");
        System.out.println("Should return [a, b, c, m, z]: " + OA1);
        System.out.println("Now let's practice with nulls and see what happens");
        //OA1.add(null);
        OA1.set(3, null);
      }
      catch(IllegalArgumentException e) {
        //System.out.println("IllegalArguemntException" + e);
      }
        System.out.println("this is what OA1 looks like after set(3, null): " + OA1);

      //}
    }
}
