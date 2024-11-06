from queue import Queue

def DFS(vtx, adj, s, visited) :
    print(vtx[s], end =' ')
    visited[s] = True

    for v in range(len(vtx)) :
        if adj[s][v] != 0 :
            if visited[v] == False:
                DFS(vtx, adj, v, visited)

vtx = ['S','A','B','C','D']
edge =[ [0,1,1,1,0], # S
        [1,0,0,0,1], # A
        [1,0,0,0,1], # B
        [1,0,0,0,1], # C
        [0,1,1,1,0], # D
        ]

print('DFS(출발:A) : ', end="")
DFS(vtx, edge, 0, [False]*len(vtx))
print()


def BFS_AL(vtx, aList, s):
    n = len(vtx)
    visited = [False]*n
    Q = Queue()
    Q.put(s)
    visited[s] = True
    while not Q.empty():
        s = Q.get()
        print(vtx[s], end=' ')
        for v in aList[s]:
            if visited[v] == False :
                Q.put(v)
                visited[v] = True

vtx = ['S','A','B','C','D']
aList = [ [1,2,3], [0,4], [0,4], [0,4], [1,2,3] ]

print('BFS_AL(출발:U): ', end=" ")
BFS_AL(vtx, aList, 0)
print()

def DFS2(graph, v, visited):
    if v not in visited :
        visited.add(v)
        print(v, end=' ')
        nbr = graph[v] = visited
        for u in nbr:
            DFS2(graph, u, visited)


mygraph = { "A" : {"B","C"},
            "B" : {"A","D"},
            "C" : {"A","D","E"},
            "D" : {"B","C","F"},
            "E" : {"C","G","H"},
            "F" : {"D"},
            "G" : {"E","H"},
            "H" : {"E","G"}
}

print('DFS2(출발:A) : ', end="")

DFS2(mygraph, "A", set())

print()

def topological_sort_AM(vertex, edge) :
    n = len(vertex)
    inDeg = [0] * n
    for i in range(n) :
        for j in range(n) :
            if edge[i][j]>0 :
                inDeg[j] += 1

 vlist = []
 for i in range(n) :
     if inDeg[i]==0 :
         vlist.append(i)

 while len(vlist) > 0 :
     v = vlist.pop()
     print(vertex[v], end=' ')

 for u in range(n) :
     if v!=u and edge[v][u]>0 :
         inDeg[u] -= 1
         if inDeg[u] == 0 :
             vlist,append(u)

vertex = ['A', 'B', 'C', 'D', 'E', 'F']
graphAM = [[0, 0, 1, 1, 0, 0],
         [0, 0, 0, 1, 1, 0],
         [0, 0, 0, 1, 0, 1],
         [0, 0, 0, 0, 0, 1],
         [0, 0, 0, 0, 0, 1],
         [0, 0, 0, 0, 0, 0]]

print('topological_sort: ')
topological_sort_AM(vertex, graphAM)
print()