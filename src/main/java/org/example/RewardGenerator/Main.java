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
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);
        itemGeneratorList.add(f4);
        itemGeneratorList.add(f5);
        itemGeneratorList.add(f6);
        itemGeneratorList.add(f7);
        itemGeneratorList.add(f8);


        public class RewardFactory {
            private final Random rnd = new Random();
        }
        public SilverGenerator createReward(); {
            int randomNumber = rnd.nextInt(14);

            if (randomNumber < 10) {
                return new SilverGenerator();
            } else if (randomNumber < 13) {
                return new GoldGenerator();
            } else {
                return new GemGenerator();
            }
        }
    }
}