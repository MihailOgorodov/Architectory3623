package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.GoldReward;
import org.example.RewardGenerator.Product.ItemReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
