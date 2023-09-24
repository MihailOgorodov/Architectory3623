package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;
import org.example.RewardGenerator.Product.ItemReward;
import org.example.RewardGenerator.Product.MithrilReward;

public class MithrilGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new MithrilReward();
    }
}
