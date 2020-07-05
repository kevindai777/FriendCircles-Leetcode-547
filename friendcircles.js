//Objective is to find the number of friend circles in a 2D matrix.


//O(n * m) solution that uses a dfs traversal to visit all friend groups.

let count = 0
let visited = new Set()

for (let i = 0; i < matrix.length; i++) {
    //Visit all friends
    if (!visited.has(i)) {
        dfs(i)
        count++
    }
}

function dfs(i) {
    //Visit the friends of that friend
    for (let j = 0; j < matrix.length; j++) {
        if (matrix[i][j] == 1 && !visited.has(j)) {
            visited.add(j)
            dfs(j)
        }
    }
}

return count