package ai;
import java.util.*;
public class HillClimbing {
    public static void main(String args[]){
        //user input
        Scanner s = new Scanner(System.in);
        Hashtable stateSpace ;
        Hashtable<String,Integer> heuristic;
        LinkedList<String> list;
        int bestH=0;
        String maxima="";

        //state space
        System.out.print("Enter the number of nodes : ");
        int node = s.nextInt();     
        //int node=12;
        stateSpace=new Hashtable<String,LinkedList<String>>(node);
        heuristic=new Hashtable<String,Integer>(node);
        String parent,child;
        int tmp;
        for (int i = 0; i < node; i++) {
            list=new LinkedList<String>();
            System.out.print("Enter the parent node : ");
            parent=s.next();
            System.out.print("Enter the heuristic value of "+parent+": ");
            tmp=s.nextInt();
            System.out.print("Enter the number of child node of "+parent+": ");
            int cNode=s.nextInt();
                        
            if(cNode==0){
                list.add("-1");
                stateSpace.put(parent,list);
                if(tmp>bestH){
                    bestH=tmp;
                    maxima=parent;
                }
                heuristic.put(parent, tmp);
            }
            else{
                System.out.println("Enter the child nodes of "+parent+" : ");
                stateSpace.put(parent,list);
                if(tmp>bestH){
                    bestH=tmp;
                    maxima=parent;
                }
                heuristic.put(parent, tmp);
                for(int j=0;j<cNode;j++){
                    child=s.next();
                    list.add(child);
                }
            }
        }
      
        System.out.print("Enter the initial node : ");
        String initial=s.next();
        
        System.out.println("State space:");
        System.out.println(stateSpace);
        
        System.out.println("Heuristic:");
        System.out.println(heuristic);
        System.out.println();
       
        //Hill climbing algorithm
        boolean goal=false,stuck=false;
        LinkedList<String> open=new LinkedList<String>();
        LinkedList<String> tempL=new LinkedList<String>();
        LinkedList<String> path=new LinkedList<String>();
        open.add(initial);
        String current="",next="";
        int present=0;
        while(!open.isEmpty()){
            current=open.pollFirst();
            path.add(current);
            present=heuristic.get(current);
            if(present==bestH){
                goal=true;
                break;
            }
            if(current==next){
                stuck=true;
                break;
            }
            else{
                tempL=(LinkedList<String>) (stateSpace.get(current));
                if(tempL.contains("-1")){
                    goal=true;
                    break;
                }
                Iterator<String> i=tempL.listIterator();
                while(i.hasNext()){
                    String n=i.next();
                    if(heuristic.get(n)>present){
                        present=heuristic.get(n);
                        next=n;
                    }                   
                }
                open.add(next);
            }
            
        }
        if(goal==true && present==bestH){
            System.out.println("Path: "+path);
            System.out.println("Global Maxima reached: "+current);
        }
        else if(goal==true && present!=bestH){
            System.out.println("Path: "+path);
            System.out.println("Local Maxima reached: "+current);
            System.out.println("Global Maxima: "+maxima);                 
        }
        else if(stuck){
            System.out.println("Path: "+path);
            System.out.println("Stuck at Local Maxima: "+current);
            System.out.println("Global Maxima: "+maxima);
        }
    }
}
