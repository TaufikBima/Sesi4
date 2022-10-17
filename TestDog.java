package Sesi4;
import Sesi4.Anjing;
import Sesi4.Hewan;

public class TestDog {

   public static void main(String args[]) {
      Hewan a = new Hewan();   // mereferensikan kelas dan objek dari hewan 
      Hewan b = new Anjing();   // mereferensikan kelas hewan namun mereferensikan objek anjing

      a.move();   // menjalankan method di dalam kelas hewan
      b.move();   // menjalankan method didalam kelas anjing
   }
}