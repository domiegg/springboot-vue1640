import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import nongjileixing from '@/views/modules/nongjileixing/list'
    import discussnongji from '@/views/modules/discussnongji/list'
    import shiyongzhe from '@/views/modules/shiyongzhe/list'
    import nongjijizhu from '@/views/modules/nongjijizhu/list'
    import nongjiyuyue from '@/views/modules/nongjiyuyue/list'
    import nongji from '@/views/modules/nongji/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/nongjileixing',
        name: '农机类型',
        component: nongjileixing
      }
      ,{
	path: '/discussnongji',
        name: '农机评论',
        component: discussnongji
      }
      ,{
	path: '/shiyongzhe',
        name: '使用者',
        component: shiyongzhe
      }
      ,{
	path: '/nongjijizhu',
        name: '农机机主',
        component: nongjijizhu
      }
      ,{
	path: '/nongjiyuyue',
        name: '农机预约',
        component: nongjiyuyue
      }
      ,{
	path: '/nongji',
        name: '农机',
        component: nongji
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
