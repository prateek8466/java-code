class Animal {
  public void makeSound() {
    System.out.println("The animal is making some sound.");
   }
}
  class Prog40 {
   public static void main(String[] args) {
    Animal dog = new Animal() {
@Override
  public void makeSound() {
    System.out.println("Woof woof!!");
  }
};
  dog.makeSound();
  }
}