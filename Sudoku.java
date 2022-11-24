import java.util.*;

public class Sudoku {
    private static final int Taille = 9; //Taille du grille;
    public static void main (String[]args){
    int[][] Tab = {  //Creation des Cellules Fixes
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
      Affiche(Tab);
    }
    Scanner input = new Scanner();

    private static void InitializeBoard(int[][] Tab){
        for (int ligne = 0; ligne < Taille; ligne++){
            for (int column = 0; column < GRID_SIZE; column++){
                System.out.println("Donner les coordonnées de la cellules désirés pour ligne: ");
                int L1 = input.nextInt();
                System.out.println("Donner les coordonnées de la cellules désirés pour colonne: ");
                int C1 = input.nextInt();
                List<Integer> NBRS = new ArrayList<Integer>();
                int NBRS = {1,2,3,4,5,6,7,8,9};
                if ((Ligne = L1) && (Column = C1)){
                    System.out.println("Donner un nombre pour la case: " + L1 + "," + C1\n);
                    int NBR = input.nextInt();
                    if (Tab[ligne][column]!=NBRS) {
                        do {
                            System.out.println("Veuillez donner un nombre entre 0 et 9: \n");
                            NBR = input.nextInt();
                           } while (Tab[ligne][column]==0);
                    }
                    Tab[ligne][column]=NBR;
                    NBRS.remove(NBR);
                    int Ligne1 = ligne;
                    int Column1 = column;
                    if ((ligne==Ligne1+2) && (column==Column1+2))
                    {
                        NBRS.Clear(NBRS);
                        NBRS.add(1);
                        NBRS.add(2);
                        NBRS.add(3);
                        NBRS.add(4);
                        NBRS.add(5);
                        NBRS.add(6);
                        NBRS.add(7);
                        NBRS.add(8);
                        NBRS.add(9);
                    }
                }
            }
        }
      }

    private static void Affiche(int[][] Tab) {  //Affichage Resultat
        for (int ligne = 0; ligne < Taille; ligne++) {
          for (int column = 0; column < GRID_SIZE; column++) {
            System.out.print(Tab[row][column]);
          }
        }
      }

    boolean VerifLigneValide(int [][] Tab, int x, int ligne){ //Verification nombre x introduit si valide dans la ligne ou non
        for (int i=0; i < Taille; i++){
            if (Tab[ligne][i] == x){
                return true;
            }
        }
        else{
            return false;
        }
    }

    boolean VerifColValide(int [][] Tab, int x, int col){  //Verification nombre x introduit si valide dans la colone ou non
        for (int i=0; i < Taille; i++){
            if (Tab[i][col] == x){
                return true;
            }
        }
        else{
            return false;
        }
    }

    boolean VerifLigne3x3Valide(int [][] Tab, int x, int ligne, int col){  //Verification nombre x introduit si valide dans la matrice 3x3 ou non
            int r = ligne - ligne % 3;
            int c = col - col % 3;
            for (int i = r; i < r + 3; i++)
                for (int j = c; j < c + 3; j++)
                    if (Tab[i][j] == x)
                        return true;
            return false;
        }

    boolean VerifNbValide(int [][] Tab, int x, int ligne, int col){  //Verification nombre x Valide dans la cellule
        if (((VerifColValide(Tab,x,Col)) && (VerifLigneValide(Tab,x,ligne)) && (VerifLigne3x3Valide(Tab,x,ligne,col))) == true){
            return true;
        }
        else{
            return false;
        }
    }

    boolean VerifNb(int [][] Tab){  //Cherche le numero x valide dans la cellules [ligne][col]
        for (int i = 0; i < Taille; i++){
            for(int j = 0; j < Taille; j++){
                if(Tab[ligne][col] == 0){
                    for (int x = 1; x < 10; x++){
                        Tab[ligne][col] = x;
                       if ((VerifNb(Tab)) == true){
                       return true;
                    }
                }
            }
            return false;
        }
    }
}
