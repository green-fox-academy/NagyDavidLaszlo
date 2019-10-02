package garden;

public class Tree extends Plants{
/*
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4
 */

public Tree(String color){
  this.absorbationLimit=10;
  this.absorbationRate= 0.40;
  this.waterAmount =0;
  this.color = color;
}




}
