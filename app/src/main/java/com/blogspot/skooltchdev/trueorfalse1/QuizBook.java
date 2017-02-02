package com.blogspot.skooltchdev.trueorfalse1;


public class QuizBook {

    public static String[] questions = new String [] {
            "Magneti imaju dva pola.",
            "Magneti imaju istočni pol.",
            "Zemlja nije namagnetisana.",
            "Magnetna polja se jasno mogu videti pod golim okom.",
            "Dijagram pokazuje privlačnost između polova",
            "Magnet može privući gvozdeni ekser.",
            "Elektromagnet koristi naizmenične struje",
            "Elektromagnet je privremeno namagnetisan.",
            "Magnet sa slike je magnetni disk.",
    };

    public static int[] images = new int [] {
            R.drawable.img_0512, R.drawable.img_0516, R.drawable.img_0521, R.drawable.img_0522,
            R.drawable.img_0523, R.drawable.img_0525, R.drawable.img_0526, R.drawable.img_0527,
            R.drawable.img_0528
    };

    public static boolean[] answers = new boolean[]{
            true, false, false, false, true, true, false, true, true
    };
}
