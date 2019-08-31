import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class BestFirstSearch {
    int m;
    ArrayList<Integer>list[];
    Hashtable<Integer, ArrayList<Integer>> node;
    Hashtable<Integer, Integer> heuristic;
    BestFirstSearch(int n){
        m = n;
        node = new Hashtable<Integer, ArrayList<Integer>>(m);
        list = new ArrayList[m];
        heuristic = new Hashtable<Integer, Integer>(m);
        for(int i = 0; i< m; i++)
            list[i] = new ArrayList<Integer>();
    }
    void initRoot(int root, int h){
        heuristic.put(root, h);
    }
    void addEdge(int par, int child, int heu){
        list[par].add(child);
        node.put(par, list[par]);
        heuristic.put(child, heu);
    }
    void Search(){
        ArrayList<Integer>openList = new ArrayList<Integer>();
        ArrayList<Integer>closedList = new ArrayList<Integer>();
        int node = 0;
        boolean found = false;
        openList.add(node);
        for(int i = 0; i< m; i++){
            openList.remove(openList.indexOf(node));
            closedList.add(node);
            System.out.print(node + " ");
            if(heuristic.get(node) == 0){
                found = true;
                System.out.println("\nGoal node " + node  + " reached");
                return;
            }
            Iterator<Integer>itrL = list[node].iterator();
            while(itrL.hasNext()){
                int val = itrL.next();
                openList.add(val);
            }
            if(openList.isEmpty())
                break;
            node = openList.get(0);
            for(int k : openList)
                node = heuristic.get(node) <heuristic.get(k) ? node : k;
        }
        if(!found)
            System.out.println("\nGoal not found!");
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int parent, child, h;
        System.out.print("Enter the number of nodes : ");
        int n = s.nextInt();
        BestFirstSearch d = new BestFirstSearch(n);
        System.out.println();
        System.out.println("Enter the heuristic of the Root(0) node");
        h = s.nextInt();
        d.initRoot(0, h);
        System.out.println("Enter the Tree nodes");
        for (int j = 0; j < n - 1; j++) {
            System.out.print("Enter the parent node : ");
            parent = s.nextInt();
            System.out.print("Enter the child node : ");
            child = s.nextInt();
            System.out.print("Enter the heuristic value : ");
            h = s.nextInt();
            d.addEdge(parent, child, h);
        }       
        System.out.println();
        System.out.print("Best First Search traversal is : ");
        d.Search();
    }
}
