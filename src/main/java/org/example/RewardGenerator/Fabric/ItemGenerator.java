package org.example.RewardGenerator.Fabric;

import org.example.RewardGenerator.Interface.IGameItem;

public abstract class ItemGenerator {
    public abstract IGameItem createItem();

    public void openReward(){
        createItem().open();
    }
}
