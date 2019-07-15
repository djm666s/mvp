package com.example.mvp.model.Imp;

import com.example.mvp.model.VideoModel;
import com.example.mvp.bean.VideoBean;

import java.util.ArrayList;
import java.util.List;

public class VideoModelImp implements VideoModel {
    @Override
    public List<VideoBean> getData() {
        List<VideoBean> list = new ArrayList<>();
        String[] url = {"https://anchorpost.msstatic.com/cdnimage/anchorpost/1077/33/c337112db94df665576b6dda277c0b_5485_1562592329.jpg?imageview/4/0/w/338/h/190/blur/1"
                , "http://live-cover.msstatic.com/huyalive/1446428709-1446428709-6212364001150500864-125744198-10057-A-0-1/20190712164049.jpg?x-oss-process=image/resize,limit_0,m_fill,w_338,h_190/sharpen,80/format,jpg/interlace,1/quality,q_90"
                , "https://anchorpost.msstatic.com/cdnimage/anchorpost/1037/18/1abc9d649e55bf429983bd7be685c6_1663_1562637157.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp"
                , "https://anchorpost.msstatic.com/cdnimage/anchorpost/1012/5d/d9778cd95a0d566ccc1238139182de_1663_1561977052.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1013/a7/5ea25eaf872e343d14c7a34271d8af_1663_1561968377.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp"
                , "https://anchorpost.msstatic.com/cdnimage/anchorpost/1052/a8/997689c4cec3255ce07640abdec8d8_1663_1560765196.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp"};
        String[] title = {"云顶之弈-世界前3/全球吃鸡第一239鸡",
                "祝秋枫姐生日快乐~",
                "GRF vs GEN LCK夏季赛",
                "黑色玫瑰有车位一起玩~",
                "萝莉酱：来砸键盘了哦 ",
                "成都小可爱，一等四"};
        for (int i = 0; i < title.length; i++) {
            list.add(new VideoBean(url[i], title[i]));
        }
        return list;
    }

    @Override
    public List<VideoBean> Yunding() {
        List<VideoBean> list = new ArrayList<>();
        String[] url = {"https://anchorpost.msstatic.com/cdnimage/anchorpost/1077/33/c337112db94df665576b6dda277c0b_5485_1562592329.jpg?imageview/4/0/w/338/h/190/blur/1",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1065/e8/0b3d189af414d85db9e11423351715_5485_1562667696.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1033/15/50ac55458d45e00af98d30d9b77aa9_2168_1559805424.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1054/80/f04a2b8c813c1a142465a2b02f1bf9_2168_1562235520.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://huyaimg.msstatic.com/cdnimage/anchorpost/1023/f5/0bb1f1e3e643ac1edcf163e5258cb1_2168_1553683145.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1071/b8/89343b199e61c4bef1d1c7e724e146_2168_1561020541.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp"};
        String[] title = {"云顶之弈-世界前3/全球吃鸡第一239鸡",
                "云顶之弈：全球前三王者  带你们玩转电一",
                "飘荡在上海的孤儿"
                , "1点公会战 抬一手biu~",
                "距离你50米",
                "长腿舞蹈主播"};
        for (int i = 0; i < url.length; i++) {
            list.add(new VideoBean(url[i], title[i]));
        }
        return list;
    }

    @Override
    public List<VideoBean> NvSheng() {
        List<VideoBean> list = new ArrayList<>();
        String[] url = {"https://anchorpost.msstatic.com/cdnimage/anchorpost/1068/41/ba17447a1ec652895aa3977565b180_1663_1562928776.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://huyaimg.msstatic.com/cdnimage/anchorpost/1093/9c/9deb5bfd04fca1211aa97411fd47dd_1663_1541912819.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://huyaimg.msstatic.com/cdnimage/anchorpost/1051/51/d948bb6c3c323fba5ddd5890ee86f3_1663_1551795024.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1075/9c/0bf7b3a516eedd76c5fac75c6a28a1_1663_1560750584.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1085/f8/3e56954505d508f3759a9ee9deae93_1663_1558494057.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp",
                "https://anchorpost.msstatic.com/cdnimage/anchorpost/1052/a8/997689c4cec3255ce07640abdec8d8_1663_1560765196.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp"};
        String[] title = {"关注小尾巴生日小叶子周年庆~",
                "潮汕小姐姐~",
                "一点工会战求助力巴啦啦!（免费差消费）"
                , "著名演员迪丽热依，山东",
                "悄咪咪的我来了",
                "感谢家人"};
        for (int i = 0; i < url.length; i++) {
            list.add(new VideoBean(url[i], title[i]));
        }
        return list;
    }

    @Override
    public List<String> getUlrPath() {
        List<String> list=new ArrayList<>();
        list.add("https://anchorpost.msstatic.com/cdnimage/anchorpost/1093/9c/9deb5bfd04fca1211aa97411fd47dd_1663_1541912819.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp");
        list.add("https://anchorpost.msstatic.com/cdnimage/anchorpost/1051/51/d948bb6c3c323fba5ddd5890ee86f3_1663_1551795024.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp");
        list.add("https://anchorpost.msstatic.com/cdnimage/anchorpost/1085/f8/3e56954505d508f3759a9ee9deae93_1663_1558494057.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp");
        list.add("https://anchorpost.msstatic.com/cdnimage/anchorpost/1052/a8/997689c4cec3255ce07640abdec8d8_1663_1560765196.jpg?imageview/4/0/w/338/h/190/blur/1/format/webp");
        return list;
    }
}
