package decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = ChristmasTree.builder()
                .type("Artificial")
                .height(150)
                .weight(5)
                .build();
        tree.display();
        System.out.println();
        ChristmasTree decorateDtree = ChristmasTreeDecorator.builder()
                .tree(tree)
                .decorations(List.of("Lights", "Globes", "Candy"))
                .build();
        decorateDtree.display();
    }


}
