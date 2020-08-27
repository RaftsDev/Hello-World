public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted integer Max:"+(myMaxIntValue+1));
        System.out.println("Busted integer Min:"+(myMinIntValue-1));

        int myMaxIntTest = 2_147_483_647;
        long myLongValue = 100;
        long myLongMaxValue = Long.MAX_VALUE;
        long myLongMinValue = Long.MIN_VALUE;
        System.out.println("Long Max:"+myLongMaxValue);
        System.out.println("Long Min:"+myLongMinValue);
        long myNextLongValue = 2_147_483_648L;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        short myNextShortValue = (short)(myMaxShortValue/2);

    }
}
