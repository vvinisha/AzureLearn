package com.csg.azure;

/*
 * Returns the number of Twitter stickers needed to cut up to recreate the input string
 * Function returns 0 when input phrase is comprised of characters other than "Twitter"
 */
public class TwitterStickerCount {
	
	public int twitter_stickers(String word){
		String sb = "TWITTER";
		word = word.replace(" ", "");
		int stickerCount = 1;	
		for(int i=0; i < word.length() -1 ; i++){
			if("TWITTER".indexOf(word.charAt(i)) == -1){
				return 0;
			}
			if(sb.indexOf(word.charAt(i)) != -1){
				sb = sb.replaceFirst(String.valueOf(word.charAt(i)), "");
			}else{
				sb = "TWITTER";
				stickerCount++;
			}
		}
		
		return stickerCount;
	}

}
