package cn.fly.yun.base;

public class BasePageReq extends BaseReq {
    private static final long serialVersionUID = -5269264209621211622L;
    private int currentPage ;

    private int pageSize ;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
