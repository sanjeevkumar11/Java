import java.util.*;

class Box {
    int x1, x2, y1, y2;
    int area;
    String str;

    Box(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.area = Math.abs((x2 - x1) * (y2 - y1));
    }

    int getAsciiSum() {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) c;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int numBoxes = sc.nextInt();

        Box[] boxes = new Box[numBoxes];

        
        for (int i = 0; i < numBoxes; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            boxes[i] = new Box(x1, x2, y1, y2);
            boxes[i].str = sc.next();
        }

        int R = sc.nextInt();

        
        Arrays.sort(boxes, new Comparator<Box>() {
            
            public int compare(Box a, Box b) {
                if (b.area != a.area)
                    return b.area - a.area;
                if (a.x1 != b.x1)
                    return a.x1 - b.x1;
                if (a.y1 != b.y1)
                    return a.y1 - b.y1;
                return b.getAsciiSum() - a.getAsciiSum();
            }
        });

        Box chosenBox = boxes[R - 1];
        int asciiSum = chosenBox.getAsciiSum();
        System.out.println(asciiSum);

        sc.close();
    }
}
