# Artificial-Intelligence-Programs

Breadth First Search
--------------------
**Output**:<br>
run:<br>
Enter the number of nodes : 8<br>
Enter the parent node : A<br>
Enter the number of child node : 2<br>
Enter the child nodes of A : <br>
B<br>
C<br>
Enter the parent node : B<br>
Enter the number of child node : 2<br>
Enter the child nodes of B : <br>
D<br>
E<br>
Enter the parent node : C<br>
Enter the number of child node : 3<br>
Enter the child nodes of C : <br>
F<br>
G<br>
H<br>
Enter the parent node : D<br>
Enter the number of child node : 0<br>
Enter the parent node : E<br>
Enter the number of child node : 0<br>
Enter the parent node : F<br>
Enter the number of child node : 0<br>
Enter the parent node : G<br>
Enter the number of child node : 0<br>
Enter the parent node : H<br>
Enter the number of child node : 0<br>
Enter the number of goal nodes : 2<br>
Enter the goal nodes : <br>
G<br>
H<br>
Enter the initial node : A<br>
State space:<br>
{C=[F, G, H], B=[D, E], A=[B, C], H=[-1], G=[-1], F=[-1], E=[-1], D=[-1]}<br>
Goal nodes:<br>
[G, H]<br>
The path is<br>
A->B->C->D->E->F->G-><br>
BUILD SUCCESSFUL (total time: 1 minute 18 seconds)<br>

Depth First Search
------------------
**Output**:<br>
run:<br>
Enter the number of nodes : 10<br>
Enter the parent node : A<br>
Enter the number of child node : 3<br>
Enter the child nodes of A : <br>
B<br>
C<br>
D<br>
Enter the parent node : B<br>
Enter the number of child node : 3<br>
Enter the child nodes of B : <br>
E<br>
F<br>
G<br><br>
Enter the parent node : C<br>
Enter the number of child node : 1<br>
Enter the child nodes of C : <br>
H<br>
Enter the parent node : D<br>
Enter the number of child node : 0<br>
Enter the parent node : E<br>
Enter the number of child node : 0<br>
Enter the parent node : F<br>
Enter the number of child node : 1<br>
Enter the child nodes of F : <br>
I<br>
Enter the parent node : G<br>
Enter the number of child node : 1<br>
Enter the child nodes of G : <br>
J<br>
Enter the parent node : H<br>
Enter the number of child node : 0<br>
Enter the parent node : I<br>
Enter the number of child node : 0<br>
Enter the parent node : J<br>
Enter the number of child node : 0<br>
Enter the number of goal nodes : 1<br>
Enter the goal nodes : <br>
I<br>
Enter the initial node : A<br>
State space:<br>
{J=[-1], I=[-1], H=[-1], G=[J], F=[I], E=[-1], D=[-1], C=[H], B=[E, F, G], A=[B, C, D]}<br>
Goal nodes:<br>
[I]<br>
The path is<br>
[A, D, C, H, B, G, J, F, I]<br>
BUILD SUCCESSFUL (total time: 1 minute 22 seconds)<br>
