import {createRouter, createWebHashHistory, Router, RouteRecordRaw} from "vue-router";
import PageAuth from "@/components/auth/PageAuth.vue";
import PageMain from "@/components/main/PageMain.vue";
import PageNotFound from "@/components/PageNotFound.vue";

export const routes: RouteRecordRaw[] = [
    { path: "/", component: PageMain },
    { path: "/auth", component: PageAuth },
    { path: "/:catchAll(.*)", component: PageNotFound },
]

export const router: Router = createRouter({
    history: createWebHashHistory(),
    routes
});