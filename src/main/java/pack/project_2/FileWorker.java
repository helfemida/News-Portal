package pack.project_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileWorker {
    final String FILEPATH = "src/main/java/pack/project_2/sources/users.txt";
    public ArrayList<String> readFile(String nameOfFile){
        File file = new File(nameOfFile);
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
            while(s != null){
                String[] strings = s.split(" ");
                list.addAll(Arrays.asList(strings));
                s = reader.readLine();
            }
            reader.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
        return list;
    }
    public void addNewData(String username, String name, String gender, String password){
        username = validLine(username);
        name = validLine(name);
        if(gender.contains("binary"))
            gender = "non-bin";
        File file = new File(FILEPATH);

        String data = validLine("username:" + username) +"\n"
                + validLine("name:" + name) + "\n"
                + validLine("gender:" + gender) +"\n"+
                validLine("password:" + password) + "\n";
        try{
            RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(data.getBytes());
            randomAccessFile.write("\n".getBytes());
            randomAccessFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private String validLine(String s){
        StringBuilder res = new StringBuilder();
        if(s.length()>19)
            return s.substring(0,19);
        else if(s.length()<19) {
            for (int i = 0; i <19; i++) {
                if(i<s.length()){
                    res.append(s.charAt(i));
                    continue;
                }
                res.append(" ");
            }
        }
        return res.toString();
    }
    public void updateInfo(String username, String password){
        ArrayList<String> list = readFile(FILEPATH);
        try {
            int j = 0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).contains(username)) {
                    j = i + 3;
                    break;
                }
            }
            String s = list.get(j).substring(0,9) + password;
            list.set(j,s);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        File file = new File(FILEPATH);
        try{
            boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String s : list) {
                writer.write(s + "\n");
            }
            writer.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public boolean validUsername(String username){
        ArrayList<String> list = readFile(FILEPATH);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("username") && list.get(i).substring(9).equals(username))
                return true;
        }
        return false;
    }
    public boolean checkPass(String username, String password){
        ArrayList<String> list = readFile(FILEPATH);
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(username)){
                j = i+3;
                break;
            }
        }
        if(list.get(j).substring(9).equals(password)){
            return true;
        }
        return false;
    }
}
