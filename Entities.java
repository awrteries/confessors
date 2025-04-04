
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Entities {
    // all the human sprites etc.
    // characters basically
    // i don't know how to make a sprite sheet.
    
    
        private int x, y, dx, dy, w, h;
        private String name, sprite, idleL, idleR, walkD, walkU, walkL, walkR;
        private boolean interaction;

        // constructors

        public Entities(String s, int x1, int y1, int dx1, int dy1, int width, int height, boolean in){
            sprite = s;
            x= x1;
            y = y1;
            dx= dx1;
            dy = dy1;
            w = width;
            h=height;
            interaction = in;
        }
    
        public Entities(){
            
            name = "";
            
            x = 0;
            y = 0;
            dx = 0;
            dy = 0;
            w = 0;
            h = 0;

            idleL = " ";
            idleR = " ";
            walkD = " ";
            walkU = " ";
            walkL = " ";
            walkR = " ";
            sprite = idleR;

        }

        public Entities(String n, int x1, int y1, int dx1, int dy1, int width, int height,
        String s, String iL, String iR, String wD, String wU, String wL, String wR, boolean in){
            
            name = n;
            
            x = x1;
            y = y1;
            dx = dx1;
            dy = dy1;
            w = width;
            h = height;

            sprite = s;
            idleL = iL;
            idleR = iR;
            walkD = wD;
            walkU = wU;
            walkL = wL;
            walkR = wR;

            interaction = in;
        }
        public Entities(String n, int x1, int y1, int dx1, int dy1, int width, int height,
        String s, String iL, String iR, String wD, String wU, String wL, String wR){
            
            name = n;
            
            x = x1;
            y = y1;
            dx = dx1;
            dy = dy1;
            w = width;
            h = height;

            sprite = s;
            idleL = iL;
            idleR = iR;
            walkD = wD;
            walkU = wU;
            walkL = wL;
            walkR = wR;

        }

        // methods

       

        public void drawEntity(Graphics g2d){ // draws the sprite

            g2d.drawImage(new ImageIcon(sprite).getImage(), x, y, w*2, h*2, null);
        }

        public void moveEntity(){ // movement of the sprite

            x += dx;
            y+= dy;
        }

        // getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isInteraction() {
            return interaction;
        }
    
        public void setInteraction(boolean interaction) {
            this.interaction = interaction;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getDx() {
            return dx;
        }

        public void setDx(int dx) {
            this.dx = dx;
        }

        public int getDy() {
            return dy;
        }

        public void setDy(int dy) {
            this.dy = dy;
        }

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public String getIdleL() {
            return idleL;
        }

        public void setIdleL(String idleL) {
            this.idleL = idleL;
        }

        public String getIdleR() {
            return idleR;
        }

        public void setIdleR(String idleR) {
            this.idleR = idleR;
        }

        public String getWalkD() {
            return walkD;
        }

        public void setWalkD(String walkD) {
            this.walkD = walkD;
        }

        public String getWalkU() {
            return walkU;
        }

        public void setWalkU(String walkU) {
            this.walkU = walkU;
        }

        public String getWalkL() {
            return walkL;
        }

        public void setWalkL(String walkL) {
            this.walkL = walkL;
        }

        public String getWalkR() {
            return walkR;
        }

        public void setWalkR(String walkR) {
            this.walkR = walkR;
        }

        public String getSprite() {
            return sprite;
        }

        public void setSprite(String sprite) {
            this.sprite = sprite;
        }


}