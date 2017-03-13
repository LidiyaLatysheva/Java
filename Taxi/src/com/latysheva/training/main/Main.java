package com.latysheva.training.main;

import com.latysheva.training.action.Action;
import com.latysheva.training.action.InputOutput;
import com.latysheva.training.comparator.PriceComparator;
import com.latysheva.training.comparator.RegNumberComparator;
import com.latysheva.training.exception.IncorrectInputDataException;
import com.latysheva.training.factory.TaxiStationCreator;
import com.latysheva.training.item.Auto;
import com.latysheva.training.item.TaxiStation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    static final String FILEPATH = "resource\\correct.txt";
    static final String FILEPATHWRITE = "resource\\result.txt";
    static final String FILEPATHWRITE1 = "resource\\resultSort.txt";


    public static void main(String[] args) {
/*        ArrayList<String> str = InputOutput.readFromFile(FILEPATH);
        int size = str.size();
        //TaxiStation tst =  TaxiStationCreator.createTaxiStation(FILEPATH);
        //int size =  tst.getTaxiStationAuto().size();
        for (int i=0; i<size; i++){
            //System.out.println(tst.getTaxiStationAuto().get(i));
            System.out.println(str.get(i));
        }*/
        //String str = "CAR AudiA6 3322re4 20 20 3 1";


        TaxiStation taxiStation1 = TaxiStationCreator.createTaxiStation(FILEPATH);
        ArrayList<Auto> tmp = taxiStation1.getTaxiStationAuto();

        //ArrayList<Auto> tmp1 = Search.searchByModel(tmp, "AudiA36");
        //ArrayList<Auto> tmp1 = Collections.sort(tmp, new RegNumberComparator());
        PriceComparator priceComp = new PriceComparator();
        RegNumberComparator regNumberComp = new RegNumberComparator();
        Collections.sort(tmp, priceComp.thenComparing(regNumberComp));
        for (int i=0; i<tmp.size(); i++){
                System.out.println(tmp.get(i).toString());
        }
        InputOutput.printResultAutoListToFile(tmp, FILEPATHWRITE1);
        //InputOutput.printResultTaxiStationToFile(taxiStation1, FILEPATHWRITE);
    }


}
