
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InListManager from "./components/ui/InListGrid"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inLists',
                name: 'InListManager',
                component: InListManager
            },




    ]
})
