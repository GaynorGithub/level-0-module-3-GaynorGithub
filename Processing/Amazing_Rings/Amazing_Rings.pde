void setup() {
  size(1200, 600);
}

void draw() {
  for (int j = 0; j < 1200; j = j+20) {
    for (int i = 0; i < 400; i = i+15) {
      ellipse(j, 300, i, i);
      noFill();
    }
    
  }
}