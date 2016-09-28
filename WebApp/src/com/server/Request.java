package com.server;

import java.io.IOException;
import java.io.InputStream;
/**
 * 
 * @author Request类表示一个HTTP请求，可以传递InputStream对象来创建Request对象
 * 可以调用InputStream对象中的read（）方法，来读取HTTP请求的原始数据
 *
 */
public class Request {
	private InputStream input;
	private String uri;
	public Request(InputStream input){
		this.input = input;
	}
/**
 * parse方法用于解析Http请求的原始数据，parse方法会调用parseUri方法来解析HTTP请求的URI
 */
	public void parse(){
		StringBuffer request = new StringBuffer(2048);
		int i;
		byte[] buffer = new byte[2048];
		try {
			i = input.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			i = -1;
		}
		for(int j = 0;j<i;j++){
			request.append((char)buffer[j]);
		}
		System.out.print(request.toString());
		uri = parseUri(request.toString());
	}
/**
* 
* requestString形式如下：
* GET /index.html HTTP/1.1
* Host: localhost:8080
* Connection: keep-alive
* Cache-Control: max-age=0
* ...
* 该函数目的就是为了获取/index.html字符串
*/
	private String parseUri(String requestString) {
		int index1,index2;
		index1 = requestString.indexOf(" ");
		if(index1!=-1){
			index2 = requestString.indexOf(" ",index1+1);
			if(index2>index1){
				return requestString.substring(index1+1,index2);
			}
		}
		return null;
	}
/**
* 
* @return 调用公共方法getUri会返回请求的uri
*/
	public String getUri(){
		return this.uri;
	}
}
