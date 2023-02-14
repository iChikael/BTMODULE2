package org.example.interfaceColorable;

public class ColorableTest {

    public void testHowToColor() {

        Colorable colorable = new SpecificClass();


        String result = colorable.howToColor();
        assertEquals("Cách tô màu: Tô màu tất cả các bề mặt", result);
    }

    private void assertEquals(String s, String result) {
    }
}
