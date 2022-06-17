<!DOCTYPE html>
<html>
    <head>
        <title>Second Query Outputs</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>Average of each Question’s "Data_Value" by year for female only</h2>

        <table>
            <tr>
                <th>Question</th>
                <th>Year</th>
                <th>Gender</th>
                <th>Average of Data_Value</th>
            </tr>

            <#list secondQueryOutputs as secondQueryOutput>
                <tr>
                    <td>${secondQueryOutput.question}</td>
                    <td>${secondQueryOutput.yearstart}</td>
                    <td>${secondQueryOutput.gender}</td>
                    <td>${secondQueryOutput.avg_data_value}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>
