function getscoreList () {
    return axios ({
        url: '/score/all',
        method: 'get'
    })
}

function addScoreById (params) {
    console.log(params)
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

function getScoreByStudentName (params) {
    return axios ({
        url: '/score/getByStudentId',
        method: 'get',
        params:{
            studentName: params
        }
    })
}