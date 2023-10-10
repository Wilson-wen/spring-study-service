package org.springstudy.factory.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 定义 Resource 接口，提供获取 InputStream 流的方法
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
