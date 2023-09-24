package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.PlatinumReward;

public class PlatinumGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new PlatinumReward();
    }
}
