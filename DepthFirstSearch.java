package ai;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DepthFirstSearch {
    public static void main(String args[]){
        //user input
        Scanner s = new Scanner(System.in);
        Hashtable<String,LinkedList<String>> h ;
        LinkedList<String> list;

        //state space
        System.out.print("Enter the number of nodes : ");
        int node = s.nextInt();     
        h=new Hashtable<String,LinkedList<String>>(node);
        String parent,child;
        for (int i = 0; i < node; i++) {
            list=new LinkedList<String>();
            System.out.print("Enter the parent node : ");
            parent=s.next();
            System.out.print("Enter the number of child node : ");
            int cNode=s.nextInt();
                        
            if(cNode==0){
                list.add("-1");
                h.put(parent,list);     
            }
            else{
                System.out.println("Enter the child nodes of "+parent+" : ");
                h.put(parent,list);
                for(int j=0;j<cNode;j++){
                    child=s.next();
                    list.add(child);
                }
            }
        }

        System.out.print("Enter the number of goal nodes : ");
        LinkedList<String> goal=new LinkedList<String>();
        int gNode=s.nextInt();
        System.out.println("Enter the goal nodes : ");
        String g;
        for(int i=0;i<gNode;i++){
            g=s.next();
            goal.add(g);
        }

        System.out.print("Enter the initial node : ");
        String initial=s.next();
        
        System.out.println("State space:");
        System.out.println(h);
        
        System.out.println("Goal nodes:");
        System.out.println(goal);
        
        //DFS
        LinkedList<String> stack=new LinkedList<String>();
        LinkedList<String> visited=new LinkedList<String>();
        LinkedList<String> path=new LinkedList<String>();
        LinkedList<String> t=new LinkedList<String>();
        
        stack.add(initial);
        String temp;
        int u=0;
        while(stack.size()!=0){
            temp=stack.pollLast();
            path.add(temp);
            if((goal.contains(temp))){
                visited.add(temp);
                u++;
                break;
            }
            else{
                visited.add(temp);
                t=(LinkedList<String>) (h.get(temp));
                if(!t.contains("-1")){                      
                    Iterator<String> i=t.listIterator();
                    while(i.hasNext()){
                        String n=i.next();
                        stack.add(n);
                    }
                }
            }
        }
        if(u==0)
            System.out.println("Goal not found.");
        else{
            System.out.println("The path is");
            System.out.println(visited);
            //System.out.println(path);
        }
        
    }
}
