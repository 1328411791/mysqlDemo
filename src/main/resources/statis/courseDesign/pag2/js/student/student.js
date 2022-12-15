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
        data: params,
    })
}

function deleteStudent (params) {
    //console.log(params)
    return axios ( {
        url: '/student',
        method: 'delete',
        params:{
            id: params
        }
    })
}

function getStudentByName (params) {
    return axios ({
        url: '/student/selectStudenName',
        method: 'post',
        params:{
            studentName: params
        }
    })
}