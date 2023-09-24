package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.AdamantReward;
import org.example.RewardGenerator.Product.ItemReward;

public class AdamantGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new AdamantReward();
    }
}
