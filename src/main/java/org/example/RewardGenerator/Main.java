package org.example.RewardGenerator;

import org.example.RewardGenerator.Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        ItemGenerator f1 = new GemGenerator();
        f1.openReward();

        ItemGenerator f2 = new GoldGenerator();
        f2.openReward();

        ItemGenerator f3 = new SilverGenerator();
        f3.openReward();

        ItemGenerator f4 = new AdamantGenerator();
        f4.openReward();

        ItemGenerator f5 = new BronzeGenerator();
        f5.openReward();

        ItemGenerator f6 = new DamaskGenerator();
        f6.openReward();

        ItemGenerator f7 = new MithrilGenerator();
        f7.openReward();

        ItemGenerator f8 = new PlatinumGenerator();
        f8.openReward();

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        itemGeneratorList.add(f1);
        for (int i = 0; i < 3; i++) {
            itemGeneratorList.add(f2);
        }
        for (int i = 0; i < 10; i++) {
            itemGeneratorList.add(f3);
            itemGeneratorList.add(f4);
            itemGeneratorList.add(f5);
            itemGeneratorList.add(f6);
            itemGeneratorList.add(f7);
            itemGeneratorList.add(f8);
        }

        for (int i = 0; i < 100; i++) {
            int index = new Random().nextInt(itemGeneratorList.size());
            itemGeneratorList.get(index).openReward();
        }
    }
}
