package com.esri.gw;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class S3ConnectionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testS3Connection() {
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(Contants.AWSAccessKeyId, Contants.AWSSecretKey);
		
		AmazonS3 s3Client = new AmazonS3Client(awsCreds);
		
		List<Bucket> buckets = s3Client.listBuckets();
		
		for(Bucket bk : buckets) {
			System.out.println(bk);
			
		}
		ObjectListing ols = s3Client.listObjects("mybucket3150");
		List<S3ObjectSummary> os = ols.getObjectSummaries();
		System.out.println(os);
		for(S3ObjectSummary ss : os) {
			System.out.println("etag:" + ss.getETag());
			System.out.println("key:" + ss.getKey());
			System.out.println("size:" + ss.getSize());
			System.out.println("StorageClass:" + ss.getStorageClass());
			System.out.println("LastModified:" + ss.getLastModified());
			System.out.println("--------------------------------------------");
			
		}
		GetObjectRequest getObjectRequest = new GetObjectRequest("mybucket3150", "newfolder/H3C虚拟机详情.txt");
		S3Object s3o = s3Client.getObject(getObjectRequest);
		
		S3ObjectInputStream  s3ois = s3o.getObjectContent();
		StringBuffer sb = new StringBuffer();
		byte[] bytes = new byte[2048];
		try {
			int index = s3ois.read(bytes);
			String content = new String(bytes);
			System.out.println("index:" + index);
			System.out.println("content" + content);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		UploadPartRequest request = new UploadPartRequest();
//		request.setBucketName("mybucket3150");
//		request.setKey("001");
//		request.setUploadId("002");
//		request.setFile(new File("D:/AWS/aws-sdk-java-dg.pdf"));
//		s3Client.uploadPart(request);
	}

}
