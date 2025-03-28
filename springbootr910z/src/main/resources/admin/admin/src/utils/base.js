const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootr910z/",
            name: "springbootr910z",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootr910z/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "农机电招平台"
        } 
    }
}
export default base
