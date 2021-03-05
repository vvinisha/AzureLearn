package com.csg.azure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwitterStickerCountTest {
	private TwitterStickerCount stickerCount;
	
	@Before
	public void setup(){
		stickerCount = new TwitterStickerCount();
	}

	@Test
	public void testHappyPath(){
		int count = stickerCount.twitter_stickers("WRITE WIT TWITWITTW WITT");
		assertEquals(4, count);
	}
	
	@Test
	public void test_nonTwitter_Characters(){
		int count = stickerCount.twitter_stickers("TEST");
		assertEquals(0, count);
	}
}
