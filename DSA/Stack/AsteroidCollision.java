package DSA.Stack;

import java.util.ArrayList;

/*O(2N)-TC   O(N)-SC */
public class AsteroidCollision {
    /* +ve--> right move
     * -ve--> left move
     * +,-  or  same +,-  -->collision
     * mod|value| -->+ve, -ve
     * smaller value is destroyed
     *return values left at last
    */
    public static int[] collision(int[] asteroid){
        ArrayList<Integer> list=new ArrayList<>();

        for(int ast : asteroid){
            boolean destroyed=false;

            //+ve, -ve
            while(!list.isEmpty() && ast < 0 && list.get(list.size()-1) > 0){
                if(Math.abs(ast) > list.get(list.size()-1)){
                    list.remove(list.size()-1);// Current asteroid destroys the one in the list
                }
                else if(Math.abs(ast) == list.get(list.size()-1)){
                    list.remove(list.size()-1); // Both asteroids destroy each other
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;// The asteroid in the list destroys the current asteroid
                    break;
                }
            }
            if(!destroyed){
                list.add(ast);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5}; // Example asteroids
        int[] result = collision(asteroids); 

        System.out.print("Final state of asteroids: ");
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
    }
}

/*import java.util.Stack;

class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            // This flag checks if the current asteroid has been destroyed.
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > stack.peek()) {
                    stack.pop(); // Current asteroid destroys the one on the stack
                } else if (Math.abs(asteroid) == stack.peek()) {
                    stack.pop(); // Both asteroids destroy each other
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // The asteroid on the stack destroys the current asteroid
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert the stack to an array with final results
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5}; // Example asteroids
        int[] result = asteroidCollision(asteroids);

        System.out.print("Final state of asteroids: ");
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
    }
}
 */