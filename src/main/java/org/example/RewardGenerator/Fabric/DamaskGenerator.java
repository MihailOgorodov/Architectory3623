package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.DamaskReward;

public class DamaskGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new DamaskReward();
    }
}
