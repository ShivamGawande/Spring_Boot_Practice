package com.shivam.rest_api.dto;

public class Consumer_Device {
	
	  private String id;
	    private String name;
	    private Consumer_DeviceData data;

	    public Consumer_Device(String id, String name, Consumer_DeviceData data) {
			super();
			this.id = id;
			this.name = name;
			this.data = data;
		}

		public Consumer_Device() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Consumer_DeviceData getData() {
	        return data;
	    }

	    public void setData(Consumer_DeviceData data) {
	        this.data = data;
	    }

		@Override
		public String toString() {
			return "Consumer_Device [id=" + id + ", name=" + name + ", data=" + data + "]";
		}
}
