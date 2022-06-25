package com.example.contohm2;

import java.util.ArrayList;
import java.util.List ;

public class KatalogFotoUtil {
      private static int[] ridArray={
              R.drawable._0160918_102351,
              R.drawable._0180322_185549,
      };

      private static String[] filenameArray={
              "0160918_102351",
              "0180322_185549"
      };

      private static List<KatalogFoto> katalogFotoList;

      public static void init(){
            katalogFotoList=new ArrayList<>();
            int nArray= ridArray.length;;
            for(int i=0; i<nArray; i++){
                  katalogFotoList.add(new KatalogFoto(ridArray[i],filenameArray[i]));
            }
      }

      public static List<KatalogFoto> getKatalogFotoList() {
            return katalogFotoList;
      }

      public static KatalogFoto getKatalogFotoAt(int i) {
            return katalogFotoList.get(i);
      }

}
