package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.SilverReward;

public class SilverGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
