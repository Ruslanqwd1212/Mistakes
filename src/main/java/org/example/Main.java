package org.example;

public class Main {
    public static void main(String[] args) throws Exception{
        DataBase data = new DataBase();
        data.execute("INSERT VALUES LastName=Petrov, Id=1, Age=36, Count = 150");
        data.execute("INSERT LastName=vas, Id=2, Age=, Count = 150");
        data.execute("SELECT VALUES WHERE LastName=Petrov");
    }
}