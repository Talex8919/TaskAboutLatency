package kg.megacome.course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("_______________First assessment");
        List<Integer> acerBrandsLinK = new LinkedList<>();

        for (int i = 0; i < 2_000_000; i++) {

            acerBrandsLinK.add(new Integer(i));
        }

        long PointA=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            acerBrandsLinK.add(2_000_000, new Integer(bb));
        }
        System.out.println("Added 2_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointA)+"ms");


        List<Integer> asusBrandsLink = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointB=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            asusBrandsLink.add(2_000_000, new Integer(bb));
        }
        System.out.println("Added 2_000_000 into ArrayList  and Latency is " + (System.currentTimeMillis()-PointB)+"ms");

        System.out.println("_______________Second assessment");
        List<Integer> hpBrandLink = new LinkedList<>();

        for (int i = 0; i < 7_000_000; i++) {

            acerBrandsLinK.add(new Integer(i));
        }

        long PointC=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            acerBrandsLinK.add(7_000_000, new Integer(bb));
        }
        System.out.println("Added 7_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointC)+"ms");


        List<Integer> taroCardsArList = new ArrayList<>();

        for (int i = 0; i < 7_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointD=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            asusBrandsLink.add(7_000_000, new Integer(bb));
        }
        System.out.println("Added 7_000_000 into ArrayList  and Latency is " + (System.currentTimeMillis()-PointD)+"ms");
        System.out.println("________________Third Assessment");
        List<Integer> traditionalCard = new LinkedList<>();

        for (int i = 0; i < 9_000_000; i++) {

            acerBrandsLinK.add(new Integer(i));
        }

        long PointCD=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            acerBrandsLinK.add(9_000_000, new Integer(bb));
        }
        System.out.println("Added 9_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointCD)+"ms");


        List<Integer> pokerCardArList = new ArrayList<>();

        for (int i = 0; i < 9_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointDC=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            asusBrandsLink.add(9_000_000, new Integer(bb));
        }
        System.out.println("Added 9_000_000 into ArrayList  and Latency is " + (System.currentTimeMillis()-PointDC)+"ms");
        System.out.println("________________Fourth Assessment");
        List<Integer> cardsForTricks = new ArrayList<>();

        for (int i = 0; i < 11_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointDCE=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            asusBrandsLink.add(11_000_000, new Integer(bb));
        }
        System.out.println("Added 11_000_000 into ArrayList  and Latency is " + (System.currentTimeMillis()-PointDCE)+"ms");

        List<Integer> asusBrand = new LinkedList<>();

        for (int i = 0; i < 11_000_000; i++) {

            acerBrandsLinK.add(new Integer(i));
        }

        long PointCDF=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1000+1)+1;
            acerBrandsLinK.add(11_000_000, new Integer(bb));
        }
        System.out.println("Added 11_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointCDF)+"ms");


    }
}