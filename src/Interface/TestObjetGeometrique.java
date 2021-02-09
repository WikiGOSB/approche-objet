package Interface;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique[] obj = new ObjetGeometrique[2];

        obj[0] = new Cercle(2);
        obj[1] = new Rectangle(5, 5);

        for (ObjetGeometrique element : obj){
            System.out.println(element.perimetre());
            System.out.println(element.surface());
        }
    }
}
