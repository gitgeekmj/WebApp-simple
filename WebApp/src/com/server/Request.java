package com.server;

import java.io.IOException;
import java.io.InputStream;
/**
 * 
 * @author Request���ʾһ��HTTP���󣬿��Դ���InputStream����������Request����
 * ���Ե���InputStream�����е�read��������������ȡHTTP�����ԭʼ����
 *
 */
public class Request {
	private InputStream input;
	private String uri;
	public Request(InputStream input){
		this.input = input;
	}
/**
 * parse�������ڽ���Http�����ԭʼ���ݣ�parse���������parseUri����������HTTP�����URI
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
* requestString��ʽ���£�
* GET /index.html HTTP/1.1
* Host: localhost:8080
* Connection: keep-alive
* Cache-Control: max-age=0
* ...
* �ú���Ŀ�ľ���Ϊ�˻�ȡ/index.html�ַ���
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
* @return ���ù�������getUri�᷵�������uri
*/
	public String getUri(){
		return this.uri;
	}
}
