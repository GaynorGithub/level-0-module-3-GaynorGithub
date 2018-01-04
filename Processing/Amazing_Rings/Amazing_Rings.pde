int x1 = 300;
int x2 = 900;
int move = 1;
void setup() {
  size(1200, 600);
}

void draw() {
  background(255, 255, 255, 255);
  if (x1 > 1000 || x1 < 200){
    move *= -1;
  }
    for (int i = 0; i < 400; i = i+10) {
      ellipse(x1, 300, i, i);
      noFill();
      
    }
    for (int i = 0; i < 400; i = i+10) {
      ellipse(x2, 300, i, i);
      noFill();
      
    }
    
    x1 = x1 + move;
    x2 = x2 - move;
    //delay(20);
    
    
    
  
}