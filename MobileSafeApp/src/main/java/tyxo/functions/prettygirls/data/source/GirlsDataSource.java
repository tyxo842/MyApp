package tyxo.functions.prettygirls.data.source;


import tyxo.functions.prettygirls.data.bean.GirlsBean;

/**
 * Created by oracleen on 2016/6/29.
 */
public interface GirlsDataSource {

    interface LoadGirlsCallback {

        void onGirlsLoaded(GirlsBean girlsBean);

        void onDataNotAvailable();
    }

    void getGirls(int page, int size, LoadGirlsCallback callback);

    void getGirl(LoadGirlsCallback callback);
}
