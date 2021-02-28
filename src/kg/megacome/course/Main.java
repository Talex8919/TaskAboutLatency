package kg.megacome.course;

import com.sun.jmx.remote.internal.ArrayQueue;

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
            int bb= (int)Math.random()*(2001+1)+1;
            acerBrandsLinK.add(2_000_000, new Integer(bb));
        }
        System.out.println("Added 2_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointA)+"ms");


        List<Integer> asusBrandsLink = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointB=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(1501+1)+1;
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
            int bb= (int)Math.random()*(3501+1)+1;
            acerBrandsLinK.add(7_000_000, new Integer(bb));
        }
        System.out.println("Added 7_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointC)+"ms");


        List<Integer> taroCardsArList = new ArrayList<>();

        for (int i = 0; i < 7_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointD=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(4501+1)+1;
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
            int bb= (int)Math.random()*(7501+1)+1;
            acerBrandsLinK.add(9_000_000, new Integer(bb));
        }
        System.out.println("Added 9_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointCD)+"ms");


        List<Integer> pokerCardArList = new ArrayList<>();

        for (int i = 0; i < 9_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointDC=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(5501+1)+1;
            asusBrandsLink.add(9_000_000, new Integer(bb));
        }
        System.out.println("Added 9_000_000 into ArrayList  and Latency is " + (System.currentTimeMillis()-PointDC)+" ms");
        System.out.println("________________Fourth Assessment");
        List<Integer> cardsForTricks = new ArrayList<>();

        for (int i = 0; i < 11_000_000; i++) {

            asusBrandsLink.add(new Integer(i));
        }

        long PointDCE=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(3651+1)+1;
            asusBrandsLink.add(11_000_000, new Integer(bb));
        }
        System.out.println("Added 11_mil into ArrayList  and Latency is " + (System.currentTimeMillis()-PointDCE)+"ms");

        List<Integer> asusBrand = new LinkedList<>();

        for (int i = 0; i < 11_000_000; i++) {

            acerBrandsLinK.add(new Integer(i));
        }

        long PointCDF=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            int bb= (int)Math.random()*(4151+1)+1;
            acerBrandsLinK.add(11_000_000, new Integer(bb));
        }
        System.out.println("Added 11_000_000 into LinkedList  and Latency is " + (System.currentTimeMillis()-PointCDF)+"ms");
        System.out.println();


        List <Integer> smpartphones = new LinkedList<>();
        for (int i =0 ; i< 10_000_000; i++){
            smpartphones.add(new Integer(i));
        }
        long regress= System.currentTimeMillis();
        for (int i =0; i<100;i++){
            int bbds=(int)Math.random()*(1591 +1)+1;
            smpartphones.add(10_000_000, new Integer(bbds));
        }
        Collections.sort(smpartphones);
        Collections.fill(smpartphones,Integer.MIN_VALUE );
        System.out.println("Create LinkedList 50 mil than full fill them randomely , sort,fill all :integer.MIN_VALUE: Latency is " + (System.currentTimeMillis()-regress)+"ms");


        List <Integer> nokiaPhones = new ArrayList<>();
        for (int i =0 ; i< 50_000_000; i++){
            nokiaPhones.add(new Integer(i));
        }
        long  pushingUp= System.currentTimeMillis();
        for (int i =0; i<100;i++){
            int bbds=(int)Math.random()*(4581 +1)+1;
            nokiaPhones.add(50_000_000,new Integer(bbds) );
        }
        Collections.sort(nokiaPhones);
Collections.fill(nokiaPhones, Integer.MAX_VALUE*150);
        System.out.println("Create ArrayList 50 mil than fill them randomly , sort,fill,  all :Integer.numberOfTrailingZeros(1500)) and shuffle : Latency is  " + (System.currentTimeMillis()-pushingUp)+"ms");
        System.out.println();
        System.out.println("Next Operation ");

        List<Integer> sumsungMobile= new ArrayList<>();
        for(int i = 0 ; i < 35_000_000;i++){
            sumsungMobile.add(new Integer(i));
        }
        long eperiment= System.currentTimeMillis();
        for (int i=0; i< 100;i++){
            int bbds=(int)Math.random()*(3611 +1)+1;
sumsungMobile.add(35_000_000,  new Integer(bbds));
        }
        Collections.sort (sumsungMobile);
        Collections.fill(sumsungMobile, Integer.numberOfTrailingZeros(1500));
        Collections.shuffle(sumsungMobile);
        System.out.println(" creating arraylist and fii sumsungMobile  then fill it   by int.numberOfTrailingZeros and shuffle again "+ (System.currentTimeMillis()-eperiment)+" ms");



        List<Integer>philipsStationary= new LinkedList<>();
        for (int i =0; i< 75_000_000; i++){
            philipsStationary.add(new Integer(i));
        }
long unusual= System.currentTimeMillis();
        for (int i=0;i<100;i++){
            int bbds=(int)Math.random()*(7501 +1)+1;
            philipsStationary.add(75_000_000, new Integer(bbds));
        }
Collections.sort(philipsStationary);
        Collections.rotate(philipsStationary,50);

Collections.fill(traditionalCard,Integer.MAX_VALUE/10*100);
        System.out.println("Create Linked list of 75mil then fill them randomly of (55582) sort,rotate and  fill them(Integer.MAX_VALUE/10*100) " + (System.currentTimeMillis()-unusual)+"ms" );

        System.out.println();
        System.out.println("Last Test" );

        List <Integer>numbersOfCrystals= new ArrayList<>();
        for (int i=0;i< 25_000_000; i++){
            numbersOfCrystals.add(new Integer(i));
        }
        long lastTest= System.currentTimeMillis();
        for (int i=0;i<100;i++) {
            int bbc = (int) Math.random() * (570 + 1) + 1;
numbersOfCrystals.add(25_000_000, bbc);
        }
        Collections.sort(numbersOfCrystals);
        Collections.fill(numbersOfCrystals,Integer.MIN_VALUE*100/2);
        Collections.shuffle(numbersOfCrystals);
        Collections.nCopies(85,numbersOfCrystals);
        System.out.println("Create and fill ArrayList by random numbers then sort them,fill,Shuffle and  do n copies latency   "+ (System.currentTimeMillis()-lastTest)+" ms" );
    }
}