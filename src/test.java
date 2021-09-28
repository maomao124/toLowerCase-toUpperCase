/**
 * Project name(项目名称)：字符串大小写转换
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/28
 * Time(创建时间)： 18:58
 * Version(版本): 1.0
 * Description(描述)：
 * String 类的 toLowerCase() 方法可以将字符串中的所有字符全部转换成小写，而非字母的字符不受影响。语法格式如下：
 * 字符串名.toLowerCase()    // 将字符串中的字母全部转换为小写，非字母不受影响
 * toUpperCase() 则将字符串中的所有字符全部转换成大写，而非字母的字符不受影响。语法格式如下：
 * 字符串名.toUpperCase()    // 将字符串中的字母全部转换为大写，非字母不受影响
 */

public class test
{
    public static void main(String[] args)
    {
        String en;
        en = "You are pig";
        System.out.println("原始字符串：" + en);
        System.out.println("转换后：" + en.toLowerCase());
        System.out.println("大写：" + en.toUpperCase());
        en = "sun sun 是太阳，圆圆挂在 SKY 上";    // 定义原始字符串
        System.out.println("原始字符串：" + en);
        System.out.println("使用 toLowerCase() 方法之后为：" + en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为：" + en.toUpperCase());

        en = "select id,name,sex,address,birthday from students";
        System.out.println("原始字符串：" + en);    // 定义原始字符串
        System.out.println("使用 toLowerCase() 方法之后为：" + en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为：" + en.toUpperCase());
    }
}
