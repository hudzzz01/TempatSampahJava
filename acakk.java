//Program mengacak 11 buah data
//M. Hudzaifah assyahid
// 5 april 2020

import java.util.Random;
import java.util.Scanner;


class acakk
{

	public static void main (String args [])
	{
		Scanner hudzin = new Scanner(System.in);
		Random hudzzrandom = new Random();

		String [] nama  = new String [11];
		String [] hasil  = new String [11];
		int [] ulang = {0,0,0,0,0,0,0,0,0,0,0};

		//int i = 0;

		System.out.print("Masukan Nama-Nama yang ingin di acak : \n");

		for (int i = 0; i < 11; i++ )
		{	
			System.out.print(i + 1);
			System.out.print(" ");
			nama[i] = hudzin.nextLine();
                        

		}

		String uwu = nama[10];
		int i = 0;
		while (i <11)
		{
                    int j = i;
                    for ( j = 0; j < 11; j++)
		{
			System.out.print(j + 1);
			System.out.println( hasil[j]);
		}
                    
                            		
			int acak = hudzzrandom.nextInt(10);
                        System.out.println("heoi" + i + " " + acak );
			boolean cek = false;

			switch (acak)
			{
				case 0:
				if (ulang[0] == 0)
				{
					hasil[i] = nama[0];
					ulang[0]++;
					cek = true;
					break;
				}
				
				case 1:
				if (ulang[1] == 0)
				{
					hasil[i] = nama[1];
					ulang[1]++;
					cek = true;
					break;
				}

				case 2:
				if (ulang[2] == 0)
				{
					hasil[i] = nama[2];
					ulang[2]++;
					cek = true;
					break;
				}
				
				case 3:
				if (ulang[3] == 0)
				{
					hasil[i] = nama[3];
					ulang[3]++;
					cek = true;
					break;
				}
				
				case 4:
				if (ulang[4] == 0)
				{
					hasil[i] = nama[4];
					ulang[4]++;
					cek = true;
					break;
				}
				

				case 5:
				if (ulang[5] == 0)
				{
					hasil[i] = nama[5];
					ulang[5]++;
					cek = true;
					break;
				}
				
				case 6:
				if (ulang[6] == 0)
				{
					hasil[i] = nama[6];
					ulang[6]++;
					cek = true;
					break;
				}
				
				case 7:
				if (ulang[7] == 0)
				{
					hasil[i] = nama[7];
					ulang[7]++;
					cek = true;
					break;
				}
				
				case 8:
				if (ulang[8] == 0)
				{
					hasil[i] = nama[8];
					ulang[8]++;
					cek = true;
					break;
				}
				
				case 9:
				if (ulang[9] == 0)
				{
					hasil[i] = nama[9];
					ulang[9]++;
					cek = true;
					break;
				}
				
				
				case 10:
				if (ulang[10] == 0)
				{
					hasil[i] = nama[10];
					ulang[10]++;
					cek = true;
					break;
				}
				

			}
                        
			if (cek == true)
			{
				i++;
			}
                        

			


		}

		System.out.println("\n hasilnya adalah :");

		for ( i = 0; i < 11; i++)
		{
			System.out.print(i + 1);
			System.out.println( hasil[i]);
		}


	}




}
