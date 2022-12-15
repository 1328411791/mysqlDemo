function logoutApi() {
    return axios ( {
        url: '/user/logout',
        method: 'post'
    })
}



