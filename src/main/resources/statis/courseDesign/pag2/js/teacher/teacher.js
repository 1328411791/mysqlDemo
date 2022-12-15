function getTeacherList () {
    return axios ({
        url: '/teacher/all',
        method: 'get'
    })
}

function addTeacher (params) {
    //console.log(params)
    return axios ({
        url: '/teacher',
        method: 'post',
        data: params
    })
}


function updateTeacher (params) {
    return axios ({
        url: '/teacher',
        method: 'put',
        data: params,
    })
}

function deleteTeacher (params) {
    //console.log(params)
    return axios ( {
        url: '/teacher',
        method: 'delete',
        params:{
            id: params
        }
    })
}
