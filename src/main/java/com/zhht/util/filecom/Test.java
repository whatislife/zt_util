package com.zhht.util.filecom;

public class Test {
	public static void main(String[] args) {
		String localPath = ConfigApi.LOCAL_PATH;
		String remotePath = ConfigApi.REMOTE_PATH;
		String base = ConfigApi.BASE;
		String cps = ConfigApi.CPS;
		System.out.println("~~~~~~~~~~~~~~~~~~基础开始~~~~~~~~~~~~~~~~~~~~~");
		String[] bases = base.split(",");
		for(int i = 0 ; i < bases.length;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("验证-"+bases[i]+"-文件start");
			FileUtil.isSameFile(bases[i], localPath+bases[i], remotePath+bases[i]);
			System.out.println("验证-"+bases[i]+"-文件end");
			System.out.println("=============================================");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~CPS开始~~~~~~~~~~~~~~~~~~~~~");
		String[] cpss = cps.split(",");
		for(int j = 0 ; j < cpss.length;j++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("验证-"+cpss[j]+"-文件start");
			FileUtil.isSameFile(bases[j], localPath+cpss[j], remotePath+cpss[j]);
			System.out.println("验证-"+cpss[j]+"-文件end");
			System.out.println("=============================================");
		}
		
	}
}
