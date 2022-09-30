package bt;

import java.io.*;
import java.util.ArrayList;

public class IOPhuongTien {
    File file = new File("PhuongTien.txt");

    void write(ArrayList<PhuongTien> phuongTiens){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien p: phuongTiens) {

            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    ArrayList<PhuongTien> read(){
        ArrayList<PhuongTien> phuongTiens = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str!=null){
                String [] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                String hansx = arr[1];
                String namsx = arr[2];
                int giaxe = Integer.parseInt(arr[3]);
                String mauxe = arr[4];

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return phuongTiens;
    }
}
