void setup() {
  size(600, 600);
}

void draw() {

  for (int i = 200; i > 0; i = i-15) {
  ellipse(300, 300, i, i);
  
  int a = i % 10;
  if(a == 0) {
    fill(255, 0, 0);
  }
  else {
    fill(255, 255, 255);
  }
    
  }
}