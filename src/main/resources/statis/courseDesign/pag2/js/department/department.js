function getdepartmentList (params) {
    return axios ({
        url: '/department/all',
        method: 'get',
        params
    })
}

function addDepartment (params) {
    //console.log(params)
    return axios ({
        url: '/department',
        method: 'post',
        data: params
    })
}


function updatedepartment (params) {
    return axios ({
        url: '/department',
        method: 'put',
        data: params
    })
}

function deletedepartment (params) {
    //console.log(params)
    return axios ( {
        url: '/department',
        method: 'delete',
        params:{
            id: params
        }
    })
}