public class ConversaoDeDados {
    public static void main(String[] args) {
        String str ="100";
            System.out.println(Integer.valueOf(str));
            System.out.println(Byte.valueOf(str));
            System.out.println(Short.valueOf(str));
            System.out.println(Float.valueOf(str));
            System.out.println(Double.valueOf(str));
            System.out.println("_____________________________________________");
        Byte b = 10;
            System.out.println(b.intValue());
            System.out.println(b.shortValue());
            System.out.println(b.floatValue());
            System.out.println(b.doubleValue());
            System.out.println(b.toString());
        System.out.println("_____________________________________________");
        Double c = 1567.89594759475984;
        System.out.println(c.intValue());
        System.out.println(c.floatValue());


    }
}
