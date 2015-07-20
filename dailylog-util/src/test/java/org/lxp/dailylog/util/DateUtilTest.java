package org.lxp.dailylog.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lxp.dailylog.util.DateUtil;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Super.Li
 * @since 2015年7月19日
 */
@RunWith(MockitoJUnitRunner.class)
public class DateUtilTest {

  @Test
  public void testNow() {
    Assert.assertNotNull(DateUtil.now());
  }

}