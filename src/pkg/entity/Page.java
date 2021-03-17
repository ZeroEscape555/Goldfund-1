package pkg.entity;

public class Page {
	
	private int totalRecord; //总的记录数
	
	private int currentPageNo; //当前的页码
	
	

	private int pageSize;  //每页的记录数
	
	private String queryKey; //查询关键字
	
	
	public int getTotalPage() {
		
		return this.totalRecord/this.pageSize+1;
	
	}
	
	public int getFirst() {
		return 1;
		
	}
	
	public int getLast() {
		return this.getTotalPage();
		
	}
	
	
	
	public Page(int totalRecord, int currentPageNo, int pageSize) {
		super();
		this.totalRecord = totalRecord;
		this.currentPageNo = currentPageNo;
		this.pageSize = pageSize;
	}
	
	
	//上一页
		public int getPrev() {
			if(this.currentPageNo==1) {
				return this.currentPageNo;
			}
			else {
				return this.currentPageNo - 1;
			}
		}

	//下一页
	public int getNext() {
		
		
		if(this.currentPageNo < this.getTotalPage()) {
			
			return this.currentPageNo+1;
		}
		
		else {
			return this.currentPageNo;
		}
	}
	
	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}
	
	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
