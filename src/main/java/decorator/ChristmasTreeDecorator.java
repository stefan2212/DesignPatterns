package decorator;

import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
public class ChristmasTreeDecorator extends ChristmasTree {
    private List<String> decorations;
    private ChristmasTree tree;

    public void display() {
//        System.out.println("I have a lovely christmas tree " +
//                                   tree +
//                                   " with the following decorations: " +
//                                   decorations);
        System.out.printf("I have a lovely christmas tree %s with the following decorations %s %n",
                          tree, decorations);
    }
}
