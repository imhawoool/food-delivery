
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 주문Manager from "./components/listers/주문Cards"
import 주문Detail from "./components/listers/주문Detail"
import 결제Manager from "./components/listers/결제Cards"
import 결제Detail from "./components/listers/결제Detail"

import 상점Manager from "./components/listers/상점Cards"
import 상점Detail from "./components/listers/상점Detail"

import 배달Manager from "./components/listers/배달Cards"
import 배달Detail from "./components/listers/배달Detail"


import 주문정보View from "./components/주문정보View"
import 주문정보ViewDetail from "./components/주문정보ViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/주문',
                name: '주문Manager',
                component: 주문Manager
            },
            {
                path: '/주문/:id',
                name: '주문Detail',
                component: 주문Detail
            },
            {
                path: '/결제',
                name: '결제Manager',
                component: 결제Manager
            },
            {
                path: '/결제/:id',
                name: '결제Detail',
                component: 결제Detail
            },

            {
                path: '/상점',
                name: '상점Manager',
                component: 상점Manager
            },
            {
                path: '/상점/:id',
                name: '상점Detail',
                component: 상점Detail
            },

            {
                path: '/배달',
                name: '배달Manager',
                component: 배달Manager
            },
            {
                path: '/배달/:id',
                name: '배달Detail',
                component: 배달Detail
            },


            {
                path: '/주문정보',
                name: '주문정보View',
                component: 주문정보View
            },
            {
                path: '/주문정보/:id',
                name: '주문정보ViewDetail',
                component: 주문정보ViewDetail
            },



    ]
})
