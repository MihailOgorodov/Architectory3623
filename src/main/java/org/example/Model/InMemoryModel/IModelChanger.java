package org.example.Model.InMemoryModel;

// Интерфейс смены наблюдателя
public interface IModelChanger {


    public void notifyChange(IModelChanger sender);
}
