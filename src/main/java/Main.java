public class Main {
    public static void main(String[] args) {
        Squirrel s1 = new Squirrel("Bob",true, 0.6);
        s1.setNumOfConesInNest(4);

        Squirrel s2 = new Squirrel("Bobby", true, 0.5);
        s2.setNumOfConesInNest(0);

        Owl o1 = new Owl("Ugglan", 50, false, 3);

        PineTree tree = new PineTree(15, 10);
        tree.addSquirrels(s1);
        tree.addSquirrels(s2);
        tree.addOwls(o1);



//        System.out.println(s1.eat(s1.isHungry(), s1.getNumOfConesInNest()));
//        System.out.println(s2.eat(s2.isHungry(), s2.getNumOfConesInNest()));

        tree.printSquirellList();
    }
}
