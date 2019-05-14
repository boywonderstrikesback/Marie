/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marie;

import java.io.*; 



class Marie{
  
    public static void main(String args[]){
    try{
      String file ="/Users/mikeross/Desktop/input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int total =0;
            
            String passone=null;
         
            while((passone = reader.readLine()) != null)
            {total++;}
            
            
            System.out.println("Pass One: ");
            String[][] operater = new String[total][3];
            
            BufferedReader reader2=new BufferedReader(new FileReader(file));
            String passtwo=null;
            int Loca=5670;
            int i=0;
            String operate;
            while((passtwo=reader2.readLine()) != null){
                if ((passtwo.length()) <=4)
                    
                    operate = " ";
                
                else
                { operate=passtwo.substring(5);}
                
                String binary= Integer.toBinaryString(Loca);
                String dex= Integer.toString(Loca);
                operater[i][0]=dex;
                operater[i][1]=operate;
                operater[i][2]=binary;
                Loca--;
                i++;
            }
            int l=0;
            
            System.out.println("Loca\t"+"Operator\t"+"Binary\t");
            
            while(l < total){
                
                System.out.print(operater[l][0]);
                
                System.out.print("\t");
                
                System.out.print(operater[l][1]);
                          
                System.out.print("\t");
                
                System.out.println(operater[l][2]);
                
                l++;}
            System.out.println("Pass Two: ");
            String[] [] opco= new String[][]{
                
                {"0000", "LOAD"},
                {"0001", "STOP"},
                {"0010", "ADDs"},
                {"1110", "ADDx"},
                {"0011", "SUB"},
                {"0100", "JPOS"},
                {"0101", "JZER"},
                {"0110", "JUMP"},
                {"0111", "LOCO"},
                {"1000", "LODL"},
                {"1001", "STODL"},
                {"1010", "ADDL"},
                {"1011", "SUBL"},
                {"1100", "JNEG"},
                {"1101", "JNZE"},
                {"1111000000000000", "PSHI"},
                {"1111001000000000", "POPI"},
                {"1111010000000000", "PUSH"},
                {"1111011000000000", "POP"},
                {"1111100000000000", "RETN"},
                {"1111101000000000","SWAP"},
                {"11111100","INSP"},
                {"11111110", "DESP"}};
            BufferedReader reader3= new BufferedReader(new FileReader(file));
          try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
              String OPC;
              String line="  ";
              int c=0;
              
              while ((passone=reader3.readLine()) != null)
              {if ((passone.length()) <16){
                  OPC=passone.substring(0);}
              else {OPC=passone.substring(4,4);}
              
              System.out.print(OPC);
              System.out.print("\t");
              
              
              writer.write(line);
              String op = operater[c][2];
              
              c++;
              System.out.println(line);
              writer.write(op);
              writer.newLine();
              }
          }
        }

  }

      catch (IOException e){ System.out.println("(0)Catch");}

         }

    }


    
