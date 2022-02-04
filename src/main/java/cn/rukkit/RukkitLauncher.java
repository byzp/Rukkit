/*
 * Copyright 2020-2022 RukkitDev Team and contributors.
 *
 * This project uses GNU Affero General Public License v3.0.You can find this license in the following link.
 * 本项目使用 GNU Affero General Public License v3.0 许可证，你可以在下方链接查看:
 *
 * https://github.com/RukkitDev/Rukkit/blob/master/LICENSE
 */

package cn.rukkit;
import java.io.*;
import org.slf4j.*;
import io.netty.util.internal.logging.*;

public class RukkitLauncher
{
	public static void main(String args[]){
		InternalLoggerFactory.setDefaultFactory(new Slf4JLoggerFactory());
		try {
			Rukkit.startServer();
		} catch (IOException e) {
			//e.printStackTrace();
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}
	
}
