public class Animal{
    //contract;
    interface AnimalAction{
        void moving();
        void communicating();
    }

    public void animalBehavior(){
        //local class;
        class Wolf implements AnimalAction{
            public void moving(){System.out.println("wolf moving fast with four foot.");}
            public void communicating(){System.out.println("wolf communicating with their hurling.");}
        }

        //anonyme class;
        AnimalAction bird = new AnimalAction(){
            public void moving(){System.out.println("bird flying fast.");}
            public void communicating(){System.out.println("bird sing the song.");}
        };

        AnimalAction fish = new AnimalAction(){
            public void moving(){System.out.println("fish swimming.");}
            public void communicating(){System.out.println("fish communicating with their body language.");}
        };

        //action;
        Wolf wolf = new Wolf();
        wolf.moving();
        wolf.communicating();

        bird.moving();
        bird.communicating();

        fish.moving();
        fish.communicating();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalBehavior();
    }
}
