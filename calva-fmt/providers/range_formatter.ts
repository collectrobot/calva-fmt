import * as vscode from 'vscode';
import * as formatter from '../format';


export class RangeEditProvider implements vscode.DocumentRangeFormattingEditProvider {
    provideDocumentRangeFormattingEdits(document: vscode.TextDocument, range: vscode.Range, _options: vscode.FormattingOptions, _token: vscode.CancellationToken) {
        console.log("RangeEditProvider!!",document,range,_options,_token)
        if (range.start.line == range.end.line) { // 表示是== 或者选择的是一行
            // console.log("oneline....") // 这里通过执行命令formaCurPositionForm命令来执行和tab相同的格式代码
            vscode.commands.executeCommand('calva-fmt.formaCurPositionForm')
            // formatter.formatPositionCommand();
        } else {
            return formatter.formatRangeEdits(document, range);
        }
    }
}
