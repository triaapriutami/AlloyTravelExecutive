package mobile.skripsi.alloytravelexecutive.service;

/**
 *
 * <p>
 * this class for extend class service
 * please, do not change or editing this class
 */
public class BaseService<T> {

    private Class<T> c;

    protected BaseService() {
    }

    /**
     * get api from retrofit building
     *
     * @return
     */
    public T getApi() {
        return ApiConfig.getInstance().create(c);
    }

    /**
     * set type class interface api
     *
     * @param c
     */
    public void setApi(Class<T> c) {
        this.c = c;
    }
}
