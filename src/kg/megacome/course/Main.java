package kg.megacome.course;

import java.sql.SQLOutput;
import java.util.*;

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
        System.out.println();
        System.out.println("altering acerBrandsLinK (11 millions) which has random input integers into static Int MAX and MIN Value    ");
        long regress= System.currentTimeMillis();
        Collections.sort(acerBrandsLinK);
        Collections.fill(acerBrandsLinK,Integer.MIN_VALUE );
        System.out.println("Altering tables in LinkedList and fill int-Min Value, Latency is " + (System.currentTimeMillis()-regress)+"ms");

        long  pushingUp= System.currentTimeMillis();
        Collections.sort(asusBrand);
Collections.fill(asusBrand, Integer.MAX_VALUE*150);
        System.out.println("Altering tables in ArrayList and fill them Int-Max.val, Latency is " + (System.currentTimeMillis()-pushingUp)+"ms");
        System.out.println();
        System.out.println("Next Operation ");
        long eperiment= System.currentTimeMillis();
        Collections.sort (pokerCardArList);
        Collections.fill(pokerCardArList,Integer.numberOfTrailingZeros(1500));
        Collections.shuffle(pokerCardArList);
        System.out.println("Do sorting  the  9_000_000 PokerCardArrayList  then fill it   by int.numberOfTrailingZeros and shuffle again"+ (System.currentTimeMillis()-eperiment)+"ms");

long unusual= System.currentTimeMillis();
Collections.sort(traditionalCard);
        Collections.rotate(traditionalCard,50);
        int bb= (int)Math.random()*(9852+1)+1;
Collections.fill(traditionalCard,bb);
        System.out.println("Do sorting  the  9_000_000 traditionalCard LinkList  then fill it   by random numbers ); then rotate them again" + (System.currentTimeMillis()-unusual)+"ms" );

        System.out.println();
        System.out.println("Last Test" );
        long lastTest= System.currentTimeMillis();
        int bbc= (int)Math.random()*(5985+1)+1;
        Collections.sort(hpBrandLink);
        Collections.fill(hpBrandLink,bbc);
        Collections.shuffle(hpBrandLink);
        Collections.nCopies(85,hpBrandLink);
        System.out.println("Do sorting  the 7_000_000  then fill random numbers   then shaffle in the end  do .ncopies , and  latency  is  "+ (System.currentTimeMillis()-lastTest)+"ms" );
    }
}