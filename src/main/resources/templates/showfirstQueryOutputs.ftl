<!DOCTYPE html>
<html>
    <head>
        <title>First Query Outputs</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>Average of each Question’s "Data_Value" by year for all age groups</h2>

        <table>
            <tr>
                <th>Question</th>
                <th>Year</th>
                <th>Age-Group</th>
                <th>Average of Data_Value</th>
            </tr>

            <#list firstQueryOutputs as firstQueryOutput>
                <tr>
                    <td>${firstQueryOutput.question}</td>
                    <td>${firstQueryOutput.yearstart}</td>
                    <td>${firstQueryOutput.age_in_months}</td>
                    <td>${firstQueryOutput.avg_data_value}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>
