package org.example.InMemoryModel;
import java.util.ArrayList;
import java.util.List;

import org.example.ModelElements.*;


public class ModelStore implements IModelChanger {
    public ModelStore(IModelChangerObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.scenes = new ArrayList<Flash>();
        this.flashes = new ArrayList<Scene>();
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        cameras.add(new Camera());
        scenes.add(new Flash());
        flashes.add(new Scene(0, models,flashes,cameras));

    }

    public List<PoligonalModel> models;
    public List<Camera> cameras;
    public List<Scene> flashes;
    public List<Flash> scenes;
    private IModelChangerObserver[] changeObservers;

// Регистрирует изменения
    @Override
    public void notifyChange(IModelChanger sender) {

    }

    public Scene getScene(Integer id){
        return null;
    }
}
