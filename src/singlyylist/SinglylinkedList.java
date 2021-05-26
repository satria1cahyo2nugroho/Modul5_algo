/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlyylist;

/**
 *
 * @author User
 */
public class SinglylinkedList {
 protected node first;
 protected node last;
 public int size;
 /* Constructor */
 public SinglylinkedList()
 {
 first = null;
 last = null;
 size = 0;
 }
 
 //method untuk mengecek apakah linked list kosong atau tidak
 public boolean isEmpty()
 {
 return first == null;
 }
 //method untuk mengembalikan ukuran linked list sekarang
 public int getSize()
 {
 return size;
 }
 //method untuk memasukkan node di awal linked list
 public void insertAwal(int val)
 {
 
 //buat satu node baru
 node nptr = new node(val, null);
 if(first == null) //jika linked list masih kosong
 {
 first = nptr; 
 last = first;
 }
 
 else
 {
 nptr.setLink(first);
 first = nptr;
 }
 //tambah ukuran linked list
 size++;
 }
 //method untuk memasukkan node di akhir linked list
 public void insertAkhir(int val)
 {
 //buat satu node baru
 node nptr = new node(val, null);
 if(first == null) //jika linked list masih kosong
 {
    first = nptr;
    last = first;
 }
 else
 {
 last.setLink(nptr);
 last = nptr;
 }
 //tambah ukuran linked list
 size++;
 }
 
//method untuk memasukkan node di posisi tertentu
public void insertAtPos(int val, int pos)
{
 //buat satu node baru
 node nptr = new node(val, null);
 if(pos > size)
 System.out.println("Posisi melebihi batas linked list");
 else if(pos == 1)
 insertAwal(val);
 else if(pos == size)
 insertAkhir(val);
 else
 {
 node ptr = first;
 pos = pos - 1;
 for(int i=1; i<size; i++)
 {
 if(i == pos) //ketemu posisi
 {
 node tmp = ptr.getLink();
 ptr.setLink(nptr); 
 nptr.setLink(tmp);
break;
 }
 
 ptr = ptr.getLink();
 }
 //tambah ukuran linked list
 size++;
 }
 }
//method untuk menghapus node di awal linked list
public void deleteAwal()
{
 first = first.getLink();
 size--; //kurangi ukuran linked list
}
//method untuk menghapus node di akhir linked list
public void deleteAkhir()
{
 node temp = first; 
 for(int i=1; i<size-1; i++)
 temp = temp.getLink();
 last = temp;
 last.setLink(null);
 size--; //kurangi ukuran linked list
}
//method untuk menghapus node pada posisi tertentu
public void deleteAtPos(int pos)
{
 if(pos > size)
 System.out.println("Posisi node melebihi ukuran");
 else if(pos == 1)
 this.deleteAwal();
 else if(pos == size)
 this.deleteAkhir();
 else
 {
 node ptr = first;
 pos--;
 for(int i=1; i<=pos; i++)
 {
 if(i == pos)
 {
 node temp = ptr.getLink();
 temp = temp.getLink();
 ptr.setLink(temp);
break;
 }
 ptr = ptr.getLink();
 }
 
 size--;
 }
}
//method untuk menampilkan semua unsur dalam linked list
public void display()
{
 node ptr = first;
 while(true)
 {
 if(ptr == null)
 break;
 System.out.print(ptr.getData() + "->");
 ptr = ptr.getLink();
 }
 System.out.println();

}
    }

