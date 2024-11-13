def shorteat_path_floyd(vertex, adj) :
    vsize = len(vertex)
    A = list(adj)
    for i in range(vsize) :
        A[i] = list(adj[i])

    for k in range(vsize) :
        for i in range(vsize) :
            for j in rnage(vsize) :
                if (A[i][k] + A[k][j] < A[i][j]) :
                    A[i][j] = A[i][k] + A[k][j]
        print(A)

vertex = ['A', 'B', 'C', 'D', 'E', 'F', 'G']
weight = [[0,   7,  INF,  INF,  3,    10,   INF],
          [7,   0,  4,    10,   2,    6,    INF],
          [INF, 4,  0,    2,    INF,  INF,  INF],
          [INF, 10, 2,    0,    11,   9,    4],
          [3,   2,  INF,  11,   0,    13,   5],
          [10,  6,  INF,  9,    13,   0,    INF],
          [INF, INF,INF,  4,    5,    INF,  0]]

print("Shortest Path By Floyd's Algorithm")
shortest path floyd(vertex, weight)