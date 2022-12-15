function getUserList (params) {
    return axios ({
        url: '/user/page',
        method: 'get',
        params
    })
}


function enableOrDisableEmployee (params) {
    return axios({
        url: '/user/status',
        method: 'put',
        data: {...params}
    })
}


function addUser (params) {
    return axios ({
        url: '/user/add',
        method: 'post',
        data: params
    })
}

function updateStudent (params) {
    return axios ({
        url: '/user/update',
        method: 'put',
        data: params
    })
}