public class DatesC {
   public void datesSundey(){

       int gun = 7;
       int aylar[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       for (int yil=1900; yil < 2001; yil++) {
           if(yil>1900 && yil%4==0){
               aylar[1]= 29;
           }
           else {aylar[1]=28;
           }
        for(int ay=0;ay<=12;ay++){
        while(true){

            if(ay == 12){break;}

            int d = aylar[ay];
            if(d == gun-1){

                gun = 1;
                ay++;
                if(ay == 12){break;}
                System.out.println(gun +"/"+ ( ay +1 ) +"/"+yil);

            }
            if (d < gun-1){
                ay++;
                gun = gun - d;
            }

            gun = gun +7;





        }

    }
}

       }
   }

