package 濠っ晦;

import java.text.DecimalFormat;

public class Controller extends Thread{

	
	public static void cls() {
		for(int i = 1 ; i <= 60; i++) {
			System.out.println();
		}
	}

	public static void �飛橨漞繡瑆珛�() {
		DecimalFormat df = new DecimalFormat("#,##0");
		while(true) {
			if(Drink.唳堅�蝦�>=4) {
				break;
			}
			for(int i = 0 ; i < 2 ; i++) {
				if(i == 0) {
					cls();
					String money = df.format(Drink.濠旎);
					System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖 ");
					System.out.println("  弛                                                            弛 ");
					System.out.println("  弛     ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤   ﹤       ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤     ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤     弛 ");
					System.out.println("  弛         ﹤﹤       ﹤         ﹤  ﹤     ﹤﹤﹤          ﹤   ﹤     弛 ");
					System.out.println("  弛         ﹤﹤       ﹤         ﹤  ﹤     ﹤           ﹤    ﹤     弛 ");
					System.out.println("  弛        ﹤  ﹤      ﹤﹤﹤     ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤          ﹤     ﹤     弛 ");
					System.out.println("  弛       ﹤    ﹤     ﹤                            ﹤      ﹤     弛        ***********************************");
					System.out.printf ("  弛      ﹤      ﹤    ﹤         ﹤                 ﹤       ﹤     弛                       憲葡っ                 \n");
					System.out.printf ("  弛     ﹤        ﹤   ﹤         ﹤                ﹤        ﹤     弛        %-15s 唳堅 �蝦�:%s              \n","Level : " + Drink.衛除離檜,Drink.唳堅�蝦�);
					System.out.printf ("  弛                  ﹤         ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤     ﹤         ﹤     弛        %-30s              \n",Drink.詭衛雖.get(4));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(3));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(2));
		            System.out.printf ("  弛        COLA         FANTA        CIDER      RED BULL       弛        %-30s              \n",Drink.詭衛雖.get(1));
		            System.out.printf ("  弛     忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖     弛        %-30s              \n",Drink.詭衛雖.get(0));
		            System.out.println("  弛     弛         弛  弛 ###     弛  弛    #    弛  弛####弛    弛     弛        ***********************************");
		            System.out.println("  弛     弛COCA COLA弛  弛  ###    弛  弛# # # # #弛  弛####弛    弛     弛 ");
		            System.out.println("  弛     弛     ####弛  弛         弛  弛  # # #  弛  弛####弛    弛     弛                      ⑷營 濠旎  ");
		            System.out.println("  弛     弛####*####弛  弛 F A N   弛  弛# # # # #弛  弛    弛####弛     弛                      " + money);
		            System.out.println("  弛     弛####*    弛  弛     T A 弛  弛    #    弛  弛    弛####弛     弛 ");
		            System.out.println("  弛     弛         弛  弛         弛  弛  CIDER  弛  弛    弛####弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎     弛                      幗が嬪纂");
					System.out.printf ("  弛        %3d          %3d           %3d          %3d         弛        忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n",Drink.屬塭,Drink.�級�,Drink.餌檜棻,Drink.溯萄碳);	
					System.out.print  ("  弛                                                            弛 	弛 				  弛\n");
					System.out.print  ("  弛                                                            弛 	弛 				  弛\n");
					System.out.print  ("  弛                                               (|) (式)      弛        弛               弛\n");
		            System.out.print  ("  弛       ###  ####   ###  ####  #   # ####        #####       弛        弛               弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   # #   #       #           弛    弛               弛\n");
		            System.out.print  ("  弛      # ### #  #  #   # #  #  #   # ####        ####        弛    弛               弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   # #               #       弛    弛                    弛\n");
		            System.out.print  ("  弛       #### #   #  ###  #   #  ###  #           ####        弛    弛               弛\n");
					System.out.print  ("  弛     忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖     弛	戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎     弛 ");
					System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎 ");
				}
				else {
					cls();
					String money = df.format(Drink.濠旎);
					System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖 ");
					System.out.println("  弛                                                            弛 ");
					System.out.println("  弛     ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥   ﹥       ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥     ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥     弛 ");
					System.out.println("  弛         ﹥﹥       ﹥         ﹥  ﹥     ﹥﹥﹥          ﹥   ﹥     弛 ");
					System.out.println("  弛         ﹥﹥       ﹥         ﹥  ﹥     ﹥           ﹥    ﹥     弛 ");
					System.out.println("  弛        ﹥  ﹥      ﹥﹥﹥     ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥          ﹥     ﹥     弛 ");
					System.out.println("  弛       ﹥    ﹥     ﹥                            ﹥      ﹥     弛        ***********************************");
					System.out.printf ("  弛      ﹥      ﹥    ﹥         ﹥                 ﹥       ﹥     弛                       憲葡っ                 \n");
					System.out.printf ("  弛     ﹥        ﹥   ﹥         ﹥                ﹥        ﹥     弛        %-15s 唳堅 �蝦�:%s              \n","Level : " + Drink.衛除離檜,Drink.唳堅�蝦�);
					System.out.printf ("  弛                  ﹥         ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥     ﹥         ﹥     弛        %-30s              \n",Drink.詭衛雖.get(4));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(3));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(2));
		            System.out.printf ("  弛        COLA         FANTA        CIDER      RED BULL       弛        %-30s              \n",Drink.詭衛雖.get(1));
		            System.out.printf ("  弛     忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖     弛        %-30s              \n",Drink.詭衛雖.get(0));
		            System.out.println("  弛     弛         弛  弛 ###     弛  弛    #    弛  弛####弛    弛     弛        ***********************************");
		            System.out.println("  弛     弛COCA COLA弛  弛  ###    弛  弛# # # # #弛  弛####弛    弛     弛 ");
		            System.out.println("  弛     弛     ####弛  弛         弛  弛  # # #  弛  弛####弛    弛     弛                      ⑷營 濠旎  ");
		            System.out.println("  弛     弛####*####弛  弛 F A N   弛  弛# # # # #弛  弛    弛####弛     弛                      " + money);
		            System.out.println("  弛     弛####*    弛  弛     T A 弛  弛    #    弛  弛    弛####弛     弛 ");
		            System.out.println("  弛     弛         弛  弛         弛  弛  CIDER  弛  弛    弛####弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎     弛                      幗が嬪纂");
					System.out.printf ("  弛        %3d          %3d           %3d          %3d         弛        忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n",Drink.屬塭,Drink.�級�,Drink.餌檜棻,Drink.溯萄碳);	
					System.out.print  ("  弛                                                            弛 	弛 				  弛\n");
					System.out.print  ("  弛                                                            弛 	弛 				  弛\n");
					System.out.print  ("  弛                                               (|) (式)      弛        弛               弛\n");
		            System.out.print  ("  弛       ###  ####   ###  ####  #   # ####        #####       弛        弛               弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   # #   #       #           弛    弛               弛\n");
		            System.out.print  ("  弛      # ### #  #  #   # #  #  #   # ####        ####        弛    弛               弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   # #               #       弛    弛                    弛\n");
		            System.out.print  ("  弛       #### #   #  ###  #   #  ###  #           ####        弛    弛               弛\n");
					System.out.print  ("  弛     忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖     弛	戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎     弛 ");
					System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎 ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // 轎溘詭模萄 end
	public static void 衛濛�飛橨漞�() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛     濠っ晦縑 擠猿熱陛 賅濠塭憮     弛");
			System.out.println("弛     っ衙ж雖 跤ж賊 唳堅殮棲棻     弛");
			System.out.println("弛         澀 瓣錶輿撮蹂!         弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			if(i==0) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==1) {			
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("          〤〤                 ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("          〤〤     〤〤          ");
				System.out.println("          〤〤     〤〤          ");
				System.out.println("          〤〤     〤〤          ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                 〤〤          ");
				System.out.println("                 〤〤          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("          〤〤                 ");
				System.out.println("          〤〤                 ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("            〤〤〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}

}
	
