package com.example.mvp.bean;

import java.util.List;

public class MusicBean {

    /**
     * code : 200
     * message : 成功!
     * result : [{"channellist":[{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/838ba61ea8d3fd1fb4912e42354e251f95ca5f2a.jpg","name":"漫步春天","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_spring","value":1000000,"channelid":"62"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/b3119313b07eca80b93485cf932397dda14483e1.jpg","name":"秋日私语","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_autumn","value":1000000,"channelid":"63"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/eac4b74543a9822659d378408982b9014a90eb43.jpg","name":"温暖冬日","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_winter","value":36,"channelid":"61"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/30adcbef76094b36a098488aa0cc7cd98d109d4a.jpg","name":"热歌","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_rege","value":3,"channelid":"58"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/728da9773912b31b106b9e4e8518367adab4e156.jpg","name":"KTV金曲","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_ktv","value":4,"channelid":"45"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/a2cc7cd98d1001e92b3c4768bb0e7bec54e79750.jpg","name":"Billboard","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_billboard","value":20,"channelid":"55"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/838ba61ea8d3fd1f0b0bf15d334e251f95ca5f52.jpg","name":"成名曲","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_chengmingqu","value":5,"channelid":"48"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/29381f30e924b8991a462a5f6d061d950a7bf65b.jpg","name":"网络歌曲","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_wangluo","value":9,"channelid":"51"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d439b6003af33a871d2b537dc55c10385343b517.jpg","name":"开车","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_kaiche","value":21,"channelid":"42"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/0e2442a7d933c89550c6cb1cd21373f082020018.jpg","name":"影视","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_yingshi","value":31,"channelid":"57"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8b13632762d0f7035531c6bb0bfa513d2797c5d2.jpg","name":"随便听听","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_suibiantingting","value":12,"channelid":"1"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/060828381f30e9240a58cf564f086e061c95f7dd.jpg","name":"经典老歌","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_jingdianlaoge","value":2,"channelid":"3"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/4ec2d5628535e5ddf8d5f6b875c6a7efcf1b62df.jpg","name":"70后","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_70hou","value":25,"channelid":"43"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/6a63f6246b600c3367818daf194c510fd8f9a1d9.jpg","name":"80后","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_80hou","value":7,"channelid":"2"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/242dd42a2834349be8ae3de2caea15ce36d3be29.jpg","name":"90后","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_90hou","value":10,"channelid":"25"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/0e2442a7d933c8955088cb1cd21373f0830200e6.jpg","name":"火爆新歌","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_xinge","value":15,"channelid":"6"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/b151f8198618367a7e792cba2d738bd4b21ce5e1.jpg","name":"儿歌","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_erge","value":34,"channelid":"24"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/dbb44aed2e738bd41bcce156a28b87d6267ff9ec.jpg","name":"旅行","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_lvxing","value":35,"channelid":"16"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/024f78f0f736afc3f7176d02b019ebc4b74512b9.jpg","name":"夜店","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_yedian","value":17,"channelid":"41"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8ad4b31c8701a18b2dfa40289d2f07082838fe40.jpg","name":"流行","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_liuxing","value":6,"channelid":"46"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/1f178a82b9014a906c3514daaa773912b31bee4a.jpg","name":"摇滚","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_yaogun","value":24,"channelid":"10"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d833c895d143ad4b536214a781025aafa40f060c.jpg","name":"民谣","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_minyao","value":33,"channelid":"60"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8b82b9014a90f603e8b3ce203a12b31bb051ed52.jpg","name":"轻音乐","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_qingyinyue","value":14,"channelid":"29"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/f703738da97739122dd1d706fb198618377ae2e6.jpg","name":"小清新","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_xiaoqingxin","value":23,"channelid":"49"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d62a6059252dd42ac0e553cc003b5bb5c8eab8ed.jpg","name":"中国风","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_zhongguofeng","value":30,"channelid":"53"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/0824ab18972bd40743e88e9a78899e510fb309ad.jpg","name":"DJ舞曲","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_dj","value":11,"channelid":"50"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/cb8065380cd7912368c9c913ae345982b2b780a8.jpg","name":"电影","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_dianyingyuansheng","value":29,"channelid":"38"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/6c224f4a20a44623d811f7059b22720e0df3d7fa.jpg","name":"轻松假日","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_qingsongjiari","value":18,"channelid":"40"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/bf096b63f6246b60d111ef13e8f81a4c510fa2be.jpg","name":"欢快旋律","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_huankuai","value":11,"channelid":"4"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/c995d143ad4bd113f1d6ea5559afa40f4bfb05b9.jpg","name":"甜蜜感受","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_tianmi","value":26,"channelid":"17"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/08f790529822720ed8dbbf9d78cb0a46f21fab44.jpg","name":"寂寞","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_jimo","value":27,"channelid":"37"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/7acb0a46f21fbe09b1349e7368600c338744ad6b.jpg","name":"单身情歌","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_qingge","value":28,"channelid":"56"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/342ac65c103853430cadda469013b07eca808873.jpg","name":"舒缓节奏","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_shuhuan","value":13,"channelid":"11"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/5882b2b7d0a20cf437cea3b875094b36acaf997e.jpg","name":"慵懒午后","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_yonglanwuhou","value":22,"channelid":"19"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/e850352ac65c1038a52693a5b1119313b07e8979.jpg","name":"伤感","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_shanggan","value":16,"channelid":"36"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/5ab5c9ea15ce36d33b50de5739f33a87e950b105.jpg","name":"华语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_huayu","value":1,"channelid":"32"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/279759ee3d6d55fb785d2b416e224f4a20a4dd3a.jpg","name":"欧美","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_oumei","value":8,"channelid":"33"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8694a4c27d1ed21b66857382ae6eddc451da3f0c.jpg","name":"日语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_riyu","value":38,"channelid":"34"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/10dfa9ec8a136327ddd49e54928fa0ec08fac798.jpg","name":"韩语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_hanyu","value":32,"channelid":"44"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d50735fae6cd7b89e7e067e40c2442a7d8330ecc.jpg","name":"粤语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_yueyu","value":19,"channelid":"18"}],"title":"公共频道","cid":1},{"channellist":[{"name":"曲婉婷","artistid":"10490649","avatar":"http://qukufile2.qianqian.com/data2/pic/246668364/246668364.jpg@s_2,w_120,h_120"},{"name":"孙燕姿","artistid":"7","avatar":"http://qukufile2.qianqian.com/data2/pic/1146f25302c0e6c81191109ea8d28ea9/583617299/583617299.jpg@s_2,w_120,h_120"},{"name":"张韶涵","artistid":"77","avatar":"http://qukufile2.qianqian.com/data2/pic/246709988/246709988.jpg@s_2,w_120,h_120"},{"name":"苏打绿","artistid":"774","avatar":"http://qukufile2.qianqian.com/data2/pic/e111ca7679345c719c7a7e97be799891/613160372/613160372.jpg@s_2,w_120,h_120"},{"name":"陈奕迅","artistid":"87","avatar":"http://qukufile2.qianqian.com/data2/pic/af739e0109798366b9419230be5253ce/541222074/541222074.jpg@s_2,w_120,h_120"},{"name":"汪峰","artistid":"256","avatar":"http://qukufile2.qianqian.com/data2/pic/246585885/246585885.jpg@s_2,w_120,h_120"}],"title":"音乐人频道","cid":3}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * channellist : [{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/838ba61ea8d3fd1fb4912e42354e251f95ca5f2a.jpg","name":"漫步春天","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_spring","value":1000000,"channelid":"62"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/b3119313b07eca80b93485cf932397dda14483e1.jpg","name":"秋日私语","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_autumn","value":1000000,"channelid":"63"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/eac4b74543a9822659d378408982b9014a90eb43.jpg","name":"温暖冬日","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_winter","value":36,"channelid":"61"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/30adcbef76094b36a098488aa0cc7cd98d109d4a.jpg","name":"热歌","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_rege","value":3,"channelid":"58"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/728da9773912b31b106b9e4e8518367adab4e156.jpg","name":"KTV金曲","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_ktv","value":4,"channelid":"45"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/a2cc7cd98d1001e92b3c4768bb0e7bec54e79750.jpg","name":"Billboard","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_billboard","value":20,"channelid":"55"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/838ba61ea8d3fd1f0b0bf15d334e251f95ca5f52.jpg","name":"成名曲","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_chengmingqu","value":5,"channelid":"48"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/29381f30e924b8991a462a5f6d061d950a7bf65b.jpg","name":"网络歌曲","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_wangluo","value":9,"channelid":"51"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d439b6003af33a871d2b537dc55c10385343b517.jpg","name":"开车","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_kaiche","value":21,"channelid":"42"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/0e2442a7d933c89550c6cb1cd21373f082020018.jpg","name":"影视","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_yingshi","value":31,"channelid":"57"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8b13632762d0f7035531c6bb0bfa513d2797c5d2.jpg","name":"随便听听","cate_name":"tuijian","cate_sname":"推荐频道","ch_name":"public_tuijian_suibiantingting","value":12,"channelid":"1"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/060828381f30e9240a58cf564f086e061c95f7dd.jpg","name":"经典老歌","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_jingdianlaoge","value":2,"channelid":"3"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/4ec2d5628535e5ddf8d5f6b875c6a7efcf1b62df.jpg","name":"70后","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_70hou","value":25,"channelid":"43"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/6a63f6246b600c3367818daf194c510fd8f9a1d9.jpg","name":"80后","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_80hou","value":7,"channelid":"2"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/242dd42a2834349be8ae3de2caea15ce36d3be29.jpg","name":"90后","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_90hou","value":10,"channelid":"25"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/0e2442a7d933c8955088cb1cd21373f0830200e6.jpg","name":"火爆新歌","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_xinge","value":15,"channelid":"6"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/b151f8198618367a7e792cba2d738bd4b21ce5e1.jpg","name":"儿歌","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_erge","value":34,"channelid":"24"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/dbb44aed2e738bd41bcce156a28b87d6267ff9ec.jpg","name":"旅行","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_lvxing","value":35,"channelid":"16"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/024f78f0f736afc3f7176d02b019ebc4b74512b9.jpg","name":"夜店","cate_name":"shiguang","cate_sname":"时光频道","ch_name":"public_shiguang_yedian","value":17,"channelid":"41"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8ad4b31c8701a18b2dfa40289d2f07082838fe40.jpg","name":"流行","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_liuxing","value":6,"channelid":"46"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/1f178a82b9014a906c3514daaa773912b31bee4a.jpg","name":"摇滚","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_yaogun","value":24,"channelid":"10"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d833c895d143ad4b536214a781025aafa40f060c.jpg","name":"民谣","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_minyao","value":33,"channelid":"60"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8b82b9014a90f603e8b3ce203a12b31bb051ed52.jpg","name":"轻音乐","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_qingyinyue","value":14,"channelid":"29"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/f703738da97739122dd1d706fb198618377ae2e6.jpg","name":"小清新","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_xiaoqingxin","value":23,"channelid":"49"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d62a6059252dd42ac0e553cc003b5bb5c8eab8ed.jpg","name":"中国风","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_zhongguofeng","value":30,"channelid":"53"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/0824ab18972bd40743e88e9a78899e510fb309ad.jpg","name":"DJ舞曲","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_dj","value":11,"channelid":"50"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/cb8065380cd7912368c9c913ae345982b2b780a8.jpg","name":"电影","cate_name":"fengge","cate_sname":"风格频道","ch_name":"public_fengge_dianyingyuansheng","value":29,"channelid":"38"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/6c224f4a20a44623d811f7059b22720e0df3d7fa.jpg","name":"轻松假日","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_qingsongjiari","value":18,"channelid":"40"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/bf096b63f6246b60d111ef13e8f81a4c510fa2be.jpg","name":"欢快旋律","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_huankuai","value":11,"channelid":"4"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/c995d143ad4bd113f1d6ea5559afa40f4bfb05b9.jpg","name":"甜蜜感受","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_tianmi","value":26,"channelid":"17"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/08f790529822720ed8dbbf9d78cb0a46f21fab44.jpg","name":"寂寞","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_jimo","value":27,"channelid":"37"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/7acb0a46f21fbe09b1349e7368600c338744ad6b.jpg","name":"单身情歌","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_qingge","value":28,"channelid":"56"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/342ac65c103853430cadda469013b07eca808873.jpg","name":"舒缓节奏","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_shuhuan","value":13,"channelid":"11"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/5882b2b7d0a20cf437cea3b875094b36acaf997e.jpg","name":"慵懒午后","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_yonglanwuhou","value":22,"channelid":"19"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/e850352ac65c1038a52693a5b1119313b07e8979.jpg","name":"伤感","cate_name":"xinqing","cate_sname":"心情频道","ch_name":"public_xinqing_shanggan","value":16,"channelid":"36"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/5ab5c9ea15ce36d33b50de5739f33a87e950b105.jpg","name":"华语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_huayu","value":1,"channelid":"32"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/279759ee3d6d55fb785d2b416e224f4a20a4dd3a.jpg","name":"欧美","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_oumei","value":8,"channelid":"33"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/8694a4c27d1ed21b66857382ae6eddc451da3f0c.jpg","name":"日语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_riyu","value":38,"channelid":"34"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/10dfa9ec8a136327ddd49e54928fa0ec08fac798.jpg","name":"韩语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_hanyu","value":32,"channelid":"44"},{"thumb":"http://hiphotos.qianqian.com/ting/pic/item/d50735fae6cd7b89e7e067e40c2442a7d8330ecc.jpg","name":"粤语","cate_name":"yuzhong","cate_sname":"语种频道","ch_name":"public_yuzhong_yueyu","value":19,"channelid":"18"}]
         * title : 公共频道
         * cid : 1
         */

        private String title;
        private int cid;
        private List<ChannellistBean> channellist;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public List<ChannellistBean> getChannellist() {
            return channellist;
        }

        public void setChannellist(List<ChannellistBean> channellist) {
            this.channellist = channellist;
        }

        public static class ChannellistBean {
            /**
             * thumb : http://hiphotos.qianqian.com/ting/pic/item/838ba61ea8d3fd1fb4912e42354e251f95ca5f2a.jpg
             * name : 漫步春天
             * cate_name : tuijian
             * cate_sname : 推荐频道
             * ch_name : public_tuijian_spring
             * value : 1000000
             * channelid : 62
             */

            private String thumb;
            private String name;
            private String cate_name;
            private String cate_sname;
            private String ch_name;
            private int value;
            private String channelid;

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCate_name() {
                return cate_name;
            }

            public void setCate_name(String cate_name) {
                this.cate_name = cate_name;
            }

            public String getCate_sname() {
                return cate_sname;
            }

            public void setCate_sname(String cate_sname) {
                this.cate_sname = cate_sname;
            }

            public String getCh_name() {
                return ch_name;
            }

            public void setCh_name(String ch_name) {
                this.ch_name = ch_name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public String getChannelid() {
                return channelid;
            }

            public void setChannelid(String channelid) {
                this.channelid = channelid;
            }
        }
    }
}
