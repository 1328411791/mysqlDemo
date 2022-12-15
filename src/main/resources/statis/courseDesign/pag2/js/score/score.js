function getStudentList () {
    return axios ({
        url: '/score/all',
        method: 'get'
    })
}

function addStudent (params) {
    //console.log(params)
    return axios ({
        url: '/score',
        method: 'post',
        data: params
    })
}


function updatescore (params) {
    return axios ({
        url: '/score',
        method: 'put',
        data: params,
    })
}

function deletescore (params) {
    //console.log(params)
    return axios ( {
        url: '/score',
        method: 'delete',
        params:{
            id: params
        }
    })
}

function getscoreByName (params) {
    return axios ({
        url: '/score/selectStudenName',
        method: 'post',
        params:{
            scoreName: params
        }
    })
}