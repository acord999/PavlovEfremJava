import org.json.JSONObject;

public class SqlQueryBuilder {
    public static void main(String[] args) {
        String sqlQuery = "select * from students where ";
        String jsonData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        JSONObject jsonObject = new JSONObject(jsonData);
        StringBuilder whereClause = new StringBuilder();

        // Проверяем наличие ключей в json-объекте и добавляем условия в whereClause
        if (jsonObject.has("name")) {
            whereClause.append("name = '").append(jsonObject.getString("name")).append("' AND ");
        }
        if (jsonObject.has("country")) {
            whereClause.append("country = '").append(jsonObject.getString("country")).append("' AND ");
        }
        if (jsonObject.has("city")) {
            whereClause.append("city = '").append(jsonObject.getString("city")).append("' AND ");
        }
        if (jsonObject.has("age") && !jsonObject.getString("age").equals("null")) {
            whereClause.append("age = ").append(jsonObject.getInt("age")).append(" AND ");
        }

        // Удаляем последний "AND" из строки whereClause
        if (whereClause.length() > 0) {
            whereClause.delete(whereClause.length() - 5, whereClause.length());
        }

        // Соединяем часть WHERE с исходным sql-запросом
        String finalSqlQuery = sqlQuery + whereClause.toString();

        System.out.println(finalSqlQuery);
    }
}
