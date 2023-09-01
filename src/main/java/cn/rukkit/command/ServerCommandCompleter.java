/*
 * Copyright 2020-2022 RukkitDev Team and contributors.
 *
 * This project uses GNU Affero General Public License v3.0.You can find this license in the following link.
 * 本项目使用 GNU Affero General Public License v3.0 许可证，你可以在下方链接查看:
 *
 * https://github.com/RukkitDev/Rukkit/blob/master/LICENSE
 */

package cn.rukkit.command;

import org.jline.reader.Candidate;
import org.jline.reader.Completer;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;
import org.jline.reader.impl.completer.StringsCompleter;

import java.util.List;

public class ServerCommandCompleter implements Completer {

    Completer completer;

    public ServerCommandCompleter() {
        this.completer = new StringsCompleter();
    }

    @Override
    public void complete(LineReader reader, ParsedLine line, List<Candidate> candidates) {
        completer.complete(reader, line, candidates);
    }

    public void setCommandCompleteVars(List<String> fileVars) {
        this.completer = new StringsCompleter(fileVars);
    }
}