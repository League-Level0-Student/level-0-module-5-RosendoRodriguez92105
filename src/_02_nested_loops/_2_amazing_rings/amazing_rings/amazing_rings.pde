
void setup() {
  size(900,800);
}
int x=720;
int y=300;
int a=150;
int b=300;
int speedVariable = -1;
void draw() {
  if(x > 720) {
    speedVariable  = -speedVariable;
  } else if(x < 300) {
    speedVariable = -speedVariable;
  }
  
  x += speedVariable;
  a-= speedVariable;
background(255,255,255);
  for ( int i =12; i>0; i--) {
   
   if(i % 2 == 0){
     noFill ();
   } else{
   noFill();
   }
  ellipse( x, y, i*20, i*20);
  }
    for ( int i =12; i>0; i--) {
   
   if(i % 2 == 0){
     noFill ();
   } else{
   noFill();
   }
  ellipse( a, b, i*20, i*20);
    }
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
