function getcourseList () {
    return axios ({
        url: '/course/all',
        method: 'get'
    })
}

function addcourse (params) {
    //console.log(params)
    return axios ({
        url: '/course',
        method: 'post',
        data: params
    })
}


function updatecourse (params) {
    return axios ({
        url: '/course',
        method: 'put',
        data: params,
    })
}

function deletecourse (params) {
    //console.log(params)
    return axios ( {
        url: '/course',
        method: 'delete',
        params:{
            id: params
        }
    })
}
