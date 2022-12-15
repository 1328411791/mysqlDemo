function getdepartmentList (params) {
    return axios ({
        url: '/department/all',
        method: 'get',
        params
    })
}

function adddepartment (params) {
    //console.log(params)
    return axios ({
        url: '/department/add',
        method: 'post',
        data: params
    })
}


function updatedepartment (params) {
    return axios ({
        url: '/department/update',
        method: 'post',
        data: params
    })
}

function deletedepartment (params) {
    //console.log(params)
    return axios ( {
        url: '/department/delete',
        method: 'delete',
        data: params
    })
}