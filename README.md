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

Hill Climbing 
-------------
**OUTPUT:**
**Case 1: Global Maxima is reached**
run:
Enter the number of nodes : 10
Enter the parent node : A
Enter the heuristic value of A: 0
Enter the number of child node of A: 2
Enter the child nodes of A : 
B
C
Enter the parent node : B
Enter the heuristic value of B: 2
Enter the number of child node of B: 3
Enter the child nodes of B : 
H
D
E
Enter the parent node : C
Enter the heuristic value of C: 3
Enter the number of child node of C: 1
Enter the child nodes of C : 
I
Enter the parent node : H
Enter the heuristic value of H: 2
Enter the number of child node of H: 1
Enter the child nodes of H : 
J
Enter the parent node : D
Enter the heuristic value of D: 2
Enter the number of child node of D: 2
Enter the child nodes of D : 
F
G
Enter the parent node : E
Enter the heuristic value of E: 3
Enter the number of child node of E: 0
Enter the parent node : I
Enter the heuristic value of I: 107
Enter the number of child node of I: 0
Enter the parent node : J
Enter the heuristic value of J: 9
Enter the number of child node of J: 0
Enter the parent node : F
Enter the heuristic value of F: 1
Enter the number of child node of F: 0
Enter the parent node : G
Enter the heuristic value of G: 99
Enter the number of child node of G: 0
Enter the initial node : A
State space:
{J=[-1], I=[-1], H=[J], G=[-1], F=[-1], E=[-1], D=[F, G], C=[I], B=[H, D, E], A=[B, C]}
Heuristic:
{J=9, I=107, H=2, G=99, F=1, E=3, D=2, C=3, B=2, A=0}

Path: [A, C, I]
Global Maxima reached: I
BUILD SUCCESSFUL (total time: 2 minutes 8 seconds)

**Case 2: Local Maxima is reached**
run:
Enter the number of nodes : 10
Enter the parent node : A
Enter the heuristic value of A: 0
Enter the number of child node of A: 2
Enter the child nodes of A : 
B
C
Enter the parent node : B
Enter the heuristic value of B: 2
Enter the number of child node of B: 2
Enter the child nodes of B : 
D
E
Enter the parent node : C
Enter the heuristic value of C: 3
Enter the number of child node of C: 2
Enter the child nodes of C : 
H
I
Enter the parent node : D
Enter the heuristic value of D: 2
Enter the number of child node of D: 2
Enter the child nodes of D : 
F
G
Enter the parent node : E
Enter the heuristic value of E: 3
Enter the number of child node of E: 0
Enter the parent node : H
Enter the heuristic value of H: 2
Enter the number of child node of H: 1
Enter the child nodes of H : 
J
Enter the parent node : I
Enter the heuristic value of I: 7
Enter the number of child node of I: 0
Enter the parent node : F
Enter the heuristic value of F: 1
Enter the number of child node of F: 0
Enter the parent node : G
Enter the heuristic value of G: 99
Enter the number of child node of G: 0
Enter the parent node : J
Enter the heuristic value of J: 9
Enter the number of child node of J: 0
Enter the initial node : A
State space:
{J=[-1], I=[-1], H=[J], G=[-1], F=[-1], E=[-1], D=[F, G], C=[H, I], B=[D, E], A=[B, C]}
Heuristic:
{J=9, I=7, H=2, G=99, F=1, E=3, D=2, C=3, B=2, A=0}

Path: [A, C, I]
Local Maxima reached: I
Global Maxima: G
BUILD SUCCESSFUL (total time: 5 minutes 24 seconds)

**Case 3: Stuck at Local Maxima**
run:
Enter the number of nodes : 10
Enter the parent node : A
Enter the heuristic value of A: 0
Enter the number of child node of A: 2
Enter the child nodes of A : 
B
C
Enter the parent node : B
Enter the heuristic value of B: 2
Enter the number of child node of B: 2
Enter the child nodes of B : 
D
E
Enter the parent node : C
Enter the heuristic value of C: 3
Enter the number of child node of C: 2
Enter the child nodes of C : 
H
J
Enter the parent node : D
Enter the heuristic value of D: 2
Enter the number of child node of D: 2
Enter the child nodes of D : 
F
G
Enter the parent node : E
Enter the heuristic value of E: 3
Enter the number of child node of E: 0
Enter the parent node : H
Enter the heuristic value of H: 2
Enter the number of child node of H: 1
Enter the child nodes of H : 
I
Enter the parent node : J
Enter the heuristic value of J: 1
Enter the number of child node of J: 0
Enter the parent node : F
Enter the heuristic value of F: 1
Enter the number of child node of F: 0
Enter the parent node : G
Enter the heuristic value of G: 99
Enter the number of child node of G: 0
Enter the parent node : I
Enter the heuristic value of I: 9
Enter the number of child node of I: 0
Enter the initial node : A
State space:
{J=[-1], I=[-1], H=[I], G=[-1], F=[-1], E=[-1], D=[F, G], C=[H, J], B=[D, E], A=[B, C]}
Heuristic:
{J=1, I=9, H=2, G=99, F=1, E=3, D=2, C=3, B=2, A=0}

Path: [A, C]
Stuck at Local Maxima: C
Global Maxima: G
BUILD SUCCESSFUL (total time: 3 minutes 7 seconds)

