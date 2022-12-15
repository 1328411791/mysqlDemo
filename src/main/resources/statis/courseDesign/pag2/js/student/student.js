function getStudentList () {
    return axios ({
        url: '/student/all',
        method: 'get'
    })
}

function addStudent (params) {
    //console.log(params)
    return axios ({
        url: '/student',
        method: 'post',
        data: params
    })
}


function updateStudent (params) {
    return axios ({
        url: '/student',
        method: 'put',
        data:{
            id: params,
        }
    })
}

function deleteStudent (params) {
    //console.log(params)
    return axios ( {
        url: '/student',
        method: 'delete',
        data: params,
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        }
    })
}