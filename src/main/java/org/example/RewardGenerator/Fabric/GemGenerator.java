package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.GemReward;

public class GemGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
