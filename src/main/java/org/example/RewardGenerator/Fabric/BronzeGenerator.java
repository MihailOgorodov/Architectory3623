package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.BronzeReward;

public class BronzeGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new BronzeReward();
    }
}
