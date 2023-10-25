
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InListInListManager from "./components/listers/InListInListCards"
import InListInListDetail from "./components/listers/InListInListDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inLists/inLists',
                name: 'InListInListManager',
                component: InListInListManager
            },
            {
                path: '/inLists/inLists/:id',
                name: 'InListInListDetail',
                component: InListInListDetail
            },




    ]
})
