function getStudentList (params) {
    return axios ({
        url: '/student/page',
        method: 'get',
        params
    })
}

function addStudent (params) {
    //console.log(params)
    return axios ({
        url: '/student/add',
        method: 'post',
        data: params
    })
}


function updateStudent (params) {
    return axios ({
        url: '/student/update',
        method: 'post',
        data: params
    })
}

function deleteStudent (params) {
    //console.log(params)
    return axios ( {
        url: '/student/delete',
        method: 'delete',
        data: params
    })
}