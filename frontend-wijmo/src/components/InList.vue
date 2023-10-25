<template>
    <div>
        <Address offline label="Address" v-model="value.address" :editMode="editMode" @change="change"/>
        <Photo offline label="Photo" v-model="value.photo" :editMode="editMode" @change="change"/>
        <File offline label="File" v-model="value.file" :editMode="editMode" @change="change"/>
        <User offline label="User" v-model="value.user" :editMode="editMode" @change="change"/>
        <Money offline label="Mony" v-model="value.mony" :editMode="editMode" @change="change"/>
        <Email offline label="Email" v-model="value.email" :editMode="editMode" @change="change"/>
        <Payment offline label="Payment" v-model="value.payment" :editMode="editMode" @change="change"/>
        <Likes offline label="Like" v-model="value.like" :editMode="editMode" @change="change"/>
        <Tags offline label="Tags" v-model="value.tags" :editMode="editMode" @change="change"/>
        <Comment offline label="Comment" v-model="value.comment" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'InList',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "inLists"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

