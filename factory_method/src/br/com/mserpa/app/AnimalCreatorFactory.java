package br.com.mserpa.app;



public class AnimalCreatorFactory implements AnimalCreator{

    @Override
    public Animal createAnimal(String type) {
        switch (type){
            case "C": return new Cat();
            case "D": return new Duck();
        }
        return null;
    }

}
