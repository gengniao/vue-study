new Vue({
    el: "#app",
    data: {
        user: {
            id: "",
            username: "",
            password: "",
            email: "",
            age: "",
            sex: ""
        },
        userList: []
    },
    methods: {
        findAll: function() {
            // 在当前方法中定义一个对象表明是一个vue对象
            var _this = this;
            axios.get("/vue_web_ssm_war_exploded/user/findAll.do")
                .then(function(response) {
                    // 响应数据给userList赋值
                     _this.userList = response.data;
                })
                .catch(function(error){
                    console.log(error);
                })
        },
        update: function(User) {
            var _this = this;
            axios.post("/vue_web_ssm_war_exploded/user/update.do", _this.user)
                .then(function(response) {
                    // 修改完成后查询所有数据,刷新页面
                    _this.findAll();
                })
                .catch(function(error) {
                    console.log(error);
                })
        },
        findById: function(userid) {
            console.log(userid);
            var _this = this;
            axios.get("/vue_web_ssm_war_exploded/user/find.do",{
                params: {
                    id: userid
                }
            })
                .then(function(response) {
                    _this.user = response.data;
                    // 赋值之后需要让模态窗口显示
                    $("#myModal").modal("show");
                })
                .catch(function(error) {
                    console.log(error);
                })
        },
    },
    created(){
        // 当页面加载的时候触发请求,查询所有数据
        this.findAll();
    }
});