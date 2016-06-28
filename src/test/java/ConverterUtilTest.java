import java.util.Date;

import org.apache.axis2.databinding.utils.ConverterUtil;
import org.junit.Test;

public class ConverterUtilTest
{

    @Test
    public void testConvertUtil()
    {
        String dateTime = "2016-06-27T15:19:01+02:00";
        Date d = ConverterUtil.convertToDate(dateTime);
        System.out.println(d);
        assert d.toString().equals("Mon Jun 27 15:19:01 CEST 2016");
    }
    
}
