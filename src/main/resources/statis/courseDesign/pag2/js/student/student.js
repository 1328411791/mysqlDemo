function getStudentList (params) {
    return axios ({
        url: '/student/all',
        method: 'get',
        params
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
        method: 'post',
        data: params
    })
}

function deleteStudent (params) {
    //console.log(params)
    return axios ( {
        url: '/student',
        method: 'delete',
        data: params
    })
}